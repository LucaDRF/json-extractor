import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DSLProcessor {

    public static void main(String[] args) throws IOException {
        String dslContent = new String(Files.readAllBytes(Paths.get("input.dsl")));
        String jsonContent = new String(Files.readAllBytes(Paths.get("data.json")));

        Extractor extractor = new Extractor(jsonContent);

        CharStream input = CharStreams.fromString(dslContent);
        JSONExtractorLexer lexer = new JSONExtractorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONExtractorParser parser = new JSONExtractorParser(tokens);
        ParseTree tree = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        JSONExtractorBaseListener listener = new JSONExtractorBaseListener() {
            @Override
            public void enterBlock(JSONExtractorParser.BlockContext ctx) {
                String section = ctx.section().getText();
                List<String> fields = ctx.fields().field().stream()
                        .map(ParseTree::getText)
                        .collect(Collectors.toList());
                List<Map<String, Object>> results = extractor.extract(section, fields);
                System.out.println("Resultados para seção " + section + ":");
                results.forEach(result -> System.out.println(result.toString()));
            }
        };
        walker.walk(listener, tree);
    }
}

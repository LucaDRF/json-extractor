import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Extractor {
    private JSONObject json;

    public Extractor(String jsonString) {
        this.json = new JSONObject(jsonString);
    }

    public List<Map<String, Object>> extract(String section, List<String> fields) {
        List<Map<String, Object>> results = new ArrayList<>();

        if (!json.has(section)) {
            Map<String, Object> error = new HashMap<>();
            error.put("error", "Seção " + section + " não encontrada no JSON.");
            results.add(error);
            return results;
        }

        Object sectionData = json.get(section);

        if (sectionData instanceof JSONArray) {
            JSONArray items = (JSONArray) sectionData;
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                Map<String, Object> result = extractFields(item, fields);
                results.add(result);
            }
        } else if (sectionData instanceof JSONObject) {
            JSONObject item = (JSONObject) sectionData;
            Map<String, Object> result = extractFields(item, fields);
            results.add(result);
        }

        return results;
    }

    private Map<String, Object> extractFields(JSONObject item, List<String> fields) {
        Map<String, Object> result = new HashMap<>();
        for (String field : fields) {
            if (item.has(field)) {
                result.put(field, item.get(field));
            } else {
                result.put(field, "Campo não encontrado");
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String jsonContent = new String(Files.readAllBytes(Paths.get("data.json")));
        Extractor extractor = new Extractor(jsonContent);

        List<String> clienteFields = Arrays.asList("doccli", "cliente");
        List<Map<String, Object>> clienteResults = extractor.extract("cliente", clienteFields);
        System.out.println("Resultados para seção cliente:");
        clienteResults.forEach(System.out::println);

        List<String> faturamentoFields = Arrays.asList("cnpj", "empresa", "faturamento_total");
        List<Map<String, Object>> faturamentoResults = extractor.extract("faturamento", faturamentoFields);
        System.out.println("Resultados para seção faturamento:");
        faturamentoResults.forEach(System.out::println);

        List<String> financeiroFields = Arrays.asList("quitado", "avencer", "vencido");
        List<Map<String, Object>> financeiroResults = extractor.extract("financeiro", financeiroFields);
        System.out.println("Resultados para seção financeiro:");
        financeiroResults.forEach(System.out::println);
    }
}

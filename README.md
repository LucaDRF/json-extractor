## Grupo
Luca de Roldão Fiorenzano
André Luís Bastos

## Inicialização
Rode o comando para inicializar classes da gramatica:

java -jar libs\antlr.jar -Dlanguage=Java JSONExtractor.g4
	ANTLR JAR: O arquivo antlr.jar é executado para processar a gramática.
	Gramática (.g4): JSONExtractor.g4 é o arquivo de entrada que contém a definição da linguagem.
	Saída: ANTLR gera vários arquivos .java baseados na gramática, que contêm o código necessário para reconhecer e analisar a linguagem definida.



Rode o comando para compilar classes:

javac -cp .;libs\json.jar;libs\antlr.jar JSONExtractor*.java DSLProcessor.java Extractor.java
	Compila os arquivos .java gerados pela ANTLR
	Converte o código Java em bytecode (.class) que pode ser executado pela Máquina Virtual Java (JVM).


Rode o comando para incializar:

java -cp .;libs\json.jar;libs\antlr.jar DSLProcessor
	A classe DSLProcessor contem um método main, que é o ponto de entrada do programa.
	Este é o estágio em que a lógica do programa realmente roda, usando as funcionalidades implementadas para processar o texto ou dados de entrada.


Entendendo o Fluxo do Programa
	Vamos decompor o que acontece do ponto de vista do programa:

	Entrada de Dados: O programa recebe uma entrada, que pode ser um texto JSON, arquivo, ou outra forma de dados.

	Tokenização: O lexer gera tokens da entrada, quebrando o texto em partes significativas com base nas regras definidas na gramática.

	Análise Sintática: O parser usa esses tokens para verificar se a estrutura da entrada está correta de acordo com as regras da gramática. Ele também constrói uma estrutura de dados (como uma árvore de sintaxe) que representa a entrada.

	Processamento: O programa pode então navegar nesta estrutura para realizar ações específicas, como extrair informações, converter formatos, ou executar comandos.

	Saída: O resultado do processamento pode ser exibido na tela, salvo em um arquivo, ou utilizado de alguma outra forma.

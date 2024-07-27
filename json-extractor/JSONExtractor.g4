grammar JSONExtractor;

// Define the entry point of the grammar
prog: block+;

// Define a block which corresponds to a section in the JSON
block: 'extrair' section '{' fields '}';

// Define the section in the JSON to extract data from
section: 'cliente' | 'limite' | 'faturamento' | 'financeiro' | 'historico_pagamentos';

// Define the fields to extract within a section
fields: field (',' field)*;
field: ID;

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;

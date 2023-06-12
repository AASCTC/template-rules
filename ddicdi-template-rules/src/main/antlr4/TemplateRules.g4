grammar TemplateRules;

// Lexer rules
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
COLON: ':';
QUOTE: '"';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
DATE: 'YYYY-mm-ddTHH:MM:SS';
EMAIL: [a-zA-Z0-9_.+-]+ '@' ([a-zA-Z0-9-]+ '.')+ [a-zA-Z0-9-.]+;
WS: [ \t\r\n]+ -> skip;

// Added lexer rule for single-line comments starting with two slashes
COMMENT: '//' ~[\r\n]* -> skip;

// Combined lexer rule for regular text and comments
TEXT: (~[\r\n])+;

// Parser rules
templateRulesDocument: header templates rules;

header: 'header' LBRACE headerFields RBRACE;

headerFields: 'name' COLON IDENTIFIER
              ('date' COLON DATE)?
              ('author' COLON authorList)?
              ('description' COLON TEXT)? ;

authorList: LBRACK (author (COMMA author)*)? RBRACK;

author: LBRACE 'name' COLON TEXT
        ('email' COLON EMAIL)? RBRACE;

templates: 'templates' LBRACE sources+ sinks+ RBRACE;

sources: 'sources' LBRACE source+ RBRACE;
sinks: 'sinks' LBRACE sink+ RBRACE;

source: 'source' LBRACE 'name' COLON TEXT 'attribute' COLON TEXT
         'category' COLON TEXT RBRACE;

sink: 'sink' LBRACE 'name' COLON TEXT method RBRACE;

method: replaceMethod | transformationMethod;

replaceMethod: 'findReplace' LBRACE match+ RBRACE;
match: 'match' LBRACE 'search' COLON TEXT
		       'replace' COLON TEXT RBRACE;
		       
transformationMethod: 'function' LBRACE 'name' COLON TEXT
		       'parameters' COLON LBRACK parameter+ RBRACK RBRACE;

parameter: LBRACK 'type' COLON TEXT 'value' COLON TEXT RBRACK;

rules: 'rules' LBRACE 'outputCategory' COLON IDENTIFIER rule+ RBRACE;

rule: 'rule' LBRACE 'source' COLON TEXT
                    'sink' COLON TEXT RBRACE;

/*
// Example DDI-CDI Template Rule
// Single-line comments like this one are valid, as long
// as they are at the beginning of the line.
header {
  name: Template Language
  date: 2023-06-12T10:30:00
  author: [
    {name: "John Doe", email: "john.doe@example.com"},
    {name: "Jane Smith", email: "jane.smith@example.com"}
  ]
  description: "A template language for generating dynamic content"
}

templates {
  sources {
    source {
      name: "Source 1"
      attribute: "attribute1"
      category: "Category1"
    }
    source {
      name: "Source 2"
      attribute: "attribute2"
      category: "Category2"
    }
  }
  
  sinks {
    sink {
      name: "Sink 1"
      findReplace {
        match {
          search: "pattern1"
          replace: "replacement1"
        }
        match {
          search: "pattern2"
          replace: "replacement2"
        }
      }
    }
    sink {
      name: "Sink 2"
      function {
        name: "transformMethod"
        parameters: [
          [type: "paramType1", value: "paramValue1"],
          [type: "paramType2", value: "paramValue2"]
        ]
      }
    }
  }
}

rules {
  outputCategory: OutputCategory1
  rule {
    source: "Category1"
    sink: "Sink 1"
  }
  rule {
    source: "Category2"
    sink: "Sink 2"
  }
}

*/

// Markup for coupling structured documents in cross-domain.
// Cross-domain basically means the document is applicable for
// different kinds of applications.
// This markup assumes the data is converted into structured data.
// If not, you can use Jupyter notebooks and NLP for that purpose.

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

templates: 'templates' LBRACE namespaces+ sources+ sinks+ RBRACE;

// A namespace contains a list of entities, or types. Here, shorthands for
// namespaces are defined to shorten them to something reasonable, for example:
// <http://xmlns.com/foaf/0.1/> to foaf: (do not include the colon)
namespaces: 'namespaces' LBRACE namespace+ RBRACE;

namespace: 'namespace' LBRACE 'name' COLON TEXT
         'alias' COLON IDENTIFIER RBRACE;

// Sources are elements which match a particular label. It should be specified
// in the form of "namespace:label". For instance, foaf:name is valid (where foaf:
// is an alias), wd:Q1 is also valid, where wd: is shorthand for
// <https://www.wikidata.org/entity/>, in other words the "Universe" entity, and
// so on. 
sources: 'sources' LBRACE source+ RBRACE;

source: 'source' LBRACE 'name' COLON TEXT
         'label' COLON TEXT RBRACE;

// Sinks describe which label an element is turned into, and supplies a function
// to do the transformation.
// The transformation function is supposed to turn the input label value into a
// value that is compatible with the output label.
sinks: 'sinks' LBRACE sink+ RBRACE;

sink: 'sink' LBRACE 'name' COLON TEXT 
         'label' COLON TEXT
         method RBRACE;

// The first parameter to the function is always the input element.
// All parameters are passed as type "string", and conversion to
// the appropriate type can be done within the compiler
method: 'transform' COLON LBRACE 'name' COLON TEXT
		 'parameters' COLON parameters RBRACE;

parameters: LBRACK TEXT (COMMA TEXT)+ RBRACK;

// Rules describe a mapping between sources and sinks.
// XSLT is used to convert one element into another element.
// The script is converted into XSLT.
// Rules also contain an xpath which is a way to specify where in the XML to insert
// the generated element. Elements will always be appended after elements with identical
// xpaths.
rules: 'rules' LBRACE rule+ RBRACE;

rule: 'rule' LBRACE 'path' COLON TEXT 
					'source' COLON TEXT
                    'sink' COLON TEXT RBRACE;

/*
// Example DDI-CDI Template Rule
// Single-line comments like this one are valid, as long
// as they are at the beginning of the line.
header {
  name: Template Language
  date: 2023-06-12T10:30:00
  author: [
    {
    	name: John Doe,
    	email: john.doe@example.com
    },
    {
    	name: Jane Smith,
    	email: jane.smith@example.com
    }
  ]
  
  // Comments can also be preceded by whitespace.
  description: "A template language for generating dynamic content"
}

templates {
  namespaces {
    namespace {
      name: wd
      alias: <https://www.wikidata.org/entity/>
    }
  }
  sources {
    source {
      name: Source1
      label: wd:Q1
    }
    source {
      name: Source2
      label: wd:Q42
    }
  }
  
  sinks {
    sink {
      name: Sink1
      label: wd:Q2
      transform: {
        name: method1
        parameters: [
          Param1,
          Param2
        ]
      }
    }
    sink {
      name: Sink2
      label: wd:Q5
      transform: {
        name: method2
        parameters: [
          Param1,
          Param2
        ]
      }
    }
  }


rules {
  rule {
    xpath: root/element
    source: Source1
    sink: Sink1
  }
  rule {
    xpath: root/element2
    source: Source2
    sink: Sink2
  }
}

*/

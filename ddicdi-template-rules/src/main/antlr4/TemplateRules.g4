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
TRUE: 'true';
FALSE: 'false';
BOOLEAN: TRUE | FALSE;
WS: [ \t\r\n]+ -> skip;

// Added lexer rule for single-line comments starting with two slashes
COMMENT: '//' ~[\r\n]* -> skip;

// Combined lexer rule for regular text and comments
TEXT: (~[\r\n])+;


methodProgram: methodStatement+;

methodStatement: (methodAssignment ';')
               | (methodExpression ';')
               | methodConditional
               | methodForEachLoop
               | (methodReturn ';')
               ;

methodAssignment: IDENTIFIER '->' methodType '=' methodExpression;

methodReturn: 'return' methodExpression;

methodExpression: methodPrimaryExpression
                | methodFunctionCall
                | methodPropertyAccess
                ;

methodPrimaryExpression: intConstant
                       | floatConstant
                       | stringConstant
                       | IDENTIFIER
                       | '(' methodExpression ')'
                       ;

intConstant: INT ('->' methodType)? ;
floatConstant: FLOAT ('->' methodType)? ;
stringConstant: STRING ('->' methodType)? ;

methodFunctionCall: IDENTIFIER '(' methodArgumentList? ')';

methodArgumentList: methodExpression (',' methodExpression)*;

methodPropertyAccess: IDENTIFIER ('.' IDENTIFIER)+;

methodConditional: methodIfBlock (methodElseIfBlock)* (methodElseBlock)?;

methodIfBlock: 'if' '(' methodExpression ')' '{' methodStatement+ '}';

methodElseIfBlock: 'else' 'if' '(' methodExpression ')' '{' methodStatement+ '}';

methodElseBlock: 'else' '{' methodStatement+ '}';

methodForEachLoop: 'foreach' '(' IDENTIFIER ':' methodRange ')' '{' methodStatement+ '}';

methodRange: INT '..' INT;

methodType: (IDENTIFIER | '<' URI '>') ':' IDENTIFIER;

URI: ~[<>]+;

INT: [0-9]+;

FLOAT: INT '.' INT;

STRING: '"' TEXT '"' ;

// Parser rules
templateRulesDocument: header templates rules;

header: 'header' LBRACE headerFields RBRACE;

headerFields: 'name' COLON headerName
              ('date' COLON headerDate)?
              ('author' COLON headerAuthorList)?
              ('description' COLON headerDescription)? ;

headerName: IDENTIFIER;
headerDate: DATE;
headerAuthorList: LBRACK (headerAuthor (COMMA headerAuthor)*)? RBRACK;

headerAuthor: LBRACE 'name' COLON headerAuthorName
        ('email' COLON headerAuthorEmail)? RBRACE;


headerAuthorName: TEXT;
headerAuthorEmail: EMAIL;
headerDescription: TEXT;

templates: 'templates' LBRACE namespaces methods RBRACE;

// A namespace contains a list of entities, or types. Here, shorthands for
// namespaces are defined to shorten them to something reasonable, for example:
// <http://xmlns.com/foaf/0.1/> to foaf: (do not include the colon)
namespaces: 'namespaces' LBRACE namespace+ RBRACE;

namespace: 'namespace' LBRACE 'name' COLON namespaceName
         'alias' COLON namespaceAlias RBRACE;

namespaceName: TEXT;
namespaceAlias: TEXT;

// Types should be specified in the form of "namespace:label". For instance,
// foaf:name is valid (where foaf: is an alias), wd:Q1 is also valid, where wd:
// is shorthand for <https://www.wikidata.org/entity/>, in other words the
// "Universe" entity, and so on. 

// An element matching the input type at a particular location is sent into a
// method that transforms it into another data type.
// Multiple parameters are supported - the first parameter to the function is
// always the input element.
// The method itself is written in a custom domain-specific-language (DSL) that
// resembles C, or GoLang.
methods: 'methods' LBRACE method+ RBRACE;
method: 'method' COLON LBRACE 'name' COLON methodName
         'type' COLON methodType
		 'parameters' COLON methodParameters
		 'program' COLON LBRACE methodProgram RBRACE RBRACE;

methodName: IDENTIFIER;

methodParameters: LBRACK methodParameter (COMMA methodParameter)+ RBRACK;
methodParameter: methodParameterValue '->' methodParameterType;
methodParameterType: methodType;
methodParameterValue: TEXT;

// Rules describe a transformation of an element at a particular location.
// The location is a markup-neutral string that identifies where to find an element.
// It could be an XPath, or jq for example.
rules: 'rules' LBRACE rule+ RBRACE;

rule: 'rule' LBRACE 'location' COLON ruleLocation
					'outputElement' COLON ruleOutputElement 
					'method' COLON method RBRACE;

ruleLocation: TEXT;
ruleOutputElement: IDENTIFIER;

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
    namespace {
      name: xsd
      alias: <https://www.w3.org/2001/XMLSchema#>
    }
  }
  methods {
    method {
      name: method1
      type: xsd:string // this is type for the "input" variable
      parameters: [
        constant -> xsd:int,
        constant2 -> xsd:double
      ]
      program: {
        prunechildren(input);
        a -> xsd:string = "Replaced input";
        return a;
      }
    }
    method {
      name: method2
      type: xsd:int
      parameters: []
      program: {
        return add(input, 2);
      }
    }
  }

rules {
  rule {
    location: /element
    outputElement: a
	method: method1
  }
  rule {
    location: /element2
    outputElement: aMoreDescriptiveName
    method: method2
  }
}

*/

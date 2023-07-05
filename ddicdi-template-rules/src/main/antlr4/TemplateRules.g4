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

templates: 'templates' LBRACE namespaces+ sources+ sinks+ RBRACE;

// A namespace contains a list of entities, or types. Here, shorthands for
// namespaces are defined to shorten them to something reasonable, for example:
// <http://xmlns.com/foaf/0.1/> to foaf: (do not include the colon)
namespaces: 'namespaces' LBRACE namespace+ RBRACE;

namespace: 'namespace' LBRACE 'name' COLON namespaceName
         'alias' COLON namespaceAlias RBRACE;

namespaceName: TEXT;
namespaceAlias: TEXT;

// Sources are elements which match a particular label. It should be specified
// in the form of "namespace:label". For instance, foaf:name is valid (where foaf:
// is an alias), wd:Q1 is also valid, where wd: is shorthand for
// <https://www.wikidata.org/entity/>, in other words the "Universe" entity, and
// so on. 
sources: 'sources' LBRACE source+ RBRACE;

source: 'source' LBRACE 'name' COLON sourceName
         'label' COLON sourceLabel RBRACE;

sourceName: TEXT;
sourceLabel: TEXT;

// Sinks describe which label an element is turned into, and supplies a function
// to do the transformation.
// The transformation function is supposed to turn the input label value into a
// value that is compatible with the output label.
sinks: 'sinks' LBRACE sink+ RBRACE;

sink: 'sink' LBRACE 'name' COLON sinkName 
         'label' COLON sinkLabel
         sinkMethod RBRACE;

sinkName: TEXT;
sinkLabel: TEXT;

// The first parameter to the function is always the input element.
// All parameters are passed as type "string", and conversion to
// the appropriate type can be done within the compiler
sinkMethod: 'method' COLON LBRACE 'name' COLON sinkMethodName
		 'parameters' COLON sinkMethodParameters RBRACE;

sinkMethodName: IDENTIFIER;

sinkMethodParameters: LBRACK sinkMethodParameter (COMMA sinkMethodParameter)+ RBRACK;
sinkMethodParameter: TEXT;

// Rules describe a mapping between sources and sinks.
// The location is a markup-neutral string that identifies where to find an element.
// It could be an XPath, XQuery, or SPARQL for example.
// There's also an option on whether to prune child elements, which must be explicitly
// specified.
rules: 'rules' LBRACE rule+ RBRACE;

rule: 'rule' LBRACE 'location' COLON ruleLocation 
					'source' COLON ruleSource
                    'sink' COLON ruleSink RBRACE
                    'pruneChildren' COLON rulePruneChildren;

ruleLocation: TEXT;
ruleSource: IDENTIFIER;
ruleSink: IDENTIFIER;
rulePruneChildren: BOOLEAN;

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
      method: {
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
    // Pretend that it's XPath
    location: root/element
    source: Source1
    sink: Sink1
    pruneChildren: false
  }
  rule {
    location: root/element2
    source: Source2
    sink: Sink2
    pruneChildren: false
  }
}

*/

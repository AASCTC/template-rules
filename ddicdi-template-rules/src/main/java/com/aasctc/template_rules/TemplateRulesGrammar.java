/**
 * 
 */
package com.aasctc.template_rules;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Ali Sherief
 *
 */
public interface TemplateRulesGrammar {
	public class Author {
		String name;
		String email;
		public Author() {
			name = "";
			email = "";
		}
		public Author(String inputName, String inputEmail) {
			name = inputName;
			email = inputEmail;
		}
	}

	public class Namespace {
		String name;
		String alias;
		public Namespace() {
			name = "";
			alias = "";
		}
		public Namespace(String inputName, String inputAlias) {
			name = inputName;
			alias = inputAlias;
		}
		
		public Namespace(String inputName) {
			name = inputName;
			alias = inputName;
		}
	} 
	
	public class Type {
		String schema;
		String label;
		public Type() {
			schema = "";
			label = "";
		}
		public Type(String inputSchema, String inputLabel) {
			schema = inputSchema;
			label = inputLabel;
		}
		
		// I hate this exception type but I'm on a time crunch.
		public Type(String input) throws Exception {
			String[] inputs = input.split(":");
			if (inputs.length != 2) {
				throw new Exception();
			}
			schema = inputs[0];
			label = inputs[1];
			
		}
	}
	
	public class Method {
		String name;
		List<String> parameters;
		
		public Method() {
			name = "";
			parameters = new ArrayList<String>();
		}
		public Method(String inputName, List<String> inputParameters) {
			name = inputName;
			parameters = inputParameters;
		}
		
		public Method(String inputName) {
			name = inputName;
			parameters = new ArrayList<String>();
		}
	}
	
	public class Element {
		String name;
		Type type;
		public Element() {
			name = "";
			type = new Type();
		}
		public Element(String inputName, Type inputType) {
			name = inputName;
			type = inputType;
		}
	} 
	
	public String name();
	public Map<String, String> authors();
	public String date();
	public String description();
	public List<Namespace> namespaces();
	public List<Element> sources();
	public List<Map<Element, Method>> sinks();
	//TODO make method and classes for rules()
	
	
	
}

package com.aasctc.template_rules;

import java.util.ArrayList;
import java.util.List;

import com.aasctc.template_rules.methods.MethodProgram;

public class Method {
	
	String name;
	List<String> parameters;
	MethodProgram body;
	
	public class Variable {
		String name;
		Type type;
		String value;
		
		public Variable() {}
		
		public Variable(String inputName, Type inputType, String inputValue) {
			name = inputName;
			type = inputType;
			value = inputValue;
		}
	}
	
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
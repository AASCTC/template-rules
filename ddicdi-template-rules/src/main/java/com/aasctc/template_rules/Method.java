package com.aasctc.template_rules;

import java.util.ArrayList;
import java.util.List;

import com.aasctc.template_rules.methods.MethodProgram;

public class Method {
	
	String name;
	Type type;
	List<String> parameters;
	MethodProgram program;
	
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
	public Method(String inputName, Type inputType,
			List<String> inputParameters, MethodProgram inputProgram) {
		name = inputName;
		type = inputType;
		parameters = inputParameters;
		program = inputProgram;
	}
	
	public Method(String inputName) {
		name = inputName;
		parameters = new ArrayList<String>();
		program = new MethodProgram();
	}
}
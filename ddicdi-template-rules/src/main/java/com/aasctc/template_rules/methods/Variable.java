package com.aasctc.template_rules.methods;

import com.aasctc.template_rules.Type;

class Variable {
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

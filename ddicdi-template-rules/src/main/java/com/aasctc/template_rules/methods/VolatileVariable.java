package com.aasctc.template_rules.methods;

import com.aasctc.template_rules.Type;

public class VolatileVariable {
	public Type type;
	public String value;
	
	public VolatileVariable() {}
	
	public VolatileVariable(Type inputType, String inputValue) {
		type = inputType;
		value = inputValue;
	}
	
	public Type getValue0() { return type; }
	public String getValue1() { return value; }
}


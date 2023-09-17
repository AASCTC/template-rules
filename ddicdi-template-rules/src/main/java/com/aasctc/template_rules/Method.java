package com.aasctc.template_rules;

import java.util.List;

public class Method {

	private String name;
	private List<String> paramTypes;
	
	public Method() {}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	List<String> getParamTypes() {
		return paramTypes;
	}

	void setParamTypes(List<String> paramTypes) {
		this.paramTypes = paramTypes;
	}
	
	
	
}

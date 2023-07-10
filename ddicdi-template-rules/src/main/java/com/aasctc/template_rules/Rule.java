package com.aasctc.template_rules;

public class Rule {
	String outputElement;
	Method method;
	String location;

	public Rule() {
		outputElement = "";
		method = new Method();
		location = new String();
	}
	
	public Rule(String inputOutputElement, Method inputMethod, String inputLocation) {
		outputElement = inputOutputElement;
		method = inputMethod;
		location = inputLocation;
	}
}
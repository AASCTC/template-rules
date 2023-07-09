package com.aasctc.template_rules;

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
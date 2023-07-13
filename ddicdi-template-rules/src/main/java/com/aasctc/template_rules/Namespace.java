package com.aasctc.template_rules;

public class Namespace {
	public String name;
	public String alias;
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
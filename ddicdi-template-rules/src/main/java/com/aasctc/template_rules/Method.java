package com.aasctc.template_rules;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;

import com.aasctc.template_rules.methods.MethodProgram;

public class Method {
	String name;
	Type type;
	List<Pair<Type, String>> parameters;
	MethodProgram program;
	
	public Method() {
		name = "";
		type = new Type();
		parameters = new ArrayList<Pair<Type, String>>();
		program = new MethodProgram();
	}
	public Method(String inputName, Type inputType,
			List<Pair<Type, String>> inputParameters, MethodProgram inputProgram) {
		name = inputName;
		type = inputType;
		parameters = inputParameters;
		program = inputProgram;
	}
}
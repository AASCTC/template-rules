package com.aasctc.template_rules;

import java.util.List;

import org.javatuples.Pair;

import com.aasctc.template_rules.methods.XMLMethodProgram;

//TODO override the desired TemplateRules functions
public class XMLMethod extends Method {
	XMLMethodProgram xmlProgram;
	
	public XMLMethod(String inputName, Type inputType,
			List<Pair<Type, String>> inputParameters, XMLMethodProgram inputProgram) {
		super(inputName, inputType, inputParameters, inputProgram);
		xmlProgram = inputProgram;
	}
}

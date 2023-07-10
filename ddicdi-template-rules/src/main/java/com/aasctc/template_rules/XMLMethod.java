package com.aasctc.template_rules;

import java.util.List;

import com.aasctc.template_rules.methods.XMLMethodProgram;

public class XMLMethod extends Method {
	XMLMethodProgram xmlProgram;
	
	public XMLMethod(String inputName, Type inputType,
			List<String> inputParameters, XMLMethodProgram inputProgram) {
		xmlProgram = inputProgram;
		super(inputName, inputType, inputParameters, inputProgram);
	}
}

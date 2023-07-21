package com.aasctc.template_rules;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.aasctc.template_rules.methods.XMLMethodProgram;
import com.aasctc.template_rules.antlr.TemplateRulesParser.MethodProgramContext;
import com.aasctc.template_rules.methods.IllegalAssignmentException;
import com.aasctc.template_rules.methods.UnknownTypeException;
import com.aasctc.template_rules.methods.VolatileVariable;
import com.aasctc.template_rules.methods.Variable;

//TODO override the desired TemplateRules functions
public class XMLMethod extends Method {
	public XMLMethod(String inputName, Type inputType,
			List<Variable> inputParameters,
			List<Namespace> inputNamespaces,
			MethodProgramContext inputContext) {
		super(inputName, inputType, inputParameters, inputNamespaces,
				inputContext);
	}
	
	public VolatileVariable spawnProgram(VolatileVariable input) throws UnsupportedOperationException, InvocationTargetException, NoSuchMethodException, SecurityException, IllegalAssignmentException, UnknownTypeException {
		XMLMethodProgram methodProgram = new XMLMethodProgram(context, namespaces, parameters);
		return methodProgram.Interpret(input);
	}
}

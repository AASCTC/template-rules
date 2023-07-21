package com.aasctc.template_rules;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.aasctc.template_rules.antlr.TemplateRulesParser.MethodProgramContext;
import com.aasctc.template_rules.methods.IllegalAssignmentException;
import com.aasctc.template_rules.methods.MethodProgram;
import com.aasctc.template_rules.methods.UnknownTypeException;
import com.aasctc.template_rules.methods.VolatileVariable;
import com.aasctc.template_rules.methods.Variable;

public class Method {
	String name;
	Type type;
	List<Variable> parameters;
	List<Namespace> namespaces;
	MethodProgramContext context;
	
	public Method() {
		name = "";
		type = new Type();
		parameters = new ArrayList<Variable>();
		namespaces = new ArrayList<Namespace>();
		context = null;
	}
	public Method(String inputName, Type inputType,
			List<Variable> inputParameters,
			List<Namespace> inputNamespaces,
			MethodProgramContext inputContext) {
		name = inputName;
		type = inputType;
		parameters = inputParameters;
		namespaces = inputNamespaces;
		context = inputContext;
	}
	
	public VolatileVariable spawnProgram(VolatileVariable input) throws UnsupportedOperationException, InvocationTargetException, NoSuchMethodException, SecurityException, IllegalAssignmentException, UnknownTypeException {
		MethodProgram methodProgram = new MethodProgram(context, namespaces, parameters);
		return methodProgram.Interpret(input);
	}
}
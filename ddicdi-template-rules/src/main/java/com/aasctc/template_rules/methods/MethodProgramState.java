package com.aasctc.template_rules.methods;

import java.util.List;
import java.util.ArrayList;

public class MethodProgramState {

	public List<Variable> variables;
	
	public MethodProgramState() {}
	
	public void Clear() {
		variables = new ArrayList<Variable>();
	}
}

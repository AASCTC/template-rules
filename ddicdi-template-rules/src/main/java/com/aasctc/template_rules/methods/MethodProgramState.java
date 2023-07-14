package com.aasctc.template_rules.methods;

import java.util.List;

import org.javatuples.Pair;

import com.aasctc.template_rules.Type;

import java.util.ArrayList;

public class MethodProgramState {

	public List<Variable> variables;
	public boolean returning;
	public VolatileVariable returnValue;
	
	public MethodProgramState() {
		returning = false;
	}
	
	public void Clear() {
		variables = new ArrayList<Variable>();
		returning = false;
	}
}

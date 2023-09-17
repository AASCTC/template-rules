package com.aasctc.template_rules;

import java.util.List;

public class Coupling {
	private String functionName;
	private List<String> inputXPaths; 
	private String outputXPath;
	
	public Coupling() {}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public List<String> getInputXPaths() {
		return inputXPaths;
	}

	public void setInputXPaths(List<String> inputXPaths) {
		this.inputXPaths = inputXPaths;
	}

	public String getOutputXPath() {
		return outputXPath;
	}

	public void setOutputXPath(String outputXPath) {
		this.outputXPath = outputXPath;
	}
	
	
}

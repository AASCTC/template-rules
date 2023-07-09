package com.aasctc.template_rules;

import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class Type {
	Namespace namespace;
	String label;
	public Type() {
		namespace = new Namespace();
		label = "";
	}
	public Type(Namespace inputNamespace, String inputLabel) {
		namespace = inputNamespace;
		label = inputLabel;
	}
	
	// Uses the list of namespaces in parent class to determine the
	// type denoted in the prefix.
	public Type(String input, List<Namespace> namespaces) throws UnknownNamespaceException {
		namespace = new Namespace();
		String[] inputs = input.split(":");
		if (inputs.length != 2) {
			throw new IllegalArgumentException();
		}
		for (Namespace n: namespaces) {
			if (n.name == inputs[0] || n.alias == inputs[0]) {
				namespace = n;
			}
		}
		if (namespace == new Namespace()) {
			throw new UnknownNamespaceException();
		}
		label = inputs[1];
		
	}
	
	public String toString(@Nullable Boolean longForm) {
		longForm = Optional.ofNullable(longForm).orElse(false);
		if (longForm) {
			return namespace.name + ":" + label;
		}
		else {
			return namespace.alias + ":" + label;
		}
	}
}

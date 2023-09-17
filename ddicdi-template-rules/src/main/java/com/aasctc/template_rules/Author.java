package com.aasctc.template_rules;

import org.apache.commons.validator.routines.EmailValidator;

public class Author {
	private String name;
	private String email;
	
	public Author() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (EmailValidator.getInstance().isValid(email)) {
			this.email = email;
		}
	}
	
}

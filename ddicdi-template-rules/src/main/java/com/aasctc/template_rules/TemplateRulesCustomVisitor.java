package com.aasctc.template_rules;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.tree.TerminalNode;

public class TemplateRulesCustomVisitor extends TemplateRulesBaseVisitor<Object> {
	private String name;
	private Date date;
	private String description;
	private List<Author> authors;
	private List<Namespace> namespaces;
	private List<Coupling> couplings;
	
	
	public TemplateRulesCustomVisitor() {
		super();
		this.authors = new ArrayList<Author>();
		this.namespaces = new ArrayList<Namespace>();
		this.couplings = new ArrayList<Coupling>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Author> getAuthors() {
		return authors;
	}


	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}


	public List<Namespace> getNamespaces() {
		return namespaces;
	}


	public void setNamespaces(List<Namespace> namespaces) {
		this.namespaces = namespaces;
	}

	public List<Coupling> getCouplings() {
		return couplings;
	}


	public void setCouplings(List<Coupling> couplings) {
		this.couplings = couplings;
	}

	@Override public Object visitCrossDomainHeaderName(TemplateRulesParser.CrossDomainHeaderNameContext ctx) {
		setName(ctx.StringLiteral().getText());
		return visitChildren(ctx);
	}

	@Override public Object visitCrossDomainHeaderDate(TemplateRulesParser.CrossDomainHeaderDateContext ctx) {
		List<SimpleDateFormat> sdfs = new ArrayList<SimpleDateFormat>();
		sdfs.add(new SimpleDateFormat("'\"'yyyy-MM-dd'T'HH:mm:ss'Z''\"'"));
		sdfs.add(new SimpleDateFormat("'\"'yyyy-MM-dd'T'HH:mm:ss'\"'"));
		sdfs.add(new SimpleDateFormat("'\"'yyyy-MM-dd'\"'"));
		Optional<ParseException> exc = Optional.empty();
		
		for (SimpleDateFormat sdf: sdfs) {
			try {
				setDate(sdf.parse(ctx.StringLiteral().getText()));
				exc = Optional.empty();
				break;
			} catch (ParseException e) {
				exc = Optional.of(e);
				continue;
			}
		}
		if (exc.isPresent()) {
			exc.get().printStackTrace();
			System.exit(1);
		}
		return visitChildren(ctx);
	}

	@Override public Object visitCrossDomainHeaderDescription(TemplateRulesParser.CrossDomainHeaderDescriptionContext ctx) {
		setDescription(ctx.StringLiteral().getText());
		return visitChildren(ctx);
	}
	
	@Override public Object visitCrossDomainAuthor(TemplateRulesParser.CrossDomainAuthorContext ctx) {
		Author author = new Author();
		author.setName(ctx.StringLiteral().getText());
		author.setEmail(ctx.Email().getText());
		this.authors.add(author);
		return visitChildren(ctx);
	}
	
	@Override public Object visitCrossDomainNamespace(TemplateRulesParser.CrossDomainNamespaceContext ctx) {
		Namespace namespace = new Namespace();
		namespace.setPath(ctx.NamespaceLiteral().getText());
		namespace.setAlias(ctx.namespaceAliasLiteral().Identifier().getText());
		this.namespaces.add(namespace);
		return visitChildren(ctx);
	}
	
	@Override public Object visitCrossDomainCoupling(TemplateRulesParser.CrossDomainCouplingContext ctx) {
		Coupling coupling = new Coupling();
		coupling.setFunctionName(ctx.Identifier().getText());
		coupling.setOutputXPath(ctx.StringLiteral().getText());
		List<String> inputXPaths = new ArrayList<String>();
		for (TerminalNode node: ctx.crossDomainCouplingInputs().StringLiteral()) {
			String inputXPath = node.getText();
			inputXPaths.add(inputXPath);
		}
		coupling.setInputXPaths(inputXPaths);
		this.couplings.add(coupling);
		return visitChildren(ctx);
	}
	
}

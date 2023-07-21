
package com.aasctc.template_rules.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.javatuples.Pair;

import com.aasctc.template_rules.antlr.TemplateRulesParser.*;

import com.aasctc.template_rules.Namespace;
import com.aasctc.template_rules.Type;
import com.aasctc.template_rules.UnknownNamespaceException;

//TODO probably Pair<> is not the best type to be using for passing values
//because of reflection, better to make this a class instead.

/**
 * 
 * Important to note that these functions treat the input data model as
 * a raw string. If you require an XML or JSON data model, use one of the subclasses. 
 * 
 * @author Ali Sherief
 *
 */
public class MethodProgram {
	
	String[] reservedKeywords = {
			"if",
			"else",
			"foreach",
			"return",
			"input"
	};
	
	// Edit this to add more functions as appropriate.
	List<Pair<String, Integer>> functions = new ArrayList<Pair<String, Integer>>();
	
	MethodProgramContext context;
	List<Namespace> namespaces;
	List<Variable> parameters;
	MethodProgramState state;

	public static Boolean isTrue(VolatileVariable variable) {
		BigDecimal d = new BigDecimal(variable.getValue1());
		if (MethodProgram.isRealNumber(null) && d.compareTo(BigDecimal.ZERO) == 0) {
			return false;
		}
		else if (variable.getValue0().toString(false) == "xsd:string"
				&& variable.getValue1() == "") {
			return false;
		}
		else return true;
	}
	/**
	 * This method has no effect for non-numerical types.
	 * 
	 * @param number A numerical structured element
	 * @return A number with larger storage capacity.
	 */
	public static Type upgradeNumericalStorage(VolatileVariable number) {
		BigDecimal byteMin = new BigDecimal((long) Byte.MIN_VALUE);
		BigDecimal byteMax = new BigDecimal((long) Byte.MAX_VALUE);
		BigDecimal shortMin = new BigDecimal(Short.MIN_VALUE);
		BigDecimal shortMax = new BigDecimal(Short.MAX_VALUE);
		BigDecimal intMin = new BigDecimal(Integer.MIN_VALUE);
		BigDecimal intMax = new BigDecimal(Integer.MAX_VALUE);
		BigDecimal longMin = new BigDecimal(Long.MIN_VALUE);
		BigDecimal longMax = new BigDecimal(Long.MAX_VALUE);
		BigDecimal floatMin = new BigDecimal(Float.MIN_VALUE);
		BigDecimal floatMax = new BigDecimal(Float.MAX_VALUE);
		BigDecimal doubleMin = new BigDecimal(Double.MIN_VALUE);
		BigDecimal doubleMax = new BigDecimal(Double.MAX_VALUE);
		
		BigDecimal ubyteMax = new BigDecimal("255");
		BigDecimal ushortMax = new BigDecimal("65535");
		BigDecimal uintMax = new BigDecimal("4294967295");
		BigDecimal ulongMax = new BigDecimal("18446744073709551615");
		
		BigDecimal bigNumber = new BigDecimal(number.getValue1());
		
		Namespace namespace = new Namespace("<https://www.w3.org/2001/XMLSchema#>", "xsd");
		Type type = number.getValue0();
		
		if (type.toString(false) == "xsd:unsignedByte" &&
				(bigNumber.compareTo(ubyteMax) > 0)) {
			type = new Type(namespace, "unsignedShort");
		}
		if (type.toString(false) == "xsd:unsignedShort" &&
				(bigNumber.compareTo(ushortMax) > 0)) {
			type = new Type(namespace, "unsignedInt");
		}
		if (type.toString(false) == "xsd:unsignedInt" &&
				(bigNumber.compareTo(uintMax) > 0)) {
			type = new Type(namespace, "unsignedLong");
		}
		if (type.toString(false) == "xsd:unsignedLong" &&
				(bigNumber.compareTo(ulongMax) > 0)) {
			type = new Type(namespace, "nonNegativeInteger");
		}
		
		if (type.toString(false) == "xsd:unsignedByte" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "byte");
		}
		if (type.toString(false) == "xsd:unsignedShort" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "short");
		}
		if (type.toString(false) == "xsd:unsignedInt" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "int");
		}
		if (type.toString(false) == "xsd:unsignedLong" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "long");
		}
		if (type.toString(false) == "xsd:nonNegativeInteger" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "integer");
		}
		if (type.toString(false) == "xsd:positiveInteger" &&
				(bigNumber.compareTo(BigDecimal.ZERO) < 0)) {
			type = new Type(namespace, "integer");
		}
		if (type.toString(false) == "xsd:nonPositiveInteger" &&
				(bigNumber.compareTo(BigDecimal.ZERO) > 0)) {
			type = new Type(namespace, "integer");
		}
		if (type.toString(false) == "xsd:negativeInteger" &&
				(bigNumber.compareTo(BigDecimal.ZERO) > 0)) {
			type = new Type(namespace, "integer");
		}
		
		if (type.toString(false) == "xsd:byte" &&
				(bigNumber.compareTo(byteMin) < 0 || bigNumber.compareTo(byteMax) > 0)) {
			type = new Type(namespace, "short");
		}
		if (type.toString(false) == "xsd:short" &&
				(bigNumber.compareTo(shortMin) < 0 || bigNumber.compareTo(shortMax) > 0)) {
			type = new Type(namespace, "int");
		}
		if (type.toString(false) == "xsd:int" &&
				(bigNumber.compareTo(intMin) < 0 || bigNumber.compareTo(intMax) > 0)) {
			type = new Type(namespace, "long");
		}
		if (type.toString(false) == "xsd:long" &&
				(bigNumber.compareTo(longMin) < 0 || bigNumber.compareTo(longMax) > 0)) {
			type = new Type(namespace, "integer");
		}
		
		if (type.toString(false) == "xsd:float" &&
				(bigNumber.compareTo(floatMin) < 0 || bigNumber.compareTo(floatMax) > 0)) {
			type = new Type(namespace, "double");
		}
		if (type.toString(false) == "xsd:double" &&
				(bigNumber.compareTo(doubleMin) < 0 || bigNumber.compareTo(doubleMax) > 0)) {
			type = new Type(namespace, "decimal");
		}
		
		if (MethodProgram.isIntegerNumber(type) && bigNumber.scale() > 0) {
			type = new Type(namespace, "decimal");
		}
		return type;
	}

	public static Boolean isIntegerNumber(Type type) {
		String typeString = type.toString(false);
				return typeString == "xsd:integer" ||
				typeString == "xsd:long" ||
				typeString == "xsd:nonPositiveInteger" ||
				typeString == "xsd:nonNegativeInteger" ||
				typeString == "xsd:negativeInteger" ||
				typeString == "xsd:positiveInteger" ||
				typeString == "xsd:unsignedLong" ||
				typeString == "xsd:unsignedInt" ||
				typeString == "xsd:unsignedShort" ||
				typeString == "xsd:unsignedByte" ||
				typeString == "xsd:int" ||
				typeString == "xsd:short" ||
				typeString == "xsd:byte";
	}
	
	public static Boolean isRealNumber(Type type) {
		String typeString = type.toString(false);
				return MethodProgram.isIntegerNumber(type) ||
				typeString == "xsd:float" ||
				typeString == "xsd:double" ||
				typeString == "xsd:decimal";
	}
	
	

	
	public static Type resultType(Type type1, Type type2) throws IllegalArgumentException {
		String typeString1 = type1.toString(false);
		String typeString2 = type2.toString(false);
		if (type2 == type1) {
			return type1;
		}
		else if (MethodProgram.lessThan(type1, type2)) {
			return type1;
		}
		
		else if (MethodProgram.lessThan(type2, type1)) {
			return type2;
		}
		else if (typeString1 == "xsd:byte" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:byte") {
			return new Type(type1.namespace, "xsd:short");
		}
		else if (typeString1 == "xsd:short" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:short") {
			return new Type(type1.namespace, "xsd:int");
		}
		else if (typeString1 == "xsd:int" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:int") {
			return new Type(type1.namespace, "xsd:long");
		}
		else if (typeString1 == "xsd:long" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:long") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:positiveInteger" ||
				typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:integer" ||
				typeString1 == "xsd:integer" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:integer" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:integer" ||
				typeString1 == "xsd:integer" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:integer" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:integer" ||
				typeString1 == "xsd:integer" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:decimal" ||
				typeString1 == "xsd:decimal" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:decimal" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:decimal" ||
				typeString1 == "xsd:decimal" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:decimal" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:decimal" ||
				typeString1 == "xsd:decimal" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:decimal");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:float" ||
				typeString1 == "xsd:float" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:float" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:float" ||
				typeString1 == "xsd:float" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:float" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:float" ||
				typeString1 == "xsd:float" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:decimal");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:double" ||
				typeString1 == "xsd:double" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:double" && typeString2 == "xsd:negativeInteger" ||
				typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:double" ||
				typeString1 == "xsd:double" && typeString2 == "xsd:nonPositiveInteger" ||
				typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:double" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:double" ||
				typeString1 == "xsd:double" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:decimal");
		}
		
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:nonNegativeInteger") {
			return new Type(type1.namespace, "xsd:nonNegativeInteger");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:positiveInteger");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:nonNegativeInteger") {
			return new Type(type1.namespace, "xsd:nonNegativeInteger");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:positiveInteger");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}

		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:nonNegativeInteger") {
			return new Type(type1.namespace, "xsd:nonNegativeInteger");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:positiveInteger");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}

		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:nonNegativeInteger") {
			return new Type(type1.namespace, "xsd:nonNegativeInteger");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:positiveInteger");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}

		
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedLong" ||
				typeString1 == "xsd:unsignedLong" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:nonNegativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:unsignedInt" ||
				typeString1 == "xsd:unsignedInt" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}

		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:positiveInteger") {
			return new Type(type1.namespace, "xsd:positiveInteger");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedShort" ||
				typeString1 == "xsd:unsignedShort" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}

		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:unsignedByte" ||
				typeString1 == "xsd:unsignedByte" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:integer");
		}
		
		else if (typeString1 == "xsd:nonPositiveInteger" && typeString2 == "xsd:positiveInteger" ||
				typeString1 == "xsd:positiveInteger" && typeString2 == "xsd:nonPositiveInteger") {
			return new Type(type1.namespace, "xsd:nonPositiveInteger");
		}
		else if (typeString1 == "xsd:negativeInteger" && typeString2 == "xsd:nonNegativeInteger" ||
				typeString1 == "xsd:nonNegativeInteger" && typeString2 == "xsd:negativeInteger") {
			return new Type(type1.namespace, "xsd:nonNegativeInteger");
		}
		

		else if (typeString1 == "xsd:integer" && typeString2 == "xsd:decimal" ||
				typeString1 == "xsd:decimal" && typeString2 == "xsd:integer") {
			return new Type(type1.namespace, "xsd:decimal");
		}
		
		throw new IllegalArgumentException("Only integer types are allowed");
	}
	
	public static Boolean lessThan(Type type1, Type type2) {
		String typeString1 = type1.toString(false);
		String typeString2 = type2.toString(false);
		
		if (typeString1 == "xsd:byte") {
			return false;
		}
		else if (typeString1 == "xsd:short") {
			if (typeString2 == "xsd:byte") {
				return false;
			}
			else if (typeString2 == "xsd:int" ||
					typeString2 == "xsd:long" ||
					typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:int") {
			if (typeString2 == "xsd:byte" ||
					typeString2 == "xsd:short") {
				return false;
			}
			else if (typeString2 == "xsd:long" ||
					typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:long") {
			if (typeString2 == "xsd:byte" ||
					typeString2 == "xsd:short" ||
					typeString2 == "xsd:int") {
				return false;
			}

			else if (typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:float") {
			if (typeString2 == "xsd:byte" ||
				typeString2 == "xsd:short" ||
				typeString2 == "xsd:int" ||
				typeString2 == "xsd:long" ||
				typeString2 == "xsd:unsignedByte" ||
				typeString2 == "xsd:unsignedShort" ||
				typeString2 == "xsd:unsignedInt" ||
				typeString2 == "xsd:unsignedLong" ||
				typeString2 == "xsd:integer") {
				return false;
			}

			else if (typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:double") {
			if (typeString2 == "xsd:byte" ||
				typeString2 == "xsd:short" ||
				typeString2 == "xsd:int" ||
				typeString2 == "xsd:long" ||
				typeString2 == "xsd:unsignedByte" ||
				typeString2 == "xsd:unsignedShort" ||
				typeString2 == "xsd:unsignedInt" ||
				typeString2 == "xsd:unsignedLong" ||
				typeString2 == "xsd:integer" ||
				typeString2 == "xsd:float") {
				return false;
			}

			else if (typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:decimal") {
			if (typeString2 == "xsd:byte" ||
				typeString2 == "xsd:short" ||
				typeString2 == "xsd:int" ||
				typeString2 == "xsd:long" ||
				typeString2 == "xsd:unsignedByte" ||
				typeString2 == "xsd:unsignedShort" ||
				typeString2 == "xsd:unsignedInt" ||
				typeString2 == "xsd:unsignedLong" ||
				typeString2 == "xsd:integer" ||
				typeString2 == "xsd:float") {
				return false;
			}
			else return false;
		}
		else if (typeString1 == "xsd:unsignedByte") {
			return false; 
		}
		else if (typeString1 == "xsd:unsignedShort") {
			if (typeString2 == "xsd:unsignedByte" ||
				typeString2 == "xsd:byte") {
				return false;
			}
			else if (typeString2 == "xsd:unsignedInt" ||
					typeString2 == "xsd:int" ||
					typeString2 == "xsd:unsignedLong" ||
					typeString2 == "xsd:long" ||
					typeString2 == "xsd:nonNegativeInteger" ||
					typeString2 == "xsd:positiveInteger" ||
					typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:unsignedInt") {
			if (typeString2 == "xsd:unsignedByte" ||
					typeString2 == "xsd:byte" ||
					typeString2 == "xsd:unsignedShort" ||
					typeString2 == "xsd:short") {
				return false;
			}
			else if (typeString2 == "xsd:unsignedLong" ||
					typeString2 == "xsd:long" ||
					typeString2 == "xsd:nonNegativeInteger" ||
					typeString2 == "xsd:positiveInteger" ||
					typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:unsignedLong") {
			if (typeString2 == "xsd:unsignedByte" ||
					typeString2 == "xsd:byte" ||
					typeString2 == "xsd:unsignedShort" ||
					typeString2 == "xsd:short" ||
					typeString2 == "xsd:unsignedInt" ||
					typeString2 == "xsd:int") {
				return false;
			}
			else if (typeString2 == "xsd:nonNegativeInteger" ||
					typeString2 == "xsd:positiveInteger" ||
					typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:nonNegativeInteger") {
			if (typeString2 == "xsd:unsignedByte" ||
					typeString2 == "xsd:unsignedShort" ||
					typeString2 == "xsd:unsignedInt" ||
					typeString2 == "xsd:unsignedLong") {
				return false;
			}
			else if (typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		else if (typeString1 == "xsd:positiveInteger") {
			if (typeString2 == "xsd:unsignedByte" ||
					typeString2 == "xsd:unsignedShort" ||
					typeString2 == "xsd:unsignedInt" ||
					typeString2 == "xsd:unsignedLong") {
				return false;
			}
			else if (typeString2 == "xsd:integer" ||
					typeString2 == "xsd:float" ||
					typeString2 == "xsd:double" ||
					typeString2 == "xsd:decimal") {
				return true;
			}
		}
		return false;
	}
	
	public static VolatileVariable function_add(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {
		if (MethodProgram.isRealNumber(op.getValue0()) &&
				MethodProgram.isRealNumber(op2.getValue0())) {
			String result = new BigDecimal(op.getValue1()).add(
					new BigDecimal(op2.getValue1())).toString();
			
			Type resultType = MethodProgram.upgradeNumericalStorage(
					new VolatileVariable(MethodProgram.resultType(
							op.getValue0(), op.getValue0()),
							result));
			return new VolatileVariable(resultType, result);
		}
		else {
			throw new IllegalArgumentException("This function is not valid for these types.");
		}
	}
	
	public static VolatileVariable function_sub(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {
		if (MethodProgram.isRealNumber(op.getValue0()) &&
				MethodProgram.isRealNumber(op2.getValue0())) {
			String result = new BigDecimal(op.getValue1()).subtract(
					new BigDecimal(op2.getValue1())).toString();
			
			Type resultType = MethodProgram.upgradeNumericalStorage(
					new VolatileVariable(MethodProgram.resultType(
							op.getValue0(), op.getValue0()),
							result));
			return new VolatileVariable(resultType, result);
		}
		else {
			throw new IllegalArgumentException("This function is not valid for these types.");
		}
	}
	
	public static VolatileVariable function_mul(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {
		if (MethodProgram.isRealNumber(op.getValue0()) &&
				MethodProgram.isRealNumber(op2.getValue0())) {
			String result = new BigDecimal(op.getValue1()).multiply(
					new BigDecimal(op2.getValue1())).toString();
			
			Type resultType = MethodProgram.upgradeNumericalStorage(
					new VolatileVariable(MethodProgram.resultType(
							op.getValue0(), op.getValue0()),
							result));
			return new VolatileVariable(resultType, result);
		}
		else {
			throw new IllegalArgumentException("This function is not valid for these types.");
		}
	}
	
	public static VolatileVariable function_div(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {
		try {
			if (MethodProgram.isRealNumber(op.getValue0()) &&
					MethodProgram.isRealNumber(op2.getValue0())) {
				String result = new BigDecimal(op.getValue1()).divide(
						new BigDecimal(op2.getValue1())).toString();
				
				Type resultType = MethodProgram.upgradeNumericalStorage(
						new VolatileVariable(MethodProgram.resultType(
								op.getValue0(), op.getValue0()),
								result));
				return new VolatileVariable(resultType, result);
			}
			else {
				throw new IllegalArgumentException("This function is not valid for these types.");
			}
		}
		catch (ArithmeticException e) {
			throw new IllegalArgumentException("Numerical division error");
		}
	}
	
	public static VolatileVariable function_mod(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {
		try {
			if (MethodProgram.isIntegerNumber(op.getValue0()) &&
					MethodProgram.isIntegerNumber(op2.getValue0())) {
				String result = new BigDecimal(op.getValue1()).remainder(
						new BigDecimal(op2.getValue1())).toString();
				
				Type resultType = MethodProgram.upgradeNumericalStorage(
						new VolatileVariable(MethodProgram.resultType(
								op.getValue0(), op.getValue0()),
								result));
				return new VolatileVariable(resultType, result);
			}
			else {
				throw new IllegalArgumentException("This function is not valid for these types.");
			}
		}
		catch (ArithmeticException e) {
			throw new IllegalArgumentException("Numerical modulus error");
		}
	}
	
	public static VolatileVariable function_append(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {

		if (op.getValue0() != op2.getValue0()) {
			throw new IllegalArgumentException("Arguments must have the same type");
		}
		String result = op.getValue1() + op2.getValue1();
		
		return new VolatileVariable(op.getValue0(), result);
	}
	

	public static VolatileVariable function_index(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {

		if (!MethodProgram.isIntegerNumber(op2.getValue0())) {
			throw new IllegalArgumentException("Second argument must be an integer");
		}
		try {
			int index = Integer.parseInt(op2.getValue1());
			// We should not be doing this. We have to consider this as XML and
			// extract the first node.
			String result = String.valueOf(op.getValue1().charAt(index));
			return new VolatileVariable(op.getValue0(), result);
		}
		catch(NumberFormatException | IndexOutOfBoundsException e) {
			throw new IllegalArgumentException("Bad array index");
		}
	}

	public static VolatileVariable function_clear(
			VolatileVariable op) throws IllegalArgumentException {
		try {
			String result = "";
			return new VolatileVariable(op.getValue0(), result);
		}
		catch(StringIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("Bad array index");
		}
	}
	
	private void ProcessAssignment(MethodAssignmentContext assignment) throws IllegalAssignmentException, UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String variableName = assignment.IDENTIFIER().toString();
		Type type;
		Optional<Variable> oldVariable = Optional.empty();
		Variable newVariable;
				
		try {
			type = new Type(assignment.methodType().toString(), namespaces);
		} catch (UnknownNamespaceException e) {
			throw new IllegalAssignmentException("Unknown type of variable");
		}
		
		VolatileVariable value = ProcessExpression(assignment.methodExpression());
		newVariable = new Variable(variableName, type, value.getValue1());
		
		for (Variable variable: state.variables) {
			if (variable.name == variableName && variable.type != type) {
				throw new IllegalAssignmentException(String.format("Type mismatch during assignment of variable \"%s\": Expected %s, got %s",
						variableName, variable.type.toString(false), variable.type.toString(false)));
			}
			else {
				oldVariable = Optional.of(variable);
				break;
			}
		}
		
		if (oldVariable.isEmpty()) {
			state.variables.add(newVariable);
		}
		else {
			state.variables.set(state.variables.indexOf(oldVariable.get()), newVariable);
		}
		
	}

	private void ProcessConditional(MethodConditionalContext conditional) throws IllegalAssignmentException, UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MethodIfBlockContext ifContext = conditional.methodIfBlock();
		VolatileVariable ifExpression = ProcessExpression(ifContext.methodExpression());
		if (isTrue(ifExpression)) {
			for (MethodStatementContext statement: ifContext.methodStatement()) {
				ProcessStatement(statement);
				if (state.returning) {
					return;
				}
			}
			return;
		}
		for (MethodElseIfBlockContext elseifContext: conditional.methodElseIfBlock()) {
			VolatileVariable elseifExpression = ProcessExpression(elseifContext.methodExpression());
			if (isTrue(elseifExpression)) {
				for (MethodStatementContext statement: elseifContext.methodStatement()) {
					ProcessStatement(statement);
					if (state.returning) {
						return;
					}
				}
			}
			return;
		}
		if (!conditional.methodElseBlock().isEmpty()) {
			MethodElseBlockContext elseContext = conditional.methodElseBlock();
			for (MethodStatementContext statement: elseContext.methodStatement()) {
				ProcessStatement(statement);
				if (state.returning) {
					return;
				}
			}
		}
	}
	
	private Type ProcessMethodType(MethodTypeContext methodType) throws UnknownTypeException {
		for (Namespace namespace: namespaces) {
			if (!methodType.longFormMethodType().isEmpty() &&
					namespace.name == methodType.longFormMethodType().TEXT().getText()) {
				return new Type(namespace, methodType.longFormMethodType().IDENTIFIER().getText());
			}
			else if (!methodType.shortFormMethodType().isEmpty() &&
					namespace.alias == methodType.shortFormMethodType().IDENTIFIER(0).getText()) {
				return new Type(namespace, methodType.shortFormMethodType().IDENTIFIER(1).getText());
			}
		}
		throw new UnknownTypeException("Unknown namespace for type");
	}

	private VolatileVariable ProcessFunctionCall(MethodFunctionCallContext functionCall) throws InvocationTargetException, UnsupportedOperationException, UnknownTypeException, NoSuchMethodException, SecurityException {
		List<VolatileVariable> arguments = new ArrayList<VolatileVariable>();
		for (MethodExpressionContext expression: functionCall.methodArgumentList().methodExpression()) {
			arguments.add(ProcessExpression(expression));
		}
		
		String functionName = functionCall.IDENTIFIER().toString();
		for (Pair<String, Integer> function: functions) {
			String name = function.getValue0();
			Integer numberOfParameters = function.getValue1();
			if (name == functionName) {
				if (arguments.size() != numberOfParameters) {
					throw new java.lang.IllegalArgumentException(String.format(
							"Wrong number of parameters to function %s, expected %d parameters,"
							+ "got %d instead", functionName, numberOfParameters, arguments.size()));
				}
				Class<? extends MethodProgram> reflectionClass = this.getClass();
				Method reflectionMethod = reflectionClass.getMethod("function_" + functionName);
				try {
					Object result = reflectionMethod.invoke(null, arguments.toArray());
					VolatileVariable subResult = VolatileVariable.class.cast(result);
					return subResult;
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					throw new RuntimeException("This is probably a developer error.");
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					throw new RuntimeException("This is probably a developer error.");
				}
			}
		}
		throw new NoSuchMethodException(String.format("No such function: %s", functionName));
	}

	private VolatileVariable ProcessPrimaryExpression(MethodPrimaryExpressionContext primaryExpression) throws UnknownTypeException, UnsupportedOperationException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (!primaryExpression.intConstant().isEmpty()) {
			IntConstantContext intConstant = primaryExpression.intConstant();
			Type resultType = new Type();
			if (intConstant.methodType().isEmpty()) {
				resultType = new Type(new Namespace("<https://www.w3.org/2001/XMLSchema#>", "xsd"), "int");
			}
			else {
				resultType = ProcessMethodType(intConstant.methodType());
				
			}
			try {
				new BigInteger(intConstant.INT().getText());
			}
			catch (NumberFormatException e) {
				throw new UnknownTypeException("Int constant is not an integer");
			}
			return new VolatileVariable(resultType, intConstant.INT().getText());
		}
		else if (!primaryExpression.floatConstant().isEmpty()) {
			FloatConstantContext floatConstant = primaryExpression.floatConstant();
			Type resultType = new Type();
			if (floatConstant.methodType().isEmpty()) {
				resultType = new Type(new Namespace("<https://www.w3.org/2001/XMLSchema#>", "xsd"),
						"decimal");
			}
			else {
				resultType = ProcessMethodType(floatConstant.methodType());
				
			}
			try {
				new BigDecimal(floatConstant.FLOAT().getText());
			}
			catch (NumberFormatException e) {
				throw new UnknownTypeException("Float constant is not an floating-point number");
			}
			return new VolatileVariable(resultType, floatConstant.FLOAT().getText());
		}
		else if (!primaryExpression.stringConstant().isEmpty()) {
			StringConstantContext stringConstant = primaryExpression.stringConstant();
			Type resultType = new Type();
			if (stringConstant.methodType().isEmpty()) {
				resultType = new Type(new Namespace("<https://www.w3.org/2001/XMLSchema#>", "xsd"),
						"string");
			}
			else {
				resultType = ProcessMethodType(stringConstant.methodType());
				
			}
			return new VolatileVariable(resultType, stringConstant.STRING().getText());
		}
		else if (primaryExpression.IDENTIFIER().getText() != "") {
			String name = primaryExpression.IDENTIFIER().getText();			
			for (Variable variable: state.variables) {
				if (variable.name == name) {
					return new VolatileVariable(variable.type, variable.value);
				}
			}
			throw new UnknownTypeException(String.format("Unknown variable \"%s\"", name));
		}
		else if (!primaryExpression.methodExpression().isEmpty()) {
			return ProcessExpression(primaryExpression.methodExpression());
		}
		
		throw new RuntimeException("Unreachable code (???)");
	}	
	
	private VolatileVariable ProcessExpression(MethodExpressionContext expression) throws UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (!expression.methodFunctionCall().isEmpty()) {
			return ProcessFunctionCall(expression.methodFunctionCall());
		}
		else if (!expression.methodPrimaryExpression().isEmpty()) {
			return ProcessPrimaryExpression(expression.methodPrimaryExpression());
		}
		else if (!expression.methodPropertyAccess().isEmpty()) {
			throw new UnsupportedOperationException(
					"The base string-oriented MethodProgram does not support property"
					+ " access. Use XMLMethodProgram instead.");
		}
		throw new RuntimeException("Unreachable code (???)");
	}

	private void ProcessForEachLoop(MethodForEachLoopContext forEachLoop) throws IllegalAssignmentException, UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		MethodRangeContext context = forEachLoop.methodRange();
		Integer start = Integer.parseInt(context.INT(0).getText());
		Integer end = Integer.parseInt(context.INT(1).getText());
		Namespace intNamespace = new Namespace("<https://www.w3.org/2001/XMLSchema#>", "xsd");
		Type intType = new Type(intNamespace, "int");
		
		Variable identifier = new Variable(forEachLoop.IDENTIFIER().getText(),
				intType, start.toString());
		state.variables.add(identifier);
		for (Integer i = start; i < end; i++) {
			for (MethodStatementContext statement: forEachLoop.methodStatement()) {
				ProcessStatement(statement);
				if (state.returning) {
					return;
				}
			}
		}
		state.variables.remove(identifier);
	}
	
	private void ProcessReturn(MethodReturnContext returnStatement) throws UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		VolatileVariable expression = ProcessExpression(returnStatement.methodExpression());
		state.returning = true;
		state.returnValue = expression;
		
	}
	
	private void ProcessStatement(MethodStatementContext statement) throws IllegalAssignmentException, UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (!statement.methodAssignment().isEmpty()) {
			ProcessAssignment(statement.methodAssignment());
		}
		else if (!statement.methodConditional().isEmpty()) {
			ProcessConditional(statement.methodConditional());
		}
		else if (!statement.methodExpression().isEmpty()) {
			ProcessExpression(statement.methodExpression());
		}
		else if (!statement.methodForEachLoop().isEmpty()) {
			ProcessForEachLoop(statement.methodForEachLoop());
		}
		else if (!statement.methodReturn().isEmpty()) {
			ProcessReturn(statement.methodReturn());
		}
	}
	
	private void insertFunctions() {
		functions.add(new Pair<String, Integer>("add", 2));
		functions.add(new Pair<String, Integer>("sub", 2));
		functions.add(new Pair<String, Integer>("mul", 2));
		functions.add(new Pair<String, Integer>("div", 2));
		functions.add(new Pair<String, Integer>("mod", 2));
		functions.add(new Pair<String, Integer>("append", 1));
		functions.add(new Pair<String, Integer>("index", 2));
		functions.add(new Pair<String, Integer>("delete", 2));
		functions.add(new Pair<String, Integer>("clear", 1));
	}
	
	public MethodProgram(MethodProgramContext inputContext, List<Namespace> inputNamespaces,
			List<Variable> inputParameters) {
		context = inputContext;
		namespaces = inputNamespaces;
		parameters = inputParameters;
		insertFunctions();
	}

	public MethodProgram() {
		insertFunctions();
	}
	
	public VolatileVariable Interpret(VolatileVariable input) throws IllegalAssignmentException, UnsupportedOperationException, UnknownTypeException, InvocationTargetException, NoSuchMethodException, SecurityException {
		state.variables = parameters;
		state.variables.add(new Variable("input", input.getValue0(), input.getValue1()));
		
		List<MethodStatementContext> statements = context.methodStatement();
		for (MethodStatementContext statement: statements) {
			ProcessStatement(statement);
		}
	
		VolatileVariable returnValue = state.returnValue;
		return returnValue;
	}
}
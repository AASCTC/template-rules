package com.aasctc.template_rules;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import org.javatuples.Pair;

import com.aasctc.template_rules.antlr.TemplateRulesParser.MethodProgramContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.MethodStatementContext;

public class Method {
	
	String name;
	List<String> parameters;
	MethodProgram body;
	
	public class Variable {
		String name;
		Type type;
		String value;
		
		public Variable() {}
		
		public Variable(String inputName, Type inputType, String inputValue) {
			name = inputName;
			type = inputType;
			value = inputValue;
		}
	}
	
	public class MethodProgram {
		
		String[] reservedKeywords = {
				"if",
				"else",
				"foreach",
				"return",
				"input"
		};
		
		// Edit this to add more functions as appropriate.
		String[] functions = {
				"add",
				"sub",
				"mul",
				"div",
				"mod",
				"append",
				"index",
				"delete",
				"deleteAll"
		};
		
		/**
		 * This method has no effect for non-numerical types.
		 * 
		 * @param number A numerical structured element
		 * @return A number with larger storage capacity.
		 */
		public static Type upgradeNumericalStorage(Pair<Type, String> number) {
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
					(bigNumber.compareTo(ushortMax) > 0)) {
				type = new Type(namespace, "unsignedLong");
			}
			if (type.toString(false) == "xsd:unsignedLong" &&
					(bigNumber.compareTo(ushortMax) > 0)) {
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
			else return false;
		}
		
		public static Pair<Type, String> function_add(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			if (MethodProgram.isRealNumber(op.getValue0()) &&
					MethodProgram.isRealNumber(op2.getValue0())) {
				String result = new BigDecimal(op.getValue1()).add(
						new BigDecimal(op2.getValue1())).toString();
				
				Type resultType = MethodProgram.upgradeNumericalStorage(
						new Pair<Type, String>(MethodProgram.resultType(
								op.getValue0(), op.getValue0()),
								result));
				return new Pair<Type, String>(resultType, result);
			}
			else {
				throw new IllegalArgumentException("This function is only valid for numerical types.");
			}
		}
		
		public static Pair<Type, String> function_sub(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			if (MethodProgram.isRealNumber(op.getValue0()) &&
					MethodProgram.isRealNumber(op2.getValue0())) {
				String result = new BigDecimal(op.getValue1()).subtract(
						new BigDecimal(op2.getValue1())).toString();
				
				Type resultType = MethodProgram.upgradeNumericalStorage(
						new Pair<Type, String>(MethodProgram.resultType(
								op.getValue0(), op.getValue0()),
								result));
				return new Pair<Type, String>(resultType, result);
			}
			else {
				throw new IllegalArgumentException("This function is only valid for numerical types.");
			}
		}
		
		public static Pair<Type, String> function_mul(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			if (MethodProgram.isRealNumber(op.getValue0()) &&
					MethodProgram.isRealNumber(op2.getValue0())) {
				String result = new BigDecimal(op.getValue1()).multiply(
						new BigDecimal(op2.getValue1())).toString();
				
				Type resultType = MethodProgram.upgradeNumericalStorage(
						new Pair<Type, String>(MethodProgram.resultType(
								op.getValue0(), op.getValue0()),
								result));
				return new Pair<Type, String>(resultType, result);
			}
			else {
				throw new IllegalArgumentException("This function is only valid for numerical types.");
			}
		}
		
		public static Pair<Type, String> function_div(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			try {
				if (MethodProgram.isRealNumber(op.getValue0()) &&
						MethodProgram.isRealNumber(op2.getValue0())) {
					String result = new BigDecimal(op.getValue1()).divide(
							new BigDecimal(op2.getValue1())).toString();
					
					Type resultType = MethodProgram.upgradeNumericalStorage(
							new Pair<Type, String>(MethodProgram.resultType(
									op.getValue0(), op.getValue0()),
									result));
					return new Pair<Type, String>(resultType, result);
				}
				else {
					throw new IllegalArgumentException("This function is only valid for numerical types.");
				}
			}
			catch (ArithmeticException e) {
				throw new IllegalArgumentException("Numerical division error");
			}
		}
		
		public static Pair<Type, String> function_div(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			try {
				if (MethodProgram.isIntegerNumber(op.getValue0()) &&
						MethodProgram.isIntegerNumber(op2.getValue0())) {
					String result = new BigDecimal(op.getValue1()).divide(
							new BigDecimal(op2.getValue1())).toString();
					
					Type resultType = MethodProgram.upgradeNumericalStorage(
							new Pair<Type, String>(MethodProgram.resultType(
									op.getValue0(), op.getValue0()),
									result));
					return new Pair<Type, String>(resultType, result);
				}
				else {
					throw new IllegalArgumentException("This function is only valid for numerical types.");
				}
			}
			catch (ArithmeticException e) {
				throw new IllegalArgumentException("Numerical modulus error");
			}
		}
		
		public static Pair<Type, String> function_div(
				Pair<Type, String> op,
				Pair<Type, String> op2) throws IllegalArgumentException {
			try {
				if (MethodProgram.isIntegerNumber(op.getValue0()) &&
						MethodProgram.isIntegerNumber(op2.getValue0())) {
					String result = new BigDecimal(op.getValue1()).divide(
							new BigDecimal(op2.getValue1())).toString();
					
					Type resultType = MethodProgram.upgradeNumericalStorage(
							new Pair<Type, String>(MethodProgram.resultType(
									op.getValue0(), op.getValue0()),
									result));
					return new Pair<Type, String>(resultType, result);
				}
				else {
					throw new IllegalArgumentException("This function is only valid for numerical types.");
				}
			}
			catch (ArithmeticException e) {
				throw new IllegalArgumentException("Numerical modulus error");
			}
		}
		
		public MethodProgram(MethodProgramContext context) {
			List<MethodStatementContext> statements = context.methodStatement();
			for (MethodStatementContext statement: statements) {
				String text = statement.getText();
			}
		}
	}
	
	public Method() {
		name = "";
		parameters = new ArrayList<String>();
	}
	public Method(String inputName, List<String> inputParameters) {
		name = inputName;
		parameters = inputParameters;
	}
	
	public Method(String inputName) {
		name = inputName;
		parameters = new ArrayList<String>();
	}
}
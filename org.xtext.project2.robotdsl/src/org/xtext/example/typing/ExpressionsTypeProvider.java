package org.xtext.example.typing;

import project2.Expression;

public class ExpressionsTypeProvider {
	public static BoolType boolType = new BoolType();
	public static IntType intType = new IntType();
	
	public static ExpressionsType typeOf(Expression e) {
		if(e.getValue()!=null) {
			if(e.getValue().equals("TRUE") || e.getValue().equals("FALSE")) {
				return boolType;
			}else {
				return intType;
			}
		}
		switch (e.getOperation()) {
			// constants
			case "-": 
			case "/":
			case "*": 
			case "+": return intType;
			
			case "||":
			case "&&":
			case ">":
			case ">=":
			case "<":
			case "<=":
			case "==":
			case "!=": return boolType;
			case "else":
			case "then": return typeOf(e.getLeft());
		}
		if(e.getOperation().equals("if")) {
			ExpressionsType left = typeOf(e.getLeft());
			ExpressionsType right = typeOf(e.getRight());
			
			if (left == boolType){		
				if (right == intType)
					return intType;
				}
				return boolType;
		}
		return null;
	}
}

package org.xtext.example.typing;

import project2.Expression;

public class ExpressionsTypeProvider {
	public static BoolType boolType = new BoolType();
	public static IntType intType = new IntType();
	
	public static ExpressionsType typeOf(Expression e) {
		if(e.getValue()!=null) {
			return intType;
		}
		if(e.getBool() != null) {
			return boolType;
		}
		switch (e.getOperation()) {
			// constants
			case "+","*","-","/": return intType;
			
			case "!=","||","&&",">",">=","<","<=","==": return boolType;
			case "then","else": return typeOf(e.getLeft());
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

package com.rehan.cal;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.rehan.expression.Expression;
import com.rehan.expression.NumberExpression;
import com.rehan.expression.OperatorExpression;
import com.rehan.operator.Operators;


public class Calculator {

	private static final Map<String, Operators> operators = new HashMap<String, Operators>();
	static{
		operators.put("+", Operators.ADD);
		operators.put("-", Operators.SUBSTRACT);
		operators.put("*", Operators.MULTIPLE);
		operators.put("/", Operators.DIVIDE);
	}

	public static void main(String[] args) {

		
		if(args.length != 1) {
			System.err.println("Usage: missing Expression as argument");
		}
		
		String[] tokens = args[0].split(" ");
		
		Stack<Expression> stack = new Stack<Expression>();
		
		if(!handleNumber(String[] tokens) || handleOperator(Stack<Expression> stack, String tokens)){
			new IllegalAccessException("garbage");
		}
		
		System.out.println("Result is : "+ stack.pop().getExp());
	}

	private static Boolean handleNumber(String[] tokens) {
		
		
		for (String token : tokens) {
			
			try {
				int number = Integer.parseInt(token);
				stack.push(new NumberExpression(number));
				System.out.println(token + " is a number");
			} catch (NumberFormatException e) {
				return false;
			}
			
		}
		return true;
	}

	private static Boolean handleOperator(Stack<Expression> stack, String tokens) {
		System.out.println(tokens + " is not a number");
		Expression lhs = stack.pop(), rhs = stack.pop();
		Operators op;
		if (tokens.equals(null)){
			System.out.println("garbage");
			return false;
		}
		op = operators.get(tokens);
		stack.push(new OperatorExpression(lhs, rhs, op));
		return true;
	}
}


package com.rehan.expression;

import com.rehan.operator.Operators;

public class OperatorExpression implements Expression{
	
	Expression lhs, rhs;
	Operators op;
	
	
	public OperatorExpression(Expression lhs, Expression rhs, Operators op) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.op = op;
	}


	@Override
	public int getExp() {
		return op.getValue(lhs.getExp(), rhs.getExp());
	}

}

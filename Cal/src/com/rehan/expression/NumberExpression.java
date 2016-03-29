package com.rehan.expression;


public class NumberExpression implements Expression{
	
	public int value;
	
	

	public NumberExpression(int value) {
		this.value = value;
	}



	@Override
	public int getExp() {
		return value;
	}

}

package com.rehan.operator;

public class Add implements Operator{

	@Override
	public int getValue(int lhs, int rhs) {
		return lhs + rhs;
	}

}

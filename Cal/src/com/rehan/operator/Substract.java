package com.rehan.operator;

public class Substract implements Operator{

	@Override
	public int getValue(int lhs, int rhs) {
		return lhs - rhs;
	}

}

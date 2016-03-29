package com.rehan.operator;

public enum Operators {

	ADD {
		@Override
		public
		int getValue(int lhs, int rhs) {
			return lhs + rhs;
		}
	}, SUBSTRACT {
		@Override
		public
		int getValue(int lhs, int rhs) {
			// TODO Auto-generated method stub
			return lhs - rhs;
		}
	}, MULTIPLE {
		@Override
		public
		int getValue(int lhs, int rhs) {
			// TODO Auto-generated method stub
			return lhs * rhs;
		}
	}, DIVIDE {
		@Override
		public
		int getValue(int lhs, int rhs) {
			// TODO Auto-generated method stub
			return lhs / rhs;
		}
	};
	
	public abstract int getValue(int lhs, int rhs);
}

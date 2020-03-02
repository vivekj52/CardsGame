package com.khoslalabs;

public enum Value {

	TWO(1),
	THREE(2),
	FOUR(3),
	FIVE(4),
	SIX(5),
	SEVEN(6),
	EIGHT(7),
	NINE(8),
	TEN(9),
	JACK(10),
	KING(11),
	QUEEN(12),
	ACE(13);
	
	private int val;
	
	Value(int val){
		this.val = val;
	}
	
	public int getVal() {
		return this.val;
	}

}

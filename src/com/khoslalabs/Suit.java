package com.khoslalabs;

public enum Suit {

	SPADES(4),
	HEART(3),
	CLUB(2),
	DIAMOND(1);
	
	private int priority;
	
	Suit(int priority){
		this.priority = priority;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
}

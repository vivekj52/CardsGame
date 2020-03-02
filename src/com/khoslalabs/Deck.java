package com.khoslalabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cardsList;
	
	public Deck() {
		
		this.cardsList = new ArrayList<Card>(Suit.values().length * Value.values().length);
		
		//Initializing the Deck
		for(Suit s: Suit.values()) {
			for(Value v: Value.values()) {
				Card card = new Card(s, v);
				cardsList.add(card);
			}
		}
		
		System.out.println("--------------------------DECK IS READY-----------------------------");
	}
	
	public void suffle() {
		Collections.shuffle(cardsList);
		System.out.println("------------------------DECK IS SUFFLED------------------------------");
	}
	
	public void printAllCards() {
		System.out.println("------------------------Cards in DECK--------------------------------");
		for(Card card: cardsList) {
			System.out.println(card);
		}
		System.out.println("---------------------------------------------------------------------");
	}
	
	public Card getACard() {
		
		if(cardsList.size() == 0) {
			throw new RuntimeException("No more cards in the Deck!!");
		} else {
			Random random = new Random();
			int randomNumber = random.nextInt(cardsList.size());
			return cardsList.remove(randomNumber);
		}
	}
	
	public void addACard(Card card) {
		cardsList.add(card);
	}
}

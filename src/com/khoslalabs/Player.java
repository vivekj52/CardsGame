package com.khoslalabs;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String playerName;
	private List<Card> cardsHolding;
	
	public Player(String playerName) {
		this.playerName = playerName;
		cardsHolding = new ArrayList<Card>();
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public List<Card> getCardsHolding() {
		return cardsHolding;
	}

	public void printAllCards() {
		
		if(cardsHolding.size() == 0) {
			System.out.println("------>>>>>>>>" + playerName + "<<<<<<------- does not have any card!!------");
			return;
		}
		
		System.out.println("--------------All Cards of -->>>>"+ playerName + "<<<<------------------------");
		for(Card card: cardsHolding) {
			System.out.println(card);
		}
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public void pullACard(Deck deck) {
		Card pulledCard = deck.getACard();
		cardsHolding.add(pulledCard);
	}
	
	public void returnAllCards(Deck deck) {
		for(Card card: cardsHolding) {
			deck.addACard(card);
		}
		cardsHolding = new ArrayList<Card>();
	}
	
	public int getTotalCardValue() {
		int result = 0;
		for(Card card: cardsHolding) {
			result += card.mapToWeight();
		}
		return result;
	}

}

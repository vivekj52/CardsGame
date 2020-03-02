package com.khoslalabs;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private Deck deck;
	private List<Player> players;
	
	public Game() {
		deck = new Deck();
		players = new ArrayList<Player>();
		System.out.println("-------------->>>>>>>>>>>>  GAME IS READY <<<<<<<<<<------------------");
	}
	
	public void addAPlayer(String playerName) {
		Player player = new Player(playerName);
		players.add(player);
		System.out.println("Player  ---->>>>" + playerName + "<<<<----  added into Game");
	}
	
	public void printDeck() {
		deck.printAllCards();
	}
	
	public void suffleDeck() {
		deck.suffle();
	}
	
	public void distributeCards() {
		
		if(players.size() == 0) {
			System.out.println("---------------There are no players to distribute cards!!---------------");
			return;
		}
		
		for(Player player: players) {
			player.pullACard(deck);
		}
		System.out.println("--------->>>> ONE card given to all the players <<<<-------------");
	}
	
	
	public void returnAllCards() {
		
		if(players.size() == 0) {
			System.out.println("---------------There are no players!!---------------");
			return;
		}
		
		for(Player player: players) {
			player.returnAllCards(deck);
		}
		System.out.println("-------->>>>>>> All cards are returned into DECK <<<<----------------");
	}
	
	
	public void removePlayer(String name) {
		Player tobeRemoved = null;
		for(Player player: players) {
			if(player.getPlayerName().equalsIgnoreCase(name)) {
				tobeRemoved = player;
				break;
			}
		}
		if(tobeRemoved == null) {
			System.out.println("Player---->>>>" + name + "<<<<---does not exist in game");
		} else {
			tobeRemoved.returnAllCards(deck);
			players.remove(tobeRemoved);
		}		
	}
	
	public void printAllPlayerCards() {
		if(players.size() == 0) {
			System.out.println("--------------------There are no players!!--------------------");
			return;
		}
		for(Player player: players) {
			player.printAllCards();
		}
	}
	
	public void printWinner() {
		
		if(players.size() < 2) {
			System.out.println("-----------------There are no enough players!!-----------------------");
			return;
		}
		
		Player winner = null;
		int max = 0;
		for(Player player: players) {
			if(player.getTotalCardValue() > max) {
				max = player.getTotalCardValue();
				winner = player;
			}
		}
		if(winner != null) {
			System.out.println("Winner is -->>>>" + winner.getPlayerName() + "<<<<----");
		}
	}

}

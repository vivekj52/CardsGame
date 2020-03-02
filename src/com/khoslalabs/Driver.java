package com.khoslalabs;

import java.util.Scanner;

public class Driver {
	
	static Scanner sc = new Scanner(System.in);
	static Game game;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Game of Cards!!");

		while(true) {
			System.out.println("Press 1 to start or reset the Game" + "\n"
								+ "Press 2 to suffle the Deck" + "\n"
								+ "Press 3 to add a new Player"+ "\n"
								+ "Press 4 to print the Deck"+ "\n"
								+ "Press 5 to distribute some Cards"+ "\n"
								+ "Press 6 to return all cards to deck" + "\n"
								+ "Press 7 to remove a player" + "\n"
								+ "Press 8 to print all player cards" + "\n"
								+ "Press 9 to print the winner");
			
			int option = sc.nextInt();
			
			switch (option) {
			case 1: { game = new Game(); break;} 
			case 2: { game.suffleDeck(); break;} 
			case 3: {
					System.out.println("Enter the name of player");
					game.addAPlayer(sc.next());
					break;
				}
			case 4: { game.printDeck();break;} 
			case 5: { game.distributeCards();break;} 
			case 6: { game.returnAllCards(); break;}
			case 7: {
				System.out.println("Enter the name of player");
				game.removePlayer(sc.next());
				break;
			}
			case 8: { game.printAllPlayerCards(); break;}
			case 9: { game.printWinner(); break;}

			default:
				System.out.println("Wrong input!! Please try again.");
			}
		}
	}

}

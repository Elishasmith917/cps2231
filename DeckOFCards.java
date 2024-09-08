package cps_2231_Assignment2;

public class DeckOFCards {
	/********************************************************************************************
	 * 
	 * Kean University
	 * Spring 2024
	 * Course: CPS 2231- Computer Programming
	 * 
	 * Author: Elisha Marie Smith- CPS 2231- Section 02
	 * Assignment: 2
	 * Task #1
	 * Program Description: will create a program that will randomly select four cards from a deck of 52 cards
	 * 
	 *********************************************************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] deck = new int [52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = { "Ace", "2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		// initaialize cards
		for (int i = 0; i< deck.length; i++)
			deck[i] = i ;
		
		// shuffle the cards 
		for(int i = 0; i<deck.length; i++) {
			// generate an index randomly 
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		// Display the first four cards 
		for(int i = 0; i< 4; i++) {
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			System.out.println("Card number " + deck[i]+ ":" + rank + " of " + suit);
		}

	}

}

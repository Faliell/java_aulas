package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		
		do {
			displayWord();
			getUserInput();
			checkUserInput();
		} while(running);
	}
	
	private void checkUserInput() {
		if(word.isComplete()) {
			System.out.println("You won");
			System.out.println("The word is " + word);
			running = false;
		}
		
		
	}

	private void getUserInput() {
		System.out.print("Enter your guess: ");
		String guess = scanner.nextLine();
		char c;
		word.addGuess(guess.charAt(0));
		
	}

	void displayWord() {
		System.out.println(word);
	}

	public void close() {
		scanner.close();
		
	}
}

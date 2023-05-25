package application;

public class Hangman {
	private boolean running = true;
	private RandomWord word = new RandomWord();
	
	void run() {
		
		do {
			displayWord();
			getUserInput();
			checkUserInput();
			
		}while(running);
	}
	
	void displayWord() {
		System.out.println(word);
		
	};
	
	void getUserInput() {
		
	};
	
	void checkUserInput() {
		
	};
}

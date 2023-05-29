package application;

import java.util.Arrays;
import java.util.Random;

public class RandomWord {
	private String[] words = { "apple", "banana", "cat", "dog", "elephant", "fish", "guitar", "hat", "island", "jungle",
			"kangaroo", "lion", "monkey", "noodle", "ocean", "piano", "queen", "rabbit", "sun", "sun", "tiger" };

	private String chosenWord;
	private char[] characters;

	public RandomWord() {
		Random random = new Random();
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	public String toString() {

		StringBuilder text = new StringBuilder();

		for (char c : characters) {
			text.append(c == '\u0000' ? "-" : c);
			text.append(" ");

		}
		String result = text.toString();
		return result;
	}

	public void addGuess(char c) {
		for(int i=0; i<chosenWord.length(); i++) {
			if (chosenWord.charAt(i) == c) {
				characters[i] = c;
			}
			
		}
		
	}
}

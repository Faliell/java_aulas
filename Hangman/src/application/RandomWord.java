package application;

import java.util.Arrays;
import java.util.Random;

public class RandomWord {
	private String[] words = {"apple", "banana", "cat", "dog", "elephant", "fish", "guitar", "hat", 
            "island", "jungle", "kangaroo", "lion", "monkey", "noodle", "ocean", 
            "piano", "queen", "rabbit", "sun", "sun", "tiger"};
	
	private String chosenWord;
	private char[] characters;
	
	public RandomWord() {
		Random random = new Random();
		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];
	}

	public String toString() {
		
		String text = "";
		
		characters[1] = 'b';
		
		for (char c: characters) {
			if(c == ' ') {
				text += '_';
			}
			else {
				text += c;
			}
			text += " ";
			
		}
		
		return text;
	}
}
	
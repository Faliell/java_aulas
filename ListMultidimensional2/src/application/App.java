package application;

public class App {

	public static void main(String[] args) {
		String[][] text = {
				{ "one", "two", "three" },
				{ "four", "five", "six" },
				{ "seven", "eight", "nine" } 
			};

		System.out.println(text[1][1]);
		
		text[1][1] = "blue";
		
		for(int i = 0; i < text.length; i++) {

			for(int j = 0; j < text[i].length; j++) {
				System.out.printf("%s\t", text[i][j]);	
			}
			System.out.println();

		}

	}

}

package application;


public class App {

	public static void main(String[] args) {
		
		//unicode
		
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = '\u0000';
		System.out.println(c2);
		
		char c3 = 77;
		System.out.println(c3);
		
		char c4 = '\u27AB';
		System.out.println(c4);
		
		String text = "orange";
		
		char c5 = text.charAt(4);
		System.out.println(c5);

	}

}

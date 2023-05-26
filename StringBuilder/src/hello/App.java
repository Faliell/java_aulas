package hello;

public class App {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("I´m ");
		sb1.append("a ");
		sb1.append("dog ");
		
		System.out.println(sb1);
		
		String result = sb1.toString();
		System.out.println(result);
		
		StringBuilder sb2 = new StringBuilder("I ")
				.append("am ").append("a ").append("cat");
		
		System.out.println(sb2);
	}
}
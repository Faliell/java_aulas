package hello;

public class App {

	public static void main(String[] args) {
		
		String name = "Joe";
				
		if(name.equals("JOE")) {
			System.out.println("a");
		}
		if(name.equalsIgnoreCase("JOE")) {
			System.out.println("b");
		}
		
		System.out.printf("the length %s is %d", name, name.length());
		
	}
}
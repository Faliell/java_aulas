package application;

public class App {
	public static void main(String[] args) {
		
		int count = 0;
		while(count < 10) {
			System.out.printf("Count: %d\n", count);
			// o q é criado entre {} fica aqui
			String escopo = "fica aqui";
			count += 1;
		}
		
		// erro:
		// System.out.println(escopo);
	

	}
}

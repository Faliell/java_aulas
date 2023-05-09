import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean finish = false;
		
		while(!finish) {
			System.out.println("Write, start or stop or quit");
			String input = scanner.nextLine().toUpperCase();
			System.out.println(input);
			if (input.equals("START")) {
				
				System.out.println("Beging");
			}
			else if(input.equals("STOP")) {
				System.out.println("Stoping");
			}
			
			else if(input.equalsIgnoreCase("QUIT")) {
				System.out.println("Quiting");
				finish = true;
			}
			else {
				System.out.println("Wrong comannd");
			}
		}
		scanner.close();
		
	}

}

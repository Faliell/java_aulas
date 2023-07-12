package application;

public class Machine implements DefaultRunnable {

	@Override
	public void run() {
		System.out.println("running");
		
	}

	@Override
	public void displayDetails() {
		System.out.println("No details");
		
	}

}

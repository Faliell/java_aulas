package application;

public interface DefaultRunnable extends Runnable{
	default void displayDetails() {
		System.out.println("default no details");
	};
}

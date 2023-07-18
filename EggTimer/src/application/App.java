package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert implements Runnable{
	@Override
	public void run() {	
		System.out.println("Timer Running");
	}	
}

class Status extends TimerTask{
	@Override
	public void run() {
		
		JOptionPane.showMessageDialog(null, "Egg Cooked!");
	}	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Status(), 20000, 20000);
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Alert(), 0, 10, TimeUnit.SECONDS);
	}

}

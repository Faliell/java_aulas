package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
	
}


class Status extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Status(), 0, 1000);
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Alert(), 0, 1, TimeUnit.SECONDS);
	}

}

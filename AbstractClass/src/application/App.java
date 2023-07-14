package application;

import java.util.Timer;
import java.util.TimerTask;


class Task extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	
}


public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
	}

}

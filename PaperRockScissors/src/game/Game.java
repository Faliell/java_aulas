package game;

import java.util.Random;

import game.objects.GameObjects;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObjects[] objects = {new Rock(), new Paper(), new Scissors()};
	
	
	public void run() {
		System.out.println("running");
		
		Random random = new Random();
		
		GameObjects obj1 = objects[random.nextInt(objects.length)];
		GameObjects obj2 = objects[random.nextInt(objects.length)];
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.compareTo(obj2));
		
		
	}
}

package game;

import java.util.Random;

import game.objects.GameObjects;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObjects[] objects = {new Rock(), new Paper(), new Scissors()};
	
	Random random = new Random();
	
	GameObjects obj = objects[random.nextInt(objects.length)];
	
	public void run() {
		System.out.println(obj);
	}
}

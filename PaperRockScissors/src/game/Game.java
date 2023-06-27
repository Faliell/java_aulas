package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObjects;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObjects[] objects = {new Rock(), new Paper(), new Scissors()};
	
	
	public void run() {
		String[] status = {"win", "draw", "lose"};
		
		System.out.println("running");
		
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int wins = 0;
		
		for(int i = 0;i<3;i++) {
			GameObjects obj1 = objects[random.nextInt(objects.length)];
			
			System.out.println("Choose an object");
			System.out.println("1.Rock");
			System.out.println("2.Paper");
			System.out.println("3.Scissors");
			System.out.print("> ");

			int objectIndex =  scanner.nextInt();
			
			GameObjects obj2 = objects[objectIndex-1];
			
			System.out.println("PC choose " + obj1);
			System.out.println("You choose " + obj2);
			
			
			int comparision = obj1.compareTo(obj2);
			System.out.println(status[comparision+1]);
			
			wins += comparision;
			
			System.out.println("\n");
		}
		 
		scanner.close();
		System.out.println();
		
		if(wins > 0) {
			System.out.println("You have won");
		}
		else if(wins < 0) {
			System.out.println("You have lost");
		}
		else {
			System.out.println("It´s a Draw");
		}
		
		
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("You wake up and see that its very dark, in fact you cant see anything but you walk into a door and you see");
		int numEnemy = 1;
		int numEnemies = 0;
		int whatRoom[] = new int[5];
		theGame game = new theGame();
		game.startTheGame(whatRoom,numEnemies);
		System.out.println("YOU BEAT THE GAME!!! Yay you did it chief, there are a total of 7 rooms meaning that you might've missed some rooms.");
		
		
	}

	
}

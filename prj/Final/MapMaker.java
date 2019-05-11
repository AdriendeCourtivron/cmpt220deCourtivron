import java.util.Random;
import java.util.Scanner;

public class MapMaker {

	static Random rand = new Random();

	public static int[] generateMap(int[] whatRoom) {
		for (int i = 0; i < whatRoom.length; i++) {
			whatRoom[i] = rand.nextInt(10 - 1 + 1) + 1;
		}
		return whatRoom;
	}

	public static int getEnemies(int numEnemies) {
		numEnemies = rand.nextInt(3 - 1 + 1) + 1;
		return (numEnemies);

	}

	static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	static int moreThan1(String stuff) {
		if (stuff.length() > 256 ^ stuff.length() < 10) 
		{
			return -1;
		}
		boolean[] char_set = new boolean[256];

		for (int i = 0; i < stuff.length(); i++) {
			int val = stuff.charAt(i);
			if (char_set[val]) {
				return -2;
			}
			char_set[val] = true;
		}
		return 1;
	}
}

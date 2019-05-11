import java.util.Scanner;

public class BasicRoom {
	static theGame game1 = new theGame();
	static int numEnemies = 0;
	public static int choice = 0;
	static Character bill = new Character();
	static Enemy goblin = new Enemy();
	static Scanner input = new Scanner(System.in);

	public static void testRoom() {
		System.out.println("This is the testing room if you are here that means something went wrong");
		numEnemies = MapMaker.getEnemies(numEnemies);
		System.out.println("There are a total of " + numEnemies);
		for (int i = 0; i != numEnemies; i++) {
			game1.startCombat(bill, goblin);
			theGame.inventorySwap(bill);
		}

	}

	public static void room1() {

		while (choice != 3) {
			Scanner input = new Scanner(System.in);
			System.out.println("You think you see some enemies ahead");
			System.out.println("1. look left");
			System.out.println("2. look right");
			System.out.println("3. start combat");
			choice = input.nextInt();
			if (choice == 1) {
				System.out.println("you find something on the ground, my god its a bigger backpack.");
				bill.increaseInventory();
			}
			if (choice == 2) {
				System.out.println("There is nothing over there");
			}
			if (choice == 3) {
				numEnemies = MapMaker.getEnemies(numEnemies);
				System.out.println("There are a total of " + numEnemies);

				for (int i = 0; i != numEnemies; i++) {
					game1.startCombat(bill, goblin);
					theGame.inventorySwap(bill);
				}

			}
		}
	}

	static void room2() {
		System.out.println("You see a wall and it says to Enter a numeric Palindrome");
		int number = input.nextInt();
		if (number == MapMaker.reverse(number)) {
			System.out.println(
					"You entered a PALINDROME, wow your a smart one arent you, anyways you continue and you pick up a spare health potion");
			{
				Character.addHealthPotion();
				numEnemies = MapMaker.getEnemies(numEnemies);
				System.out.println("There are a total of " + numEnemies);
				for (int i = 0; i != numEnemies; i++) {
					game1.startCombat(bill, goblin);
					theGame.inventorySwap(bill);
				}

			}
		} 
		else {
			System.out.println(
					"wow, its a simple number you think to yourself, you start listing palindromes such as 101, 202, 303,"
							+ "you think maybe I should try one of these");
			if (number == MapMaker.reverse(number)) {
				System.out.println(
						"You entered a PALINDROME, wow your a smart one arent you, anyways you continue only to see a broken glass that looked like it could"
								+ "be a health potion");
				{
					numEnemies = MapMaker.getEnemies(numEnemies);
					System.out.println("There are a total of " + numEnemies);
					for (int i = 0; i != numEnemies; i++) {
						game1.startCombat(bill, goblin);
						theGame.inventorySwap(bill);
					}

				}
			}
		}
	}

	static void room3() {
		System.out.println(
				"Wow this room looks interesting you think to yourself, you move a couple of steps to read the sign."
						+ " it says to enter a sentence that has no more than 2 of the same character");
		String stuff = input.next();
		choice = MapMaker.moreThan1(stuff);
		if (choice == -1) {
			System.out.println(
					"Jeez you think to yourself, he programmed mininum and maximum limit, fooled again oh well you think to yourself. you engage the enemies");
			numEnemies = MapMaker.getEnemies(numEnemies + 5);
			System.out.println("There are a total of " + numEnemies);
			for (int i = 0; i != numEnemies; i++) {
				game1.startCombat(bill, goblin);
				theGame.inventorySwap(bill);
			}
		}
		while (choice == -2) {
			System.out.println("Damn must've messed up somewhere you think, but you get to try again");
			stuff = input.next();
		}
		if (choice == 1) {
			System.out.println("wow you did it, congratz on the first try as well so you will be rewarded");
			{
				numEnemies = MapMaker.getEnemies(numEnemies / 2);
				System.out.println("There are a total of " + numEnemies);
				for (int i = 0; i < numEnemies; i++) {
					game1.startCombat(bill, goblin);
					theGame.inventorySwap(bill);
				}
				
			}
		}
	}
	static void room4()
	{
		System.out.println("You get swarmed by enemies, you fight them");
		numEnemies = 1;
		System.out.println("There are a total of " + numEnemies);
		for (int i = 0; i != numEnemies; i++) {
			game1.startCombat(bill, goblin);
			theGame.inventorySwap(bill);
			
		System.out.println("You see a golden room filled with nothing but chests with that sweet sweet loot. You run twords it and wow look there a are no enemies");
		if (Character.inventoryFull() == true) {
			System.out.println("Looks like your inventory is full, that is a shame my friend");
			
		}
		System.out.println("You find two health potions, a shield and wow a sword that appears to have a white wolf as its pommel");
		bill.addHealthPotion();
		bill.addShortClaw();
		bill.addHealthPotion();
		bill.addShield();
		
	}
	}
	static void room5()
	{
		System.out.println("you walk in and you see some writing on the wall. Looks simple enough you think and it is all it says is enter a even number, then enter an odd number");
		System.out.println("please enter an even number");
		int even = input.nextInt();
		{
			if (even /2 == 0)
			{
				bill.addHealthPotion();
			}
			else 
			{
				numEnemies = MapMaker.getEnemies(numEnemies / 2);
				System.out.println("There are a total of " + numEnemies);
				for (int i = 0; i != numEnemies; i++) 
				{
					game1.startCombat(bill, goblin);
					theGame.inventorySwap(bill);
				}
				System.out.println("please enter an odd number");
				int odd = input.nextInt();
				if(odd /2 == 1)
				{
					bill.addClub();
				}
				else
				{
					numEnemies = MapMaker.getEnemies(numEnemies * 2);
					System.out.println("There are a total of " + numEnemies);
					for (int i = 0; i != numEnemies; i++); 
				}
			}
			
		}
	}
	static void room6()
	{
		System.out.println("You walking into the room only to find youself at another wall with nothing else but a wall of text saying Winter is coming");
		bill.addClub();
		bill.addHealthPotion();
		numEnemies = MapMaker.getEnemies(numEnemies / 2);
		System.out.println("There are a total of " + numEnemies);
		for (int i = 0; i != numEnemies; i++) 
		{
			game1.startCombat(bill, goblin);
			theGame.inventorySwap(bill);
		}
	}
	static void room7()
	{
		System.out.println("Oh man you found a bed and and a nice little place to rest with a bag upgrade as well!");
		bill.increaseInventory();
		bill.setHealth(100);
	}
	
}

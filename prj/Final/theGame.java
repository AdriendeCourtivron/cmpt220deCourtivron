import java.util.Scanner;

public class theGame extends BasicRoom
{
	
	
	public theGame()
	{
		super();
	}

	public static void startTheGame(int[] whatRoom, int numEnemies)
	{
		whatRoom = MapMaker.generateMap(whatRoom);
		decideRoom(whatRoom,numEnemies, bill);
	}
	
	private static void decideRoom(int[] whatRoom, int numEnemies,Character bill) 
	{
		for( int i = 0; i < whatRoom.length; i++)
		{
			if(bill.getHealth() <= 0)
			{
				System.out.println("you lost the game");
				break;
			}
			if(whatRoom[i] == 1)
			{
				BasicRoom.room1();
			}
			else if(whatRoom[i] == 2)
			{
				BasicRoom.room2();
				}
			else if(whatRoom[i] == 3)
			{
				BasicRoom.room3();
			}
			else if(whatRoom[i] == 4)
			{
				BasicRoom.room4();
			}
			else if(whatRoom[i] == 5)
			{
				BasicRoom.room5();
			}
			else if(whatRoom[i] == 6)
			{
				BasicRoom.room6();
			}
			else if(whatRoom[i] == 7)
			{
				BasicRoom.room7();
			}
			else if(whatRoom[i] == 8)
			{
				BasicRoom.room5();
			}
			else if(whatRoom[i] == 9)
			{
				BasicRoom.room3();
			}
			else if(whatRoom[i] == 10)
			{
				BasicRoom.room4();
			}
			
			
		}
		
	}

	static void startCombat(Character bill, Enemy goblin) 
	{
		Scanner input = new Scanner(System.in);
		int myHealth = bill.getHealth();
		int enemyHealth = goblin.getHealth();
		
		while (myHealth > 0 ^ enemyHealth < 0) 
		{ 
			// enemy's turn begins
			int attack = (Math.random() <= 0.5) ? 1 : 2;
			if (attack == 1) 
			{
				int damage = goblin.doPunch();
				myHealth -= damage;
				System.out.println("he did: " + damage + " damage");
			}
			
			if (attack == 2) 
			{
				int damage = goblin.doKick();
				myHealth -= damage;
				System.out.println("he did: " + damage + " damage");
			}
			System.out.println("Your current health is " + myHealth + ". the enemy's health is " +enemyHealth);
			System.out.println("1. do a punch");
			System.out.println("2. do a kick");
			System.out.println("3. use your currently equipped weapon");
			System.out.println("4. Heal yourself");		
			System.out.println("5. would you like to use the shield?");
			int choice = input.nextInt();

			if (choice == 1) {
				int damage = bill.doPunch();
				enemyHealth -= damage;
				System.out.println("you did: " + damage + " damage");
			}
			
			if (choice == 2) {
				int damage = bill.doKick();
				enemyHealth -= damage;
				System.out.println("you did: " + damage + " damage");

			}
			
			if (choice == 3) {
				int damage = bill.useWeapon();
				enemyHealth -= damage;
				System.out.println("you did: " + damage + " damage");
			
			}
			
			if (choice == 4)
			{
				int havePotion = bill.useHeathPotion();
				if (havePotion == 1)
				{
					myHealth = myHealth + 10;
				}
				else
				{
					System.out.println("You have no potions remaining");
				}
				
			}
			if (choice == 5)
			{
				int damage = attack;
				if (bill.hasShield() == true)
				{
					bill.useShield(damage);
				}
			}
			
			bill.setHealth(myHealth);
		}

	}
	public static void inventorySwap(Character bill)
	{
		Scanner input = new Scanner(System.in);
		int choice = -1;
		while( choice != 0)
		{
			System.out.println("Would you like to edit your inventory?(1 to edit 0 to not");
			choice = input.nextInt();
			if (choice == 1)
			{
				System.out.println("please enter the index of the item");
				int index = input.nextInt();
				bill.removeThing(index);
			}
			
		}
	}
}



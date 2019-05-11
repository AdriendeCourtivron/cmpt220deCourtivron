
public class Character extends Creature {

	public Character() {
		super();
	}

	public Character(int health, int[] inventory) {
		super(health, inventory);
		this.health = 100;
		this.inventory = inventory;

	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return super.getHealth();
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health);
	}

	public int[] getInventory() {
		// TODO Auto-generated method stub
		return getInventory();
	}

	@Override
	public void setInventory(int[] inventory) {
		// TODO Auto-generated method stub
		super.setInventory(inventory);
	}

	@Override
	public int doKick() {
		// TODO Auto-generated method stub
		return super.doKick();
	}

	@Override
	public int doPunch() {
		// TODO Auto-generated method stub

		return 3;
	}

	@Override
	public int useWeapon() {
		// TODO Auto-generated method stub
		return super.useWeapon();
	}

	public int useHeathPotion() {
		int answer = 0;
		int numLeft = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == 2) {
				inventory[i] = 0;
				answer = 1;
				break;

			}
			if (inventory[i] == 2) {
				numLeft++;
			} else {
				answer = 0;
			}
		}
		return (answer);
	}

	public int[] increaseInventory() {
		int backPackUpgrade[] = new int[inventory.length + 5];
		for (int i = 0; i < inventory.length; i++) {
			backPackUpgrade[i] = inventory[i];
		}
		inventory = backPackUpgrade;
		System.out.println("Your new inventory size is" + inventory.length);
		return (inventory);
	}

	public static boolean inventoryFull() {
		int emptySpaces = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == 0) {
				emptySpaces++;
				System.out.println("Your out of space");
				return false;
			}
		}
		System.out.println("there are a total of " + emptySpaces + " left");
		return (true);
	}

	public static int[] addHealthPotion() {
		for (int i = 1; i < inventory.length; i++)
			if (inventory[i] == 0) {
				inventory[i] = 2;
				break;
			}
		return inventory;

	}

	public static int[] addShield() {
		for (int i = 1; i < inventory.length; i++) {
			if (inventory[i] == 0) {
				inventory[i] = 4;
				break;
			}

		}
		return inventory;

	}

	public boolean hasShield() {
		for (int i = 1; i < inventory.length; i++) {
			if (inventory[i] == 4) {
				return true;
			}
		}
		return false;
	}

	public int useShield(int damage) {
		return Weapons.useShield(health);
	}

	public static int[] addClub() {

		inventory[0] = 3;
		return inventory;
	}

	public static int[] addShortClaw() {

		inventory[0] = 4;
		return inventory;
	}
	
	public static void removeThing(int index)
	{
		if(inventory[index] != 0)
		{
			inventory[index] = 0;
		}
	}
}

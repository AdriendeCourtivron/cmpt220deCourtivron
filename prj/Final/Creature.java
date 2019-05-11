
public abstract class Creature
{
	int health = 100;
	static int inventory[] = {1,0,2,2,0};
	int damage;
	
	Creature()
	{
		
	}
	
	Creature(int health, int[] inventory) 
	{
		this.health = health;
		this.inventory = inventory;
		
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}


	public int[] getInventory() {
		return inventory;
	}

	public void setInventory(int[] inventory) {
		this.inventory = inventory;
	}
	
	public int doKick() 
	{
		damage = 3;
		return damage;
	}
	
	public int doPunch()
	{
		damage = 5;
		return damage;
	}
	
	public int useWeapon()
	{
		if (inventory[0] == 1)
		{
			return Weapons.swordDamage();
		}
		else if (inventory[0] == 3)
		{
			return Weapons.clubDamage();
		}
		else if (inventory[0] == 4)
		{
			return Weapons.shortClaw();
		}
		return 0;
	}
	


}





public class Enemy extends Creature {

	public Enemy() {
		super();
	}

	public Enemy(int health, int[] inventory) {
		super(health,inventory);
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

	@Override
	public int[] getInventory() {
		// TODO Auto-generated method stub
		return super.getInventory();
	}

	@Override
	public void setInventory(int[] inventory) {
		// TODO Auto-generated method stub
		super.setInventory(inventory);
	}

	@Override
	public int doKick() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int doPunch() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int useWeapon() {
		// TODO Auto-generated method stub
		return Weapons.swordDamage();
	}

}

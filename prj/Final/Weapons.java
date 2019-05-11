
public class Weapons
{
	private int deBug = 1000;
	int sword = 1;
	int potions = 2;
	int club = 3;
	int shield = 4;
	int shortClaw = 5;
	
	public static int swordDamage()
	{
		return (int) (12);
	}
	public static int clubDamage()
	{
		return (int) (16);
	}
	public static int shortClaw()
	{
		return (int) (60);
	}
	public static int useShield(int damage)
	{
		return damage / 4;
	}
}
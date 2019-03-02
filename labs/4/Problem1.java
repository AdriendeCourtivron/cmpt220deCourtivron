
public class Problem1
{
	public static void main(String[] args)
	{	
		System.out.println("This will increase in by 1 and cm by 5");
		int in1 = 1;
		double cm1 = 2.54;
		int cm2 = 1;
		double in2 = .39;
		for (int i = 0; i < 50; i++)
		{
			in1++;
			cm1 += 2.54;
			cm2 += 5;
			in2 += .39;
			System.out.print("IN = " + in1 + " CM = " + cm1 + " | CM = " + cm2 + " IN = " + in2 + "\n");
		}
	}
}

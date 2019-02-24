import java.util.Scanner;
public class Problem7 
{
	public static void main(String[] args)
	{
		// Set things up
		Scanner input = new Scanner(System.in);
		System.out.println("please enter an integer");
		double num = input.nextInt();
		power(num);
		
	}

	private static void power(double num)
	{
		for (int count = 0; count < 50; count++)
		{
			num = (num * 3);
			double finalNum =(Math.pow(num,2) - num) / 2; // JA
			if (count %10 == 0)
			{
				System.out.println(finalNum);
			}
			else 
			{
				System.out.print(finalNum + " ");
			}
				
			num++;
		}
	}
}
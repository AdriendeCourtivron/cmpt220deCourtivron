import java.util.Scanner;
public class Problem2 
{

	public static void main(String[] args)
	{
		System.out.println("This will print out all numbers from 100 to 500 that are "
				+ "disivble by  5 or 7"); // JA: but not both
		int number = 100;
		while (number <= 500)
		{
			if (number % 5 == 0)
			{
				System.out.print(number + " ");
			}
			else if (number % 7 == 0)
			{
				System.out.print(number + " ");
			}
			number++;
				
		}//While loop
	}//Main	
}//Class

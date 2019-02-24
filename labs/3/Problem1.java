import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args)
	{
		// Set things up
		Scanner input = new Scanner(System.in);
		int number = 1; 
		int evens = 0;
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		//Start the while loop for the numbers
		while (number != 0) 
		{
			count++;
			System.out.println("Please enter a number: ");
			number = input.nextInt();
			if (number % 2 == 0) // JA
				evens++;
			sum += number;
			
			avg += sum % count;
		}//While
		System.out.println("The number of even numbers: "+ evens + "The total sum of the numbers are: "
				+ sum + " and the total average is " + avg);
		
	}//Main 
		
}//Class

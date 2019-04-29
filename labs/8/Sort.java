import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort 
{

	public static void main(String[] args)
	{
		ArrayList sort = new ArrayList();
		System.out.println("please enter numbers to sort press -1 to quit");
		Scanner input = new Scanner(System.in);
		int num = '1';
		while (num != -1)
		{
			System.out.println("please enter a number or -1 to quit");
			System.out.println(sort.toString());
			sort.add(num);
			num = input.nextInt();
		}
		sort(sort);
			

	}
	
	// JA: You had to code the algorithm
	public static void sort(ArrayList sort) 
	{
		Collections.sort(sort);
		System.out.println(sort.toString());
	}

}

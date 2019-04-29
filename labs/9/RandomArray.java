import java.util.Scanner;

public class RandomArray 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int random[] = new int [100];
		for ( int i = 0; i < 100; i++)
		{
			System.out.println("nice");
			random[i] = (int) (Math.random() * 20);
			
		}//Listen ends
		
		// Where do you handle the exception?
		System.out.println("please enter the placement of a number");
		int choice = input.nextInt();
		for( int i = 0; i < random.length; i++)
			{
			if (choice == i)
				{
				System.out.println(random[i]);
				}
			}
	}
}
	

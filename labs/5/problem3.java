import java.util.Scanner;

public class problem3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("please enter the first number");
		int num1 = input.nextInt();
		System.out.println("please enter the second number");
		int num2 = input.nextInt();
		System.out.println("please enter the third number");
		int num3 = input.nextInt();
		System.out.println("please enter the fourth number");
		String name1 = input.next();
		System.out.println("please enter the fifth number");
		String name2 = input.next();
		System.out.println("please enter the sixth number");
		String name3 = input.next();
		int [] numbers = {num1,num2,num3};
		String [] names = {name1,name2,name3};
		int temp;
		int count = numbers.length;
		   for (int i = 1; i < count; i++) 
		   {
		    for (int j = i; j > 0; j--)
		    {
		     if (numbers[j] < numbers [j - 1]) 
		     {
		      temp = numbers[j];
		      numbers[j] = numbers[j - 1];
		      numbers[j - 1] = temp;
		     }
		    }
		   }		
	}
}
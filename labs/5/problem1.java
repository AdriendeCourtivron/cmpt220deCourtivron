import java.util.ArrayList;
import java.util.Scanner;
public class problem1 
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("This will go through a list and finds the largest element in an array of double values with the\r\n" + 
				"following header:\r\n" +"");
		System.out.println("please enter the first number");
		double num1 = input.nextDouble();
		System.out.println("please enter the second number");
		double num2 = input.nextDouble();
		System.out.println("please enter the third number");
		double num3 = input.nextDouble();
		System.out.println("please enter the fourth number");
		double num4 = input.nextDouble();
		System.out.println("please enter the fifth number");
		double num5 = input.nextDouble();
		System.out.println("please enter the sixth number");
		double num6 = input.nextDouble();
		System.out.println("please enter the sixth number");
		double num7 = input.nextDouble();
		System.out.println("please enter the eigth number");
		double num8 = input.nextDouble();
		System.out.println("please enter the nineth number");
		double num9 = input.nextDouble();
		System.out.println("please enter the tenth number");
		double num10 = input.nextDouble();
		double [] number = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
		System.out.print("The Max number is: " + array(number));
		
	}

	private static double array(double[] number) {
		// TODO Auto-generated method stub
		int count = number.length;
		double max = 0;
		for (int i = 0; i < count;i++)
		{
			if (number[i] > max )
			{
				max = number[i];
			}
		}
		return (max);
	}
}

import java.util.Scanner;

public class Problem2
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
		double mean= mean(number);
		System.out.print("The standard mean is : " + mean + " the standard deviation is " + deviation(number,mean));
	}

	private static double mean(double[] number) 
	{
		int count = number.length;
		double max = 0;
		for (int i = 0; i < count;i++)
		{
			max += number[i];
		}
		max	= max/10;
		return (max);
	}

	private static double deviation(double[] number, double mean) 
	{
		int count = number.length;
		double newMean = 0;
		double finalVal = 0;
		double temp = 0;
		for (int j = 0; j <count; j++)
		{
			temp = Math.pow(number[j] - mean, 2);
			number[j] = temp;
		}
		for (int i = 0; i < count; i++)
		{
			newMean += number[i];
		}
		newMean = newMean / 9; // JA
		finalVal = Math.sqrt(newMean);
		return finalVal;
	}

}

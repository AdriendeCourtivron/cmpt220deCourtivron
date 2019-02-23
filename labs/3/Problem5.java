import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the first number");
		double num1 = input.nextDouble();
		System.out.println("please enter the second number");
		double num2 = input.nextDouble();
		System.out.println("please enter the third number");
		double num3 = input.nextDouble();
		System.out.println("The Average of the three numbers are " + doubleaverage(num1,num2,num3));
		

	}

	private static double doubleaverage(double a, double b, double c)
	{
		double avg = (a + b + c) / 3;
		return avg;
	}

}

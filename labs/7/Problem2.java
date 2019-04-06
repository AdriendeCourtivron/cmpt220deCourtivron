import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args)
	{
		System.out.println("please enter a number");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		StackOfIntegers stack = new StackOfIntegers();
		FindFactors(value, stack);
		int size = stack.getSize();
		for (int i = 0; i < size; i++)
		{
			System.out.println(stack.pop() + "");
		}
	}

	public static void FindFactors(int value, StackOfIntegers stack) 
	{
		int smallestF = 2;
		for ( int k = 2; k <= value; k++) 
		{
			while (value % k == 0) 
			{
				stack.push(k);
				value = value / k;
			}
		}
	}
}

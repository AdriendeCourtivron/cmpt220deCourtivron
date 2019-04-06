import java.util.Scanner;

public class Problem1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Long Value");
		long thierLong = input.nextLong();
		MyLong myLong = new MyLong(thierLong);
		
	}
}

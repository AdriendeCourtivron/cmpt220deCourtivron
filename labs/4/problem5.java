import java.util.Arrays;
import java.util.Random;

public class problem5 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int total = 0;
		int enough = 0;
		int [] numbers = new int [1000];
		int number = 0;

		    for (int i = 0; i < 1000; i++)
		    {
		    	number = (int) (Math.random() * 100); // JA
		    	numbers[i] = number;
		    	
		    	total = total + number;
		    	
		    	
		    }
		   enough += total / 1000;
		   System.out.append("The total is" + enough);
	}
}


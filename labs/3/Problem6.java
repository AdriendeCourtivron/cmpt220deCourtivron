import java.util.Scanner;

public class Problem6 
{
	public static void main(String[] args)
	{
		// Set things up
		Scanner input = new Scanner(System.in);
		String theWord;
		System.out.println("please enter a string");
		theWord = input.nextLine();
		System.out.println("The amount of vowels in the word are: " + numVowels(theWord) );
	}

	private static int numVowels(String string)
	{
		 int count = 0;
		for	(int num = 0; num < string.length(); num++)
		{
			if (string.charAt(num) == 'a')
			{
				count++;
			}
			if (string.charAt(num) == 'i')
			{
				count++;
			}
			if (string.charAt(num) == 'o')
			{
				count++;
			}
			if (string.charAt(num) == 'e')
			{
				count++;
			}
			if (string.charAt(num) == 'u')
			{
				count++;
			}
		}
	return (count);
	}
}

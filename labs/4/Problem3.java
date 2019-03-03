import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string, this will revrse the string"
				+ "then see if it is a pelumdrone");
		String word = input.next();
		int palindrome = 0;
		char letter = '?';
		int numWord = word.length();
		char [] rLetters = new char [numWord];
		char [] letters = new char [numWord];
		
		for (int i = 0;i < numWord; i++)
		{
			letter = word.charAt(i);
			letters [i] = letter;
		}
		for (int j = numWord-1; j >= 0; j--) 
		{
			letter = word.charAt(j);
			rLetters[j] = letter;
			System.out.print(rLetters[j]);
			for (int k = 0; k < numWord; k++)
			{
				if (letters[j] == rLetters[k])
				{
					palindrome++;
				
				}
			}	
		}
		if (palindrome.equals(numWord)) // JA
		{
			System.out.print("\n" + "TRUE");
		}
		else 
		{
			System.out.print("\n" + "FALSE");
		

	}//main ends
		}
	}


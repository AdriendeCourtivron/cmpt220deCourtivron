import java.util.Scanner;
public class Problem4 
{
	public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("plese enter a string");
			String word = input.next(); // JA: You have to use nextLine() to read the whole string
			int numWord = word.length();
			int count = 0;
			char [] letters = new char [numWord];
			for (int i = 0; i < numWord; i++)
			{
				char letter = word.charAt(i);
				letters [i] = letter;
				count = 0;
				for (int j = 0;j <numWord;j++)
				{
					if (letter == letters[j])
					{
						count++;
					}
				}
			System.out.print(letter + " = " + count);
			}
		}			
}

	

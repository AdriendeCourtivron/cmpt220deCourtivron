
public class Problem3
{
		public static void main(String[] args)
		{
			char ch1 = 1;	// Start of range
			char ch2 = 100;	// End of range
			for (char c = ch1, count = 1; c <= ch2; c++, count++) 
			{
				if (count % 20 == 0)
					System.out.println(c);
				else
					System.out.print(c + " ");
			}
		}
}

import java.util.Scanner;

public class problem2 
{
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter you binary string please");
		String bin = input.next();
		System.out.println(bin2Dec(bin));
	}

		
	
		private static int bin2Dec(String bin)
		{
				Scanner input = new Scanner(System.in);
			    double j = 0;
			    for(int i = 0; i < bin.length(); i++)
			    {
			        if (bin.charAt(i) == '1')
			        {
			         j = j+ Math.pow(2, bin.length() - 1 - i);

			        }
			        
			        else if (bin.charAt(i) < '0' || bin.charAt(i) > '1')
			        		{
							throw new NumberFormatException("THIS IS NOT A BINRY STRING!!!!! PLEASE TRY AGAIN");
			        		}			        
			    }
		return (int) j;
		}






		
}

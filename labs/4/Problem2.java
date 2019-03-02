import java.util.Random;

public class Problem2 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 25;i++)
		{
		Random r = new Random();
		
		char a = (char) (r.nextInt(26) + 'a');
		
		if (i % 5 == 0 && i != 2)
			{
				System.out.println(a);
			}
		else 
			{
				System.out.print(a + " ");
			}//else end
		
		
		}//for end
		    
	}
}




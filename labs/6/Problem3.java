import java.util.Scanner;

public class Problem3 
{

	public static void main(String[] args)
	{
		int choice = 1;
		int homeGoal =0;
		int awayGoal =0;
		Scanner input = new Scanner(System.in);
		int homePlayers[] = new int [11];
		int awayPlayers[] = new int [11];
		
		for(int i = 0; i < homePlayers.length; i++)
		{
			System.out.println("Please enter the player number");
			homePlayers[i] = input.nextInt();
		}
		for(int i = 0; i < awayPlayers.length; i++)
		{
			System.out.println("Please enter the player number");
			awayPlayers[i] = input.nextInt();
		}
		
		System.out.print("Please enter the start time");
		int start = input.nextInt();
		System.out.print("Please enter the end time");
		int end = input.nextInt();
		System.out.print("Please enter the location");
		String location = input.next();
		System.out.print("Please enter the Home team name");
		String home = input.next();
		System.out.print("Please enter the visitor's names");
		String visitor = input.next();
		SoccerMatch match1 = new SoccerMatch(start,end,location,home,visitor,homePlayers,awayPlayers,homeGoal, awayGoal);
		
		while (choice != 0)
		{
		System.out.println("Please enter what you would like to do (0 to quit");
		System.out.println("1. add a Home goal");
		System.out.println("2. add an away goal");
		System.out.println("3. create a new match");
		System.out.println("4. to see the winner");
		System.out.println("5. to see home goals");
		System.out.println("6. to see away goals");
		System.out.println("7. to add a new player");
		System.out.println("8. to see a player");
		
		
		
			choice = input.nextInt();
		
			 if (choice == 1)
			{
				match1.addHomeGoal();
			}
			else if (choice == 2)
			{
				match1.addAwayGoal();
			}
			else if (choice == 3)
			{
				choice = 0;
				homeGoal =0;
				awayGoal =0;
				int homePlayers2[] = new int [11];
				int awayPlayers2[] = new int [11];
			
				for(int i = 0; i < homePlayers2.length; i++)
				{
					System.out.println("Please enter the player number");
					homePlayers2[i] = input.nextInt();
				}
				for(int i = 0; i < awayPlayers2.length; i++)
				{
					System.out.println("Please enter the player number");
					awayPlayers2[i] = input.nextInt();
				}
			
				System.out.print("Please enter the start time");
				start = input.nextInt();
				System.out.print("Please enter the end time");
				end = input.nextInt();
				System.out.print("Please enter the location");
				location = input.next();
				System.out.print("Please enter the Home team name");
				home = input.next();
				System.out.print("Please enter the visitor's names");
				visitor = input.next();
				SoccerMatch match2 = new SoccerMatch();	
			}
			
			
			else if (choice == 4)
			{
			System.out.println(match1);
				}
				
				else if (choice == 5)
				{
					System.out.println("the total for home is:" +match1.getHomeGoal());
				}
				else if (choice == 6)
				{
					System.out.println(match1.getAwayGoal());
				}
				else if (choice == 7) 
				{
					System.out.print("please enter the player's name, goals and team in order");
					String player = input.next();
					int goals = input.nextInt();
					String team = input.next();
					Players player1 = new Players();
					
				}
			}
		
		}
		
	}




// JA: No test class?
public class SoccerMatch
{
	double startTime = 1;
	double endTime = 1;
	String location = "Stamford";
	String home = "Winner";
	String visitor = "Losers";
	int homePlayers[] = new int [11]; // This had to be an array of Player objects
	int awayPlayers[] = new int [11];
	int homeGoal = 0; // This had to be an array of Goal objects
	int awayGoal = 0;
	SoccerMatch()
	{
		
	}
	SoccerMatch(double startTime,double endTime,String location,String home,String visitor,
			int homePlayers[],int awayPlayers[],int homeGoal,int awayGoal)
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.home = home;
		this.visitor = visitor;
		this.homePlayers = homePlayers;
		this.awayPlayers = awayPlayers;
		this.homeGoal = homeGoal;
		this.awayGoal = awayGoal;
		
	}
	public double getStartTime()
	{
		return startTime;
	}
	public double getEndTime() 
	{
		return endTime;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public String getHome()
	{
		return home;
	}
	
	public String getVisitor()
	{
		return visitor;
	}
	
	public int[] getHomePlayers() 
	{
		return homePlayers;
	}
	
	public int[] getAwayPlayers() 
	{
		return awayPlayers;
	}
	
	public int getHomeGoal() 
	{
		return homeGoal;
	}
	public int getAwayGoal() 
	{
		return awayGoal;
	}

	int addHomeGoal()
	{
		this.homeGoal = homeGoal + 1;
		return (homeGoal);
	}
	int addAwayGoal()
	{
		return (awayGoal + 1);
	}
	 String selectWinner()
	{
		if( homeGoal > awayGoal)
		{
			return ("Home Wins!!!!");
		}
		return home;
		
		}	
	
	
}




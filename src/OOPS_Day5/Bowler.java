package OOPS_Day5;

public class Bowler
{
	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	private double bowling_avg;
	private double strike_rate;
	
	
	public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded) 
	{
		if ((balls_bowled>0 ||runs_conceded>0)&& matches==0)
		{
			System.err.println("Error - Invalid information");
			System.exit(0);
		}
		if (balls_bowled<0 || runs_conceded<0 || matches<0 || wickets<0)
		{
			System.err.println("Error - Invalid information");
			System.exit(0);
		}

		this.name=name;
		this.wickets=wickets;
		this.matches=matches;
		this.balls_bowled=balls_bowled;
		this.runs_conceded=runs_conceded;
	}
	
	public void computeBowlingAverage()
	{
		this.bowling_avg = (this.runs_conceded/this.wickets);
		System.out.println("Bowler name = "+this.name);
		System.out.println("Wickets = "+this.wickets);
		System.out.println("Mathces = "+this.matches);
		System.out.println("Bowling Average ="+this.bowling_avg);
	}
	
	public void computeStrikeRate()
	{
		this.strike_rate= (this.balls_bowled/this.wickets);
		System.out.println("Bowler name = "+this.name);
		System.out.println("Wickets = "+this.wickets);
		System.out.println("Mathces = "+this.matches);
		System.out.println("Strike rate ="+this.strike_rate);
	}
	
	public void showStatistics()
	{
		System.out.println("Bowler name = "+this.name);
		System.out.println("Wickets = "+this.wickets);
		System.out.println("Mathces = "+this.matches);
		System.out.println("\n\nBall bowled = "+this.balls_bowled);
		System.out.println("Run conceded = "+this.runs_conceded);
		
	}
	

	
	
}
/*
Create a BLC(Business Logic Class) called Bowler. Add below details to the class. 

1. Instance variables:
 name: private-String,
 wickets: private-int,
 matches: private-int,
 balls_bowled: private-int,
 runs_conceded: private-int. 

2. Method - bowlerDetails() : public void

Create a method name called bowlerDetails() that accepts name, wickets, matches, balls_bowled and runs_conceded.

Method name: bowlerDetails 

Return type: void


3. Create below public methods,
 Method name: computeBowlingAverage
 Return type: void

 This method should print the bowling average of the bowler by dividing runs_conceded with wickets.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 bowling_avg=46.3
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: computeStrikeRate
 Return type: void

This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.

 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name: Sachin
 Strike_rate=0.61733335
 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

 Method name: showStatistics
 Return type: void

 This method should print the details of the batter.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.

 Output:
 Name=Sachin
 wickets=10
 matches=5

 balls_bowled=750
 runs_conceded=463

 Note: a. If any values are negative print 'Error'.

 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
*/
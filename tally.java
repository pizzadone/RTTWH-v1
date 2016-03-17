
public class tally {
	
	private String State;
	private int party;
	private int delR;
	private int delD;
	private int superDel;
	private int incumbent;
	public double hereDel;
	public double hereSuper;
	public static int myDel;

	public tally(double support, String State, double funds, int candi, int party, int delR, int delD, int superDel, int incumbent, int difficulty)
	{
		Universe.support = support;
		this.State = State;
		Universe.funds = funds;
		Universe.candi = candi;
		this.party = party;
		this.delR = delR;
		this.delD = delD;
		this.superDel = superDel;
		this.incumbent = incumbent;
		Universe.difficulty = difficulty;
		
	}
	
	public void nerf(int difficulty)
	{
		if (difficulty == 1)
		{
			System.out.println("At the end of the primaries, however, some of the gains you made were erased.");
			System.out.println("Other candidates are running, you know. You lost " + Universe.candi + "% support.");
			System.out.println("I bet you can get it back.");
			System.out.println("");
			Universe.support-=Universe.candi;
		}
		else if(difficulty ==2)
		{
			System.out.println("At the end of the primaries, however, some of the gains you made were erased.");
			System.out.println("Other candidates are running, you know. You lost " + Universe.candi + "% support.");
			System.out.println("I bet you can get it back.");
			System.out.println("");
			Universe.support-=Universe.candi;
		}
		else if (difficulty == 3)
		{
			System.out.println("At the end of the primaries, however, some of the gains you made were erased.");
			System.out.println("Other candidates are running, you know. You lost " + Universe.candi + "% support.");
			System.out.println("I bet you can get it back.");
			System.out.println("");
			Universe.support-=Universe.candi;
		}
		else
		{
			System.out.println("At the end of the primaries, however, some of the gains you made were erased.");
			System.out.println("The Illuminati has a hand in everything! You lost 3% support!");
			System.out.println("This is going to be hard... but freedom isn't free.");
			System.out.println("Sacrifice some integrity next turn.");
			System.out.println("");
			Universe.support-=3;
		}
	}
	
	public int doThis()
	{
		if (party == 1 && incumbent == 0)
		{
			System.out.println("As a Democrat, you are competing for a total of 720 delegates in these 7 primaries, 99 of whom are super delegates.");
			System.out.println("Thanks to " + State + ", you have earned a total of " + Universe.support + "% support and " + tally.myDel + " delegates.");
			hereDel = (Universe.support /100)*delD;
			tally.myDel += (int)hereDel;
			System.out.println("That adds up to " + (int)hereDel + " delegates out of " + delD + " possible here.");
			hereSuper = (Universe.support/100)*superDel;
			System.out.println("You also earned " + (int)hereSuper + " super delegates out of " + superDel + " possible.");
			tally.myDel += hereSuper;
			return delD + superDel;
			
		}
		else if (party == 2)
		{
			System.out.println("As a Republican, you are competing for 334 delegates in these primaries.");
			System.out.println("Thanks to " + State + ", you have earned a total of " + Universe.support + "% support and " + tally.myDel + " delegates!");
			hereDel = (Universe.support /100)*delR;
			tally.myDel += (int)hereDel;
			System.out.println("That adds up to " + (int)hereDel + " delegates out of " + delR + " possible here.");
			return delR;
		}
		else
		{
			System.out.println("As a Democrat, you are competing for a total of 720 delegates in these 7 primaries, 99 of whom are super delegates.");
			System.out.println("Thanks to " + State + ", you have earned a total of " + Universe.support + "% support.");
			hereDel = (Universe.support /100)*delD;
			tally.myDel += (int)hereDel;
			System.out.println("That adds up to " + (int)hereDel + " delegates out of " + delD + " possible here.");
			System.out.println("However, since the other running candidate is incumbent, he got all of the super delegates.");
			superDel = 0;
			return delD + superDel;
		}
		
		
	}
}


public class NomConvention {
	
	int party;
	//System.out.println("");
	
	public NomConvention(double support, int party)
	{
		Universe.support = support;
		this.party = party;
	}
	
	public void nomminee()
	{
		System.out.println("It has been a fun primary and caucus season, but you're ready to move on.");
		System.out.println("");

		System.out.println("Your party meets and dicusses the issues.");
		System.out.println("The party platform gets decided, people talk, but really it's an exercise in formality.");
		System.out.println("People already know who's going to win.");
		System.out.println("After four days, it is made clear:");
		
		int others;
		
		if(party ==1)
		{
			others = 720;
		}
		else
		{
			others = 334;
		}
		
		
		if (Universe.support >= 51)
		{
			System.out.println("Looks like you'll be moving on to the general election!");
			System.out.println("You had " + Universe.support + "% support, and " + tally.myDel + " total delegates out of a possible " + others + " delegates." );
		}
		else
		{
			System.out.println("You didn't make it. Jake from State Farm earned the nomination.");
			System.out.println("You had " + Universe.support + "% support, and " + tally.myDel + " total delegates out of a possible " + others + " delegates.");
			System.out.println("I'm sorry. You can try again in 4 years, though.");
			System.out.println("GAME OVER.");
			Universe.support =0;
			Universe.Done();
			return;
		}
		
		System.out.println("Now that the general election is upon us... There's a few changes that need to be made around here.");
		System.out.println("Go back and alter some of your stances to appeal to more moderate voters.");
		System.out.println("Remember, don't alienate your party. Good luck keeping up the momentum!");
		
		
	}
	
	public void theVictor()
	{
		System.out.println("OK! You're ready. The general population is voting.");
		System.out.println("You are at " + Universe.support + "% support. Problem is... you've got to handle the electoral college." );
		System.out.println("538 votes are going to be cast in the winner take all system. Well, except for Maine and Nebraska. You need 270 for a majority.");
		System.out.println("Let's see how many your efforts have earned.");
		System.out.println("");
		
		if (Universe.incumbent == 1)
		{
			System.out.println("It was a tough election year.");
			System.out.println("You have some support from single issue parties who were worried about the illuminati.");
			Universe.support+=1;
			System.out.println("Most of your party went bolter and supported your opponent. I mean, he has the force of the illuminati behind him.");
			System.out.println("Anyway. The election results. I just want to say it's not likely you won. Congratulations for making it this far.");
		}
		else if (Universe.incumbent == 0)
		{
			System.out.println("You made a lot of campaign decisions... and you never had a game over this run.");
			System.out.println("You should feel proud you made it this far.");
			System.out.println("For what it's worth, thanks for playing. Onward to the results!");
		}
		else
		{
			System.out.println("This option should error and you should never see it. Just t3sting.");
		}
		
		int electors = (int)(Universe.support*538)/100;
		System.out.println("You earned " + Universe.support + "% support. That's " + electors + " electors.");
		
		if (electors>=270 && Universe.incumbent!=1)
		{
		System.out.println("You did it!");
		System.out.println("You are the President of the United States!");
		System.out.println("Congrats!");
		System.out.println("Now all you have to do is run the country, and you can do this all again in 4 years!");
		System.out.println(":)");
	
		}
		else if (electors>=270 && Universe.incumbent==1)
		{
			System.out.println("You did the impossible.");
			System.out.println("You defeated the illuminati.");
			System.out.println("You have truly earned this: ");
			System.out.println("Ascii art of Donald Trump.");
			System.out.println(":$)");
			
		}
		else
		{
			System.out.println("I'm sorry. You lost.");
			System.out.println("Running for president is difficult.");
			System.out.println("But if it makes you feel better, a lot of other people lost too. Some will never get this far, "
					+ "\n even with the same amount of effort you put in.");
			System.out.println("GAME OVER.");
			System.out.println("But congrats anyway.");
			Universe.Done();
			return;
		}
		
		//System.out.println("");
		
		System.out.println("CREDITS and CITATIONS:");
		System.out.println("Game by: Mikela Gassert");
		System.out.println("Debugging: Sam Ellis");
		System.out.println("http://fortune.com/2015/03/28/campaign-financing/ for information about campaign financing");
		System.out.println("Wikipedia- confirmed general information");
		System.out.println("http://www.thegreenpapers.com/ Invaluable resource for the number side of politics");
		System.out.println("https://www.gsb.stanford.edu/faculty-research/publications/internet-vs-tv-advertising-brand-building-comparison ");
		System.out.println("Everyone else who saw this project and gave advice on my broken code, particularly Laura Wu, Madeline Lyons, Clay Wilson and John McCauley! #APCompSci #APGov");
		Universe.Done();
		}
	}

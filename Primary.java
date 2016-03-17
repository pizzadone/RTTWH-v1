import java.util.Scanner;

public class Primary {
	int place;
	int actions;
	private int caucus;
	private int kappa = 0;
	private int crazy = 0;
	
	public Primary(int place, double support, int actions, int caucus, int debateSkill, double funds)
	{
		this.place = place;
		Universe.support = support;
		this.actions = actions;
		this.caucus = caucus;
		Universe.debateSkill= debateSkill;
		Universe.funds = funds;
	}
	
	//		System.out.println("");

	
	public void gatherSupport()
	{
		System.out.println("You have a lot of options to choose from to build support for your candidacy.");
		Scanner check = new Scanner(System.in);
		
		String State = "";
		switch (place)
		{
		case 1:
		State += "Iowa";
			break;
		case 2:
			State += "New Hampshire";
			break;
		case 3:
			State += "Nevada";
			break;
		case 4:
			State += "Colorado";
			break;
		case 5:
			State += "Virginia";
			break;
		case 6:
			State += "Florida";
			break;
		case 7:
			State += "Ohio";
			break;
		default:
			State += "ERROR";
			break;
		}
		
		System.out.println("Some hard money funds have been set aside for you to buy commercials. You can't spend this money on anything else.");
		System.out.println("Would you like your commercial to positively reflect you, or would you like to make an attack ad? 1 for positive, 2 for negative.");
		int com = check.nextInt();
		
		if (com == 1)
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Political socialization: The way our environment influences our political opinions. ");
			System.out.println("Our families, schools, and identities shape our political opinions. ");
			System.out.println("Let’s put a candidate in the White House who understands us.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Universe.support += Universe.publicSmart*0.1;
		}
		else
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Most states are considered to be reliably Republican and Democratic, but your state is different. ");
			System.out.println("Public opinion in " + State + " is shaped by the people, not election patterns. ");
			System.out.println("Put a candidate in the white house who works for the people, with the people, ");
			System.out.println("with the consent of these people, and not Jake From State Farm.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Universe.support += Universe.publicSmart*0.1;
		}
		
		if (caucus == 1)
		{
			Universe.support+= 0.2*Universe.debateSkill;
			
			System.out.println("Since this is a caucus, you earned an extra "+ (0.2* Universe.debateSkill) + "% of support thanks to your debate skill, which rubbed off on the caucusers!");
			
		}
		
		while(actions>0 && Universe.support != 0) //System.out.println("");
		{
			System.out.println("Now what else would you like to do? You have " + actions + " actions left.");
			System.out.println("You have " + Universe.support + "% support, and " + Universe.funds + " total in funding.");
			System.out.println("Your options: ");
			System.out.println("1- Start a Rally, 2-Garner Media Support, 3 - Target a demographic");
			System.out.println("4- Attract a Super PAC/Interest Group, 5-Participate in a debate, 6- Sacrifice your integrity");
			System.out.println("7- Gain wealthy investors, 8- Push Polling (WARNING! POSSIBLY ILLEGAL!), 9-Register some new Voters!");
			int yotta = check.nextInt();
			
			switch (yotta)
			{
			case 1:
				System.out.println("The rally was successful! You earned 1% support.");
				Universe.support+= 1;
				Universe.funds-=1000000;
				break;
			case 2:
				System.out.println("The media is now your ally, earning you 5% more support. They might change their mind after the next primary, though.");
				Universe.support+= 5;
				if (Universe.status==4)
				{
					System.out.println("For being in a political dynasty, this is free!");
				}
				else
				{
				Universe.funds-=5000000;
				}
				break;
			case 3:
				if (kappa == 0)
				{
				System.out.println("You gained a lot of support, about 10%!");
				Universe.support+= 10;
				Universe.funds-=10000000;
				kappa++;
				}
				else
				{
				System.out.println("You gained a little support, about 3%.");
				Universe.support+= 3;
				Universe.funds-=10000000;
				}
				break;
			case 4:
				System.out.println("Looks like you've got $5 million more dollars in soft money "
						+ "\nfor \"party building activities\" now, but your popular support fell by 1%.");
				Universe.support-= 1;
				Universe.funds+=5000000;
				break;
			case 5:
				System.out.println("Debates! Debates! You're really earning support, now.");
				Universe.support+= 0.2 * Universe.debateSkill;
				Universe.funds-=2000000;
				break;
			case 6:
				System.out.println("You barked like a dog on live TV, fell down a stage, picked your boogers,"
						+ "\n and made jokes about the size of your... policies. The public is eating it up for some reason. "
						+ "\nYou earned 2% support, and it was free.");
				Universe.support+= 2;
				Universe.funds-=0;
				break;
			case 7:
				System.out.println("Wealthy investors use some shady loopholes that the McCain-Feingold Bill "
						+ "\nhighly disagrees with. At least you didn't get caught, but the public suspects..."
						+ "\nyou lost 5% support.");
				Universe.support-= 5;
				Universe.funds+=10000000;
				break;
			case 8:
				System.out.println("Push polling is actually legal, but has been restricted in New Hampshire. Fun.");
				if (State.equals("New Hampshire"))
				{
					Universe.support = 0;
					System.out.println("YOU CAN'T PUSH POLL IN THIS STATE!");
					System.out.println("You lost all credibility...");
					System.out.println("GAME OVER.");
					Universe.Done();
					return;
				}
				else
				{
					Universe.support+= 3;
					Universe.funds-=3000000;
				}
				break;
			case 9:
				System.out.println("Get out the vote and register voters! Seems your publicity concerts earned 2% support."
						+ "\nGood on ya!");
				Universe.support+= 2;
				Universe.funds-=3000000;
				break;
			default:
				System.out.println("Didn't choose something? Too bad. No support. Here's my individual 10 dollar contribution out of pity.");
				Universe.funds+=10;
				break;
			}
			
			
			if (Universe.funds<0 && crazy==0)
			{
				System.out.println("You went over budget.");
				System.out.println("Thankfully somebody bailed you out at the last minute. This only works once per primary.");
				System.out.println("You also lose 10% support. Try not to do it again.");
				Universe.support-=10;
				System.out.println("Next turn get help from a super PAC or an investor.");
				crazy++;
				Universe.funds =0;
			}
			else if (Universe.funds<0 && crazy==1)
			{
				System.out.println("You went over budget.");
				System.out.println("Nobody bailed you out...");
				System.out.println("GAME OVER.");
				Universe.Done();
				return;
			}
			
			if(Universe.support<0)
			{
				System.out.println("You are out of support.");
				System.out.println("If you want to run again some time, you have to drop out now.");
				System.out.println("GAME OVER");
				Universe.fixSupport();
				Universe.Done();
				return;
			}
			
			if(Universe.support >100)
			{
				Universe.support=100;
			}
			
			actions--;
		}
		
	}
	
	public void generalElect()
	{
		System.out.println("You have some more options to choose from to build support for your party.");
		Scanner check = new Scanner(System.in);
		
		System.out.println("Some hard money funds have been set aside for you to buy commercials. You can't spend this money on anything else.");
		System.out.println("You're now branching out to different forms of media.");
		System.out.println("Will you use primarily 1-TV ads, 2-Radio ads, 3-Internet ads, 4-print ads, 5-Phone banking, 6- Canvassing");
		int com = check.nextInt();
		
		switch (com)
		{
		case 1:
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Polticial efficacy: the measure of trust a society has in their civil service, "
					+ "\nand their belief that they have a say in it.");
			System.out.println("Let's promote political efficacy together.");
			System.out.println("Paid for by the friends of America.");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			Universe.support += 5;
			break;
		case 2: 
			System.out.println("~~~~~Do~~~Do~~~Do~~~~~~");
			System.out.println("Better vote me, for Democracy");
			System.out.println("You know you're stoked when your nation's not broke");
			System.out.println("Resolve the debt, yeah, because we're the best, man-");
			System.out.println("Votes for me keep our nation free!");
			System.out.println("~~~~~Do~~~Do~~~Do~~~~~~");
			Universe.support +=3;
			break;
		case 3:
			System.out.println("________________________________________ - X");
			System.out.println("|You won't BELIEVE this candidate's stances!|");
			System.out.println("|TOP TEN voter concerns! CLICK TO KNOW!     |");
			System.out.println("|WIN A FREE DEMOCRACY! CLICK NOW!           |");
			System.out.println("____________________________________________");
			Universe.support +=5;
			break;
		case 4:
			System.out.println("NEW YORK THYMES:");
			System.out.println("THIS NEW PRESIDENT HAS WHAT THIS COUNTRY NEEDS");
			System.out.println("Read more on page 3.");
			Universe.support+= 3;
			break;
		case 5:
			System.out.println("Your concerned voters are getting out the word over the phone in whatever way they can.");
			System.out.println("You know your phone calls are annoying... but it's working, so...");
			Universe.support+=5;
			break;
		case 6:
			System.out.println("Canvassing! People are going door to door handing out flyers.");
			System.out.println("Some of the evangelicals got in your way, but so far it's working.");
			Universe.support+=3;
			break;
		default:
			System.out.println("You couldn't decide on something so you divided your money thinly across all of them.");
			System.out.println("Turns out ads at 3 AM on fringe channels and pop-ups are not very desirable.");
			System.out.println("You actually lost 1% support due to poor management skills.");
			Universe.support-=1;
			break;
		}
		int ready =1;
		
		while(actions>0 && ready != 0) //System.out.println("");
		{
			System.out.println("Now what else would you like to do? You have as many actions left as you need.");
			System.out.println("You're on a " + actions + " action deadline just in case though. The election won't last forever.");
			System.out.println("Things are much more expensive now. Your funds are at " + Universe.funds + " dollars.");
			System.out.println("Your options: ");
			System.out.println("1- Start a Rally, 2-Garner Media Support, 3 - Target a demographic");
			System.out.println("4- Attract a Super PAC/Interest Group, 5-Participate in a debate, 6- Sacrifice your integrity");
			System.out.println("7- Gain wealthy investors, 8-Blatant Illegalities, 9-Register some new Voters!");
			int yotta = check.nextInt();
			
			switch (yotta)
			{
			case 1:
				System.out.println("The rally was successful! You earned 2% support.");
				Universe.support+= 2;
				Universe.funds-=1000000;
				break;
			case 2:
				System.out.println("The media is now your ally, earning you 10% more support.");
				Universe.support+= 10;
				if (Universe.status==4)
				{
					System.out.println("For being in a political dynasty, this is free!");
				}
				else
				{
				Universe.funds-=10000000;
				}
				break;
			case 3:
				if (kappa == 0)
				{
				System.out.println("You gained a lot of support, about 10%!");
				Universe.support+= 10;
				Universe.funds-=10000000;
				kappa++;
				}
				else
				{
				System.out.println("You gained a little support, about 3%.");
				Universe.support+= 3;
				Universe.funds-=10000000;
				}
				break;
			case 4:
				System.out.println("Looks like you've got $5 million more dollars in soft money for \"party building activities\" now, but your popular support fell by 2%.");
				Universe.support-= 2;
				Universe.funds+=5000000;
				break;
			case 5:
				System.out.println("Debates! Debates! You're really earning support, now.");
				Universe.support+= 0.2 * Universe.debateSkill;
				Universe.funds-=5000000;
				break;
			case 6:
				System.out.println("You barked like a dog on live TV, fell down a stage, picked your boogers, and made jokes about the size of your... policies. "
						+ "\n The public is eating it up for some reason. You earned 2% support, and it was free.");
				Universe.support+= 2;
				Universe.funds-=0;
				break;
			case 7:
				System.out.println("Wealthy investors use some shady loopholes that the McCain-Feingold Bill highly disagrees with. At least you didn't get caught, but the public suspects... you lost 5% support.");
				Universe.support-= 5;
				Universe.funds+=10000000;
				break;
			case 8:
				System.out.println("I wouldn't choose this option if I were you.");
				System.out.println("It costs 100 Million to rig the election.");
				System.out.println("You'll have no support, you will have a farce of a presidency, and then you could get caught and be shamed forever.");
				System.out.println("I'm telling you now, DON'T DO IT.");
				System.out.println("Press 1 if you must do this. Or press anything else if you're a good citizen. Please.");
				int noMan = check.nextInt();
				if ((noMan ==1 && Universe.funds>=100000000) && Universe.incumbent!=1)
				{
					Universe.funds=0;
					System.out.println("I can't believe you.");
					System.out.println("You totally got caught.");
					System.out.println("I mean, just... wow. You went through with it. Shame on you.");
					System.out.println("GAME OVER.");
					Universe.Done();
					return;
				}
				else if (Universe.incumbent ==1 && noMan ==1)
				{
					System.out.println("This is Illuminati mode. Props to you for making it this far at all.");
					System.out.println("However, your plan didn't work. Rigging the election is impossible, the illuminati have already done it.");
					System.out.println("As a penalty, you get no more actions. The general election moves on.");
					ready = 0;
				}
				else
				{
					System.out.println("Thank god, someone who listens to reason. Or maybe you were broke.");
					System.out.println("I'm not here to judge. Just go on ahead with your campaign.");
					System.out.println("Don't scare me like that again, OK?");
				}
				
				break;
			case 9:
				System.out.println("Get out the vote and register voters! Seems your publicity concerts earned 3% support. Good on ya!");
				Universe.support+= 2;
				Universe.funds-=5000000;
				break;
			default:
				System.out.println("Didn't choose something? Too bad. No support. Here's my individual 10 dollar contribution out of pity.");
				Universe.funds+=10;
				break;
			}
			
			if (Universe.funds<0)
			{
				System.out.println("You went over budget.");
				System.out.println("Thankfully somebody bailed you out at the last minute.");
				System.out.println("Next turn try getting help from a super PAC.");
				Universe.funds =0;
			}
			
			if(Universe.support<0)
			{
				System.out.println("You are out of support.");
				System.out.println("If you want to run again some time, you have to drop out now.");
				System.out.println("GAME OVER");
				Universe.Done();
				return;
			}
			
			if(Universe.support >100)
			{
				Universe.support=100;
			}
			
			actions--;
			System.out.println("Ready to get on with the general election? Type 0 for yes, any other number for no.");
			ready = check.nextInt();
		}
	}
	
}

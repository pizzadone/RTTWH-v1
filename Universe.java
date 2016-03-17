import java.util.Scanner;

public class Universe 
{
	public static double support = 0;
	public static double funds = 0;
	public static int publicSmart = 0;
	public static int debateSkill = 0;
	public static int candi =0;
	public static int incumbent = 0;
	public static int status=0;
	public static int difficulty =0;
	
	public double getFunds(){
		return Universe.funds;
	}
	
	public static void setFunds(double newVal)
	{
		Universe.funds = newVal;
	}
	
	public static void fixSupport() {
		Universe.support = 0;
	}
	
	public static void Done()
	{
		return;
	}

	
	public static void main (String[] args)
	{
		//there's a lot of variables here
		
		int abortion =0;
		int marriage =0;
		int congress =0;
		int healthcare =0;
		int legalize =0;
		
		int economics =0;
		int environment =0;
		int college =0;
		int socSec =0;
		int minWage =0;
		
		int military =0;
		int immigrate =0;
		int privacy =0;
		int guns =0;
		int space =0;
		
		System.out.println("Welcome to ROAD TO THE WHITE HOUSE! I'm your campaign manager, Captain America.");
		System.out.println("I'm so good a candidate I get hundreds of votes even when I don't run.");
		System.out.println("Let's bring some of that success to your campaign!");
		System.out.println("");
		System.out.println("To play, you will be asked some questions about your political stances.");
		System.out.println("You will then be given a party and a starting amount of popular support based on some superficial aspects.");
		System.out.println("Sorry, it's just politics. People aren't as likely to listen to a fringe candidate.");
		System.out.println("Spend your funds wisely in 7 swing state primaries to earn a majority for the nomination.");
		System.out.println("This game assumes you have the necessary signatures to get on the ballot and are active in one of the two major parties.");
		System.out.println("To start, choose a difficulty. Make your selection and hit enter. Use numbers only or the game will crash!");
		System.out.println("Type 1 for easy, 2 for medium, 3 for challenging. Of course, you could choose a different number...");
		Scanner diff = new Scanner(System.in);
		Universe.difficulty = diff.nextInt();
		
		switch (difficulty)
		{
		case 1: System.out.println("Easy peasy! You start with 30 Million in soft money funds, the public is not well informed, "
				+ "\nyou are great at debates and few other candidates are running.");
		Universe.funds = 30000000;
		Universe.publicSmart = 10;
		Universe.debateSkill = 30;
		Universe.candi = 2;
		
		break;
		case 2: System.out.println("Medium difficulty. You have 15 million in soft money funds from contributors, "
				+ "\nthe public is of average intelligence, you are OK at debates and some other candidates are running.");
		Universe.funds = 15000000;
		Universe.publicSmart = 20;
		Universe.debateSkill = 20;
		Universe.candi = 3;
		
		break;
		case 3: System.out.println("This game will be very difficult. You have 5 million in soft money funds, the public is well informed,"
				+ "\nyou are not good at debating and plenty of other candidates are running.");
		Universe.funds = 5000000;
		Universe.publicSmart = 30;
		Universe.debateSkill = 10;
		Universe.candi = 5;
		
		break;
		default: System.out.println("Welcome to Illuminati mode.");
		System.out.println("I hope you're prepared to get what you asked for.");
		System.out.println("This mode is just for fun, and is not realistic at all.");
		System.out.println("Your goal is to get elected to take down the Illuminati, who have a nefarious master plan.");
		System.out.println("You are dirt broke, the public is well informed, you are good at debates, at least, "
				+ "\nand your challenger is incumbent.");
		System.out.println("Good luck, you will definitely need it.");
		Universe.funds = 0;
		Universe.publicSmart = 30;
		Universe.debateSkill = 30;
		Universe.candi = 5;
		Universe.incumbent = 1;
		break;
		}
		
		System.out.println("Now it's time to choose your stance on the issues that matter most.");
		
		if(difficulty == 1)
		{
			System.out.println("These issues are controversial, but your party isn't very interested in moderate candidates.");
			System.out.println("Choose wisely.");
		}
		
		System.out.println("");
		System.out.println("Type 1 for the left-most option listed, 3 for the right-most, or 2 for a moderate stance.");
		System.out.println("It's both listed on the left or right, AND most suited to that side of the political spectrum.");
		
		System.out.println("Let's begin with social concerns:");
		
		System.out.println("Pro-choice or pro-life?");
		abortion = diff.nextInt();
		
		System.out.println("Gay marriage is OK, or traditional marriage only?");
		marriage = diff.nextInt();
		
		System.out.println("Add congressional term limits, or keep the current system?");
		congress = diff.nextInt();
		
		System.out.println("Healthcare: government assistance is needed, or private sector approach only?");
		healthcare = diff.nextInt();
		
		System.out.println("Legalization: Let's decriminalize, or do we combat drug users?");
		legalize = diff.nextInt();
		
		System.out.println("Now, what about economics?");
		
		System.out.println("Generally do you want more social programs, or would you cut back regulations to fix the debt/economy?");
		economics = diff.nextInt();
		
		System.out.println("Should we pursure greater renewable energy, or relax regulations?");
		environment = diff.nextInt();
		
		System.out.println("Should college students get free tuition, or do we need a non-federal approach?");
		college = diff.nextInt();
		
		System.out.println("Social Security: More benefits for seniors, or raise retirement age to save money?");
		socSec = diff.nextInt();
		
		System.out.println("Raise minimum wage to $15, or keep it constant to protect employers?");
		minWage = diff.nextInt();
		
		System.out.println("Alright. Here's a few other concerns your constituents want to know about.");
		
		System.out.println("Adequate military, or large military?");
		military = diff.nextInt();
		
		System.out.println("Forgive illegal immigrants or enforce border control?");
		immigrate = diff.nextInt();
		
		System.out.println("Digital privacy: Protect encryption, or focus on safety where it doesn't conflict with the Bill of Rights?");
		privacy = diff.nextInt();
		
		System.out.println("Restrictions on guns, or keep/rollback current legislation?");
		guns = diff.nextInt();
		
		System.out.println("Space travel: Focus on Earth, or look ahead for solutions?");
		space = diff.nextInt();
		
		System.out.println("You're done! Just a little more on your background as a candidate and you're set.");
		int stanceS = abortion + marriage + legalize +congress + healthcare;
		int stanceE = economics+ environment + college+ socSec + minWage;
		int stanceO = military + immigrate + privacy + guns + space;
		
		int rank = stanceS + stanceE + stanceO;
		int party = 0;
		//dem 1, rep 2
		
		if(rank<25)
		{
			party = 1;
			Universe.support += 10.0;
		}
		else if(rank<30)
		{
			party = 1;
			Universe.support += 5.0;
		}
		else if(rank==30)
		{
			party = 3;
		}
		else if(rank<34)
		{
			party =2;
			Universe.support +=5.0;
		}
		else
		{
			party = 2;
			Universe.support +=10;
		}
		
		String partyS = "";
		if (party == 1)
		{
			partyS = "Democrat";
		}
		else if(party ==2)
		{
			partyS = "Republican";
		}
		else
		{
			partyS = "Independent";
		}
		
		System.out.println("You are a " + partyS + " with " + Universe.support + "% support in the polls.");
		if (partyS.equals("Independent"))
		{
			System.out.println("You lost; nobody wants to elect a third party/independent candidate.");
			System.out.println("GAME OVER.");
			Universe.Done();
		}
		
		int race = 0;
		int gender = 0;
		int locale = 0;
		System.out.println("What is your race/ethnicity? 1- White, 2- Hispanic, 3- Black, 4- Mixed, "
				+ "\n5- Arabic, 6- Asian, 7-Other. ");
		race = diff.nextInt();
		
		switch (race)
		{
		case 1:
			if(party == 2)
			{
				Universe.support+=3;
			}
			break;
		case 2:
			if(party == 1)
			{
				Universe.support+=3;
			}
			break;
		case 3:
			if(party == 1)
			{
				Universe.support+=3;
			}
			break;
		case 4:
			if(party == 1)
			{
				Universe.support+=3;
			}
			break;
		case 5:
			if(party == 2)
			{
				Universe.support-=3;
			}
			break;
		case 6:
			if(party == 1)
			{
				Universe.support+=3;
			}
			break;
		default:
			if(party == 2)
			{
				Universe.support-=3;
			}
			break;
		}
	
		System.out.println("And your gender? 1- Female, 2-Male, 3- Other");
		gender = diff.nextInt();
		
		switch (gender)
		{
		case 1:
			Universe.support +=3;
			break;
		case 2:
			Universe.support-=5;
			break;
		default:
			Universe.support -=15;
			break;
		}
		
		System.out.println("What economic class are you in? 1- Poverty, 2-Middle class, 3- Upper middle class, "
				+ "\n4- Political dynasty, 5- Old Money, 6- New Money");
		Universe.status = diff.nextInt();
		
		switch (Universe.status)
		{
		case 1:
			if(party == 1)
			{
				Universe.support+=5;
			}
			if(party == 2)
			{
				Universe.support-=3;
			}
			break;
		case 2:
			Universe.support+=5;
			break;
		case 3:
			if(party == 1)
			{
				Universe.support-=3;
			}
			if(party == 2)
			{
				Universe.support+=3;
			}
			break;
		case 4:
			if(party == 1)
			{
				Universe.support+=5;
			}
			if(party == 2)
			{
				Universe.support+=5;
			}
			break;
		case 5:
			if(party == 1)
			{
				Universe.support-=5;
			}
			if(party == 2)
			{
				Universe.support+=5;
			}
			break;
		case 6:
			if(party == 1)
			{
				Universe.support+=2;
			}
			if(party == 2)
			{
				Universe.support+=5;
			}
			break;
		default:
			Universe.support-=3;
			break;
		}
		
		System.out.println("Finally, what geographic location are you from in America? 1-East Coast, 2-West Coast, 3-The South, 4-Midwest");
		locale = diff.nextInt();
		
		switch (locale)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			Universe.support=0;
			break;
		}
		
		
		if(Universe.support<=0)
		{
			Universe.fixSupport();
			System.out.println("Seems you have no support. Your exploratory committee says you should run some other time.");
			System.out.println("GAME OVER.");
			return;
		}
		else if(Universe.support>100)
		{
			Universe.support=100;
		}
		else
		{
			
		}
		
		System.out.println("Ok, you're at " + Universe.support + "% support. Lots of people don't know about you yet.");
		
		System.out.println("There are " + Universe.candi + " other candidates running. Better go to the primaries!");
		System.out.println("You need to keep a majority of " + 51 + "% support by the end of the primaries to get the nomination.");
		System.out.println("Your first stop is Iowa.");
		System.out.println("I reccommend you spend 10 million per primary.");

		
		//IOWA
		
		Primary Iowa = new Primary(1, Universe.support, 3, 1, Universe.debateSkill, Universe.funds);
		Iowa.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally Iowa1 = new tally(Universe.support, "Iowa", Universe.funds, Universe.candi, party, 30, 44, 8, Universe.incumbent, Universe.difficulty);
		Iowa1.doThis();
		Iowa1.nerf(Universe.difficulty);
		
		//NEXT! NH
		
		System.out.println("New Hampshire is next!");
		
		Primary NH = new Primary(2, Universe.support, 3, 0, Universe.debateSkill, Universe.funds);
		NH.gatherSupport();
		
		if(Universe.support<=0)
		{
			Universe.fixSupport();
			return;
		}
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally nh1 = new tally(Universe.support, "New Hampshire", Universe.funds, Universe.candi, party, 23, 24, 8, Universe.incumbent, Universe.difficulty);
		nh1.doThis();
		nh1.nerf(Universe.difficulty);
		
		//Next! NEVADA
		
		System.out.println("Now you're going to Nevada!");
		
		Primary NV = new Primary(3, Universe.support, 3, 1, Universe.debateSkill, Universe.funds);
		NV.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally nv1 = new tally(Universe.support, "Nevada", Universe.funds, Universe.candi, party, 30, 35, 8, Universe.incumbent, Universe.difficulty);
		nv1.doThis();
		nv1.nerf(Universe.difficulty);
		
		//Colorado!
		
		System.out.println("It's Colorado time!");
		
		System.out.println("Guess what? Now it's Super Tuesday! You have only so much time to split up; you only get 2 actions this time.");
		
		Primary color = new Primary(4, Universe.support, 2, 1, Universe.debateSkill, Universe.funds);
		color.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally colo = new tally(Universe.support, "Colorado", Universe.funds, Universe.candi, party, 37, 66, 13, Universe.incumbent, Universe.difficulty);
		colo.doThis();
		colo.nerf(Universe.difficulty);
		
		//Virginia!
		
		System.out.println("WELCOME TO SUNNY VIRGINIA! Let's do some electioneering!");
		
		Primary VA = new Primary(5, Universe.support, 2, 0, Universe.debateSkill, Universe.funds);
		VA.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally va1 = new tally(Universe.support, "Virginia", Universe.funds, Universe.candi, party, 49, 95, 14, Universe.incumbent, Universe.difficulty);
		va1.doThis();
		va1.nerf(Universe.difficulty);
		
		//Florida!
		
		System.out.println("Florida... Florida... vote for me~");
		
		Primary FL = new Primary(6, Universe.support, 3, 0, Universe.debateSkill, Universe.funds);
		FL.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally fl1 = new tally(Universe.support, "Florida", Universe.funds, Universe.candi, party, 99, 214, 32, Universe.incumbent, Universe.difficulty);
		fl1.doThis();
		fl1.nerf(Universe.difficulty);
		
		//LAST ONE! Ohio
		
		System.out.println("It's the last important primary. Make it count here in Ohio!");
		
		Primary Ohio = new Primary(7, Universe.support, 3, 0, Universe.debateSkill, Universe.funds);
		Ohio.gatherSupport();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's tally the delegates.");
		
		tally OH = new tally(Universe.support, "Ohio", Universe.funds, Universe.candi, party, 66, 143, 16, Universe.incumbent, Universe.difficulty);
		OH.doThis();
		OH.nerf(Universe.difficulty);
		
		//System.out.println("");
		
		System.out.println("Looks like you have finished the primaries. Fun, right? So, onto the nomination convention!");
		
		NomConvention gather = new NomConvention(Universe.support, party);
		gather.nomminee();
		
		if (Universe.support ==0)
		{
			return;
		}
		
		System.out.println("Remember, type 1 for the left-most option listed, 3 for the right-most, or 2 for a moderate stance.");
		System.out.println("Let's begin with social concerns:");
		
		System.out.println("Pro-choice or pro-life?");
		abortion = diff.nextInt();
		
		System.out.println("Gay marriage is OK, or traditional marriage only?");
		marriage = diff.nextInt();
		
		System.out.println("Add congressional term limits, or keep the current system?");
		congress = diff.nextInt();
		
		System.out.println("Healthcare: government assistance is needed, or private sector approach only?");
		healthcare = diff.nextInt();
		
		System.out.println("Legalization: Let's decriminalize, or do we combat drug users?");
		legalize = diff.nextInt();
		
		System.out.println("Now, what about economics?");
		
		System.out.println("Generally do you want more social programs, or would you cut back regulations?");
		economics = diff.nextInt();
		
		System.out.println("Should we pursure greater renewable energy, or relax regulations?");
		environment = diff.nextInt();
		
		System.out.println("Should college students get free tuition, or do we need a private sector approach?");
		college = diff.nextInt();
		
		System.out.println("Social Security: More benefits for seniors, or raise retirement age to save money?");
		socSec = diff.nextInt();
		
		System.out.println("Raise minimum wage to $15, or keep it constant to protect employers?");
		minWage = diff.nextInt();
		
		System.out.println("Alright. Here's a few other concerns your constituents want to know about.");
		
		System.out.println("Adequate military, or large military?");
		military = diff.nextInt();
		
		System.out.println("Forgive illegal immigrants or enforce border control?");
		immigrate = diff.nextInt();
		
		System.out.println("Digital privacy: Protect encryption, or focus on safety where it doesn't conflict with the Bill of Rights?");
		privacy = diff.nextInt();
		
		System.out.println("Restrictions on guns, or keep/ rollback current legislation?");
		guns = diff.nextInt();
		
		System.out.println("Space travel: Look ahead for solutions, or focus on Earth?");
		space = diff.nextInt();
		
		System.out.println("You're done! Let's see how your constituents are feeling.");
		stanceS = abortion + marriage + legalize +congress + healthcare;
		stanceE = economics+ environment + college+ socSec + minWage;
		stanceO = military + immigrate + privacy + guns + space;
		
		rank = stanceS + stanceE + stanceO;
		
		if(rank<20)
		{
			Universe.support =0;
			System.out.println("You're way too partisan.");
			System.out.println("GAME OVER.");
			return;
		}
		else if(rank<29 && party == 1)
		{
			Universe.support += 5.0;
			System.out.println("Your liberal stances are going over well!");
		}
		else if(rank==30)
		{
			Universe.support-=15;
			System.out.println("You're not partisan enough. You lost 15% support.");
			System.out.println("Maybe you can still win this, though.");
		}
		else if(rank<39 && party ==2)
		{
			Universe.support +=5.0;
			System.out.println("Your firm but not outrageous conservatism has bolstered support!");
		}
		else
		{
			Universe.support =0;
			System.out.println("You're way too partisan.");
			System.out.println("GAME OVER.");
			return;
		}
		
		if(Universe.support<0)
		{
			Universe.fixSupport();
		}
		
		System.out.println("Now there's one last battle to determine who President is.");
		System.out.println("You're running against an almost unstoppable candidate...");
		if (party==1)
		{
		System.out.println("Donald Trump.");
		System.out.println("They say you can't stump him.");
		}
		else
		{
			System.out.println("Bernie Sanders.");
			System.out.println("You're starting to feel the bern.");
		}
		System.out.println("You've got to prove all the naysayers wrong.");
		System.out.println("Thankfully, there has been an influx of funding due to your successes before.");
		System.out.println("Let's do this. 30 million dollars. Do, or do not, there is no try.");
		Universe.funds += 30000000;
		
		Primary general = new Primary(8, Universe.support, 99, 0, Universe.debateSkill, Universe.funds);
		general.generalElect();
		
		System.out.println("Ok! Your support according to the polls is at " + Universe.support + ", and your funds are at $" + Universe.funds + ".");
		System.out.println("With those numbers, let's head into the general election.");
		
		gather.theVictor();
		
		

	}

}

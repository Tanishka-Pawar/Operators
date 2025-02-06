/* Stone-Paper-Scissor game between bot and user
	1-->stone
	2-->paper
	3-->scissor */


import java.util.Scanner;

class Game
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int rNum = 0;
		//Generrating random numbers
		for( ; ;)
		{
			int num = (int)(Math.random()*10);
			if(num>=1 && num<=3)
			{
				rNum = num;
				break;
			}
		}

		//Bot option

		String botOpt = null;
		if(rNum == 1)
		{
			botOpt = "Stone";
		}
		else if(rNum == 2)
		{
			botOpt = "Paper";
		}
		else if(rNum == 3)
		{
			botOpt = "Scissor";
		}
		
		
		//Game Begining...
		System.out.println("\n\t------------------------------------------");
		System.out.println("\n\t        STONE-PAPER-SCISSOR GAME          ");
		System.out.println("\n\t------------------------------------------");
		System.out.println("\n\n\t\t****** OPTIONS ******");
		System.out.println("\t\t\t1. STONE");
		System.out.println("\t\t\t2. PAPER");
		System.out.println("\t\t\t3. SCISSOR");
		System.out.println("\n\t\t**********************");
		System.out.println("\n\t------------------------------------------");
		
		//User option
		System.out.print("\n\t\tEnter your option = ");
		int opt = sc.nextInt();
		System.out.println("\n\t------------------------------------------");

		String userOpt = null;
		if(opt == 1)
		{
			userOpt = "Stone";
		}
		else if(opt == 2)
		{
			userOpt = "Paper";
		}
		else if(opt == 3)
		{
			userOpt = "Scissor";
		}
		else
		{
			System.out.println("INVALID OPTION...");
			return;
		}

		//conditions
		System.out.println("\n\t\tUSER : "+userOpt+"   BOT : "+botOpt);
		if((opt==1 && rNum==3)||(opt==2 && rNum==1)||(opt==3 && rNum==2))
		{
			System.out.println("\n\t\t......USER WINS......");
		}
		else if((opt==1 && rNum==2)||(opt==2 && rNum==3)||(opt==3 && rNum==1))
		{
			System.out.println("\n\t\t......BOT WINS......");
		}
		else
		{
			System.out.println("\n\t\t......GAME  IS DRAW......");
		}
		
		System.out.println("\n\t------------------------------------------");

		
	}
}
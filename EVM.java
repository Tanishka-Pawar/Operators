/*EVM using If statement*/

import java.util.Scanner;

class EVM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;

		System.out.println("\n            WELCOME          \n");

		System.out.print("Enter the population = ");
		int population = sc.nextInt();

		for(int i=1; i<=population; i++)
		{
			System.out.println("\n\t***************List of Parties *************");
			System.out.println("\t\t\t 1. BJP");
			System.out.println("\t\t\t 2. CONGRESS");
			System.out.println("\t\t\t 3. SHIV SENA");
			System.out.println("\t\t\t 4. AAP");
			System.out.println("\t\t\t 5. MNS");
			System.out.println("\t\t\t 6. NOTA");
			System.out.println("\t***********************************************");
	
			System.out.print("Enter the option = ");
			int option = sc.nextInt();

			//Valid option
			if(option >= 1 && option <= 6)
			{
				if(option == 1)
				{
					bjp++;
					System.out.println("Acche Din Aayenge.......");
				}

				if(option == 2)
				{
					cng++;
					System.out.println("Bharat Jodo.......");
				}
				
				if(option == 3)
				{
					ss++;
					System.out.println("Hum hai asli sena.......");
				}
	
				if(option == 4)
				{
					aap++;
					System.out.println("Mujhe Azad Karo.......");
				}

				if(option == 5)
				{
					mns++;
					System.out.println("Jai Maharashtra.......");
				}
		
				if(option == 6)
				{
					nota++;
					System.out.println("You are an educated person.......");
				}

			}
			//Invalid option
			if(!(option >= 1 && option <= 6))
				{	
					i--;
					System.out.println("***** Invalid Option *****");
				}


			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("Bjp has won the Election by "+bjp+" votes");
			}
			
			if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("Congress has won the Election by "+cng+" votes");
			}

			if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("Shiv Sena has won the Election by "+ss+" votes");
			}
			
			if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
			{
				System.out.println("AAP has won the Election by "+aap+" votes");
			}

			if(mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota)
			{
				System.out.println("MNS has won the Election by "+mns+" votes");
			}
			if(nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=mns)
			{
				System.out.println("None of the Above.....");
			}	

			
		}
	}
}
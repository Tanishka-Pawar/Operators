import java.util.Scanner;

class CurrencyConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n          CURRENCY CONVERTER          \n");
		System.out.print("Enter the amount (INR) = ");
		float inr = sc.nextFloat();

		System.out.println("*******List of Currency*******");
		System.out.println("1. USD");
		System.out.println("2. EURO");
		System.out.println("3. POUNDS");
		System.out.println("4. PKR");//pakistani rupees
		System.out.println("5. YEN");
		System.out.println("6. WON");
		System.out.println("******************************");

		System.out.print("\nEnter the Currency = ");
		String Curr = sc.next().toUpperCase();
		
		float CurrCon = 0;

		if(Curr.equals("USD"))
		{
			CurrCon = inr /86.56f;
			System.out.println(inr+" INR = "+CurrCon+" USD");
		}
		else if(Curr.equals("EURO"))
		{
			CurrCon = inr /90.37f;
			System.out.println(inr+" INR = "+CurrCon+" EURO");
		}
		else if(Curr.equals("POUNDS"))
		{
			CurrCon = inr /107.80f;
			System.out.println(inr+" INR = "+CurrCon+" POUNDS");
		}
		else if(Curr.equals("PKR"))
		{
			CurrCon = inr /0.31f;
			System.out.println(inr+" INR = "+CurrCon+" PKR");
		}
		else if(Curr.equals("YEN"))
		{
			CurrCon = inr /0.55f;
			System.out.println(inr+" INR = "+CurrCon+" YEN");
		}
		else if(Curr.equals("WON"))
		{
			CurrCon = inr /0.05f;
			System.out.println(inr+" INR = "+CurrCon+" WON");
		}
		else
		{
			System.out.println("Invalid Currency");
		}




	}
		
}
import java.util.Scanner;

class LoanCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n          LOAN CALCULATOR          ");
		System.out.print("Enter loan amount = ");
		float amt = sc.nextFloat();

		System.out.print("Enter Rate of interest = ");
		float roi = sc.nextFloat();

		System.out.print("Enter the tenure(months) = ");
		float month = sc.nextFloat();

		//Conversion from months to year
		float con = month/12.0f;

		System.out.println("\n------------------------------------------------------");
		System.out.println("\n\t          LOAN CALCULATION          ");
		System.out.println("\n------------------------------------------------------");
		System.out.println("\n\t Principal amount = \t"+amt);
		System.out.println("\n\t Rate of Interest = \t"+roi);
		System.out.println("\n\t Tenure(month) = \t"+month+" months");

		//interest of year
		float intyear = amt*roi/100;
		float TotalInt = intyear*con;
		System.out.println("\n\t Total Interest = \t"+TotalInt);
		float outstanding = amt+TotalInt;
		System.out.println("\n\t total Outstanding amount = \t"+(outstanding));
		System.out.println("\n\t Principal amount = \t"+amt);
		System.out.println("\n\t EMI = \t"+(outstanding/month)+" rs");
		System.out.println("\n---------------------------------------------------");
	}
}
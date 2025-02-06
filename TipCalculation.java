/*if user enter 10 for subtotal and 15 for gratuity rate the total is 11.5 and rate is 1.5*/
import java.util.Scanner;

class TipCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the subtotal = ");
		float subt = sc.nextFloat();

		System.out.print("Enter the Gratuity/tip rate = ");
		float G_rate = sc.nextFloat();

		float G_amt = (subt*G_rate)/100;
		float TotalBill = subt+G_amt;
		
		
		System.out.println("The Gratuity/tip added is = "+G_rate);
		System.out.println("The Total is = "+TotalBill);

	}
}
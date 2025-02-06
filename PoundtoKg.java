import java.util.Scanner;

class PoundtoKg
{
	public static void main(String[] args)
	{	
		System.out.println("Enter a number in pounds = ");
		double pounds = new Scanner(System.in).nextDouble();
		
		double kg = pounds*0.454;
		
		System.out.println("Conversion of "+pounds+" pounds into Kilograms = "+kg);
	}
}
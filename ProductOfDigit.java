import java.util.Scanner;

class ProductOfDigit
{
	public static void main(String[] args)
	{
		int rem, product=1;
		
		System.out.print("Enter a 4 digit number = ");
		int num = new Scanner(System.in).nextInt();
	
		rem = num%10;
		product = product*rem;
		num = num/10;

		rem = num%10;
		product = product*rem;
		num = num/10;

		rem = num%10;
		product = product*rem;
		num = num/10;

		rem = num%10;
		product = product*rem;
		num = num/10;

		System.out.println("Product of the digits of the number is = "+product);

	}
}
import java.util.Scanner;

class Reverse
{
	public static void main(String[] args)
	{
		int rem, rev=0;
		System.out.print("Enter a 3 digit number = ");
		int num = new Scanner(System.in).nextInt();
		
		rem = num%10;
		rev = rev*10+rem;
		num = num/10;

		rem = num%10;
		rev = rev*10+rem;
		num = num/10;

		rem = num%10;
		rev = rev*10+rem;
		num = num/10;
	
		System.out.println("Reverse of a number is = "+rev);

		
	}
}
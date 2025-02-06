import java.util.Scanner;

class SumofDigit1
{
	public static void main(String[] args)
	{
		int rem;
		int Esum=0;
		int Osum=0;
		int temp;
		System.out.print("Enter a four digit number = ");
		int num = new Scanner(System.in).nextInt();

		rem = num%10;
		temp = (rem%2==0)?(Esum=Esum+rem):(Osum=Osum+rem);
		num = num/10;

		rem = num%10;
		temp = (rem%2==0)?(Esum=Esum+rem):(Osum=Osum+rem);
		num = num/10;

		rem = num%10;
		temp = (rem%2==0)?(Esum=Esum+rem):(Osum=Osum+rem);
		num = num/10;

		rem = num%10;
		temp = (rem%2==0)?(Esum=Esum+rem):(Osum=Osum+rem);
		num = num/10;

		System.out.println("Sum of Even Digits in a given number = "+Esum);
		System.out.println("Sum of Odd Digits in a given number = "+Osum);

		
	}
}
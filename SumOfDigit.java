import java.util.Scanner;

class SumOfDigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter a four digit number = ");//1234
		int num = new Scanner(System.in).nextInt();
		int sum = 0;

		int rem = num%10;
		sum = sum+rem;
		num = num/10;

		rem = num%10;
		sum = sum+rem;
		num = num/10;

		rem = num%10;
		sum = sum+rem;
		num = num/10;
	
		rem = num%10;
		sum = sum+rem;
		num = num/10;

		System.out.println("Sum of 4 digit is = "+sum);//10
	}
}
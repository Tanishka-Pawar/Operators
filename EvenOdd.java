/*Even odd number without modulus % operator*/

import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number = ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(n%2 == 0);
		System.out.println((n/2) == (n/2.0));	
		System.out.println((n/2)*2 == n);
	}
}
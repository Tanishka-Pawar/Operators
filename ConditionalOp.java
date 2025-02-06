/* Enter no is divisible by 2 or 5 and both
num%2==0 --->HiTwo
num%5==0 --->HiFive
and both --->HiTwoHiFive
not both --->Blank
*/

import java.util.Scanner;

class ConditionalOp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();

		String ans = ((num%2==0)&&(num%5==0))?("HiTwoHiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):("Blank")));
		System.out.println(ans);
	}
}
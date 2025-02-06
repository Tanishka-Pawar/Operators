/*Enter character is digit or not*/

import java.util.Scanner;

class DigitChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		char num = sc.next().charAt(0);

		String ans = (num>='0' && num<='9')?(num+" is a digit character"):(num+" is a not digit character");
		System.out.println(ans);
	}
}
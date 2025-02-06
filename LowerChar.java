/*Enter character is lowercase or not*/

import java.util.Scanner;

class LowerChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character = ");
		char ch = sc.next().charAt(0);

		String ans = (ch>='a' && ch<='z')?(ch+" is lower case alphabet"):(ch+" is not lower case alphabet");
		System.out.println(ans);
	}
}
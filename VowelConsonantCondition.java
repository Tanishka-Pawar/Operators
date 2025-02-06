/* Enter character is vowel or consonant using Conditional Operator */

import java.util.Scanner;

class VowelConsonantCondition
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character = ");
		char ch = sc.next().charAt(0);

		String ans = ((ch=='a'|| ch=='A')||(ch=='e' || ch=='E')||(ch=='i' || ch=='I')||(ch=='o' || ch=='O')||(ch=='u' || ch=='U'))
				?(ch+" is a Vowel"):(ch+" is a Consonant");
		System.out.println(ans);
	}
}
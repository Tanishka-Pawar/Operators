/* Enter character is Lower/ upper case alphabet or digit or special character*/

import java.util.Scanner;

class AsciiConditional
{
	public static void main(String[] args)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character = ");
		char ch = sc.next().charAt(0);

		String ans = ((ch>= 'A' && ch<= 'Z')||(ch>= 'a' && ch<= 'z'))?
				((ch>= 'a' && ch<= 'z')?(ch+" is a LowerCase alphabet"):(ch+" is a UpperCase alphabet")):
				((ch>= '0' && ch<= '9')?(ch+" is a Digit"):(ch+" is a special character"));

		System.out.println(ans);

	}
}
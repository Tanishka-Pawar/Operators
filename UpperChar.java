/* Enter character is upper case or not*/
import java.util.Scanner;

class UpperChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character = ");
		char ch = sc.next().charAt(0);

		String ans = (ch>='A' && ch<= 'Z')?(ch+" is a upper case alphabet"):(ch+" is not a upper case alphabet");
		System.out.println(ans);
	}
}
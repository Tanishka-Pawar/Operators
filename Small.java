import java.util.Scanner;

class Small
{
	public static void main(String[] args)
	{
		System.out.println("Enter any 3 numbers = ");
		int n1 = new Scanner(System.in).nextInt();//23
		int n2 = new Scanner(System.in).nextInt();//25
		int n3 = new Scanner(System.in).nextInt();//22
	
		int small = (n1<n2)?((n1<n3)?(n1):(n3)):((n2<n3)?(n2):(n3));
		System.out.println("Smallest number among "+n1+" "+n2+" "+n3+" is = "+small);
	}
}
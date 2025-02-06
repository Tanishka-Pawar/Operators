/*
Celsius to fahrenheit conversion
Note :- In java 9/5 is 1 and 9.0/5 is 1.8
*/

import java.util.Scanner;

class  Celsius
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter celsius degree  = ");
		double c = sc.nextDouble();
	
		double f = (9.0/5)*c+32;
		System.out.println(c+" degree is "+f+" fahrenheit");
	}
}
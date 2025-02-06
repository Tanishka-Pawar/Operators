/* oct/nov/dec/jan --->winter
feb/mar/apr/may --->summer
jun/jul/aug/sep --->monsoon */

import java.util.Scanner;

class Season
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month = ");
		String str = sc.next().toUpperCase();

		String ans = ((str.equals("OCT"))||(str.equals("NOV"))||(str.equals("DEC"))||(str.equals("JAN")))?(str+ " has Winter Season."):
		(((str.equals("FEB"))||(str.equals("MAR"))||(str.equals("APR"))||(str.equals("MAY")))?(str+" has Summer Season."):
		(((str.equals("JUN"))||(str.equals("JUL"))||(str.equals("AUG"))||(str.equals("SEP")))?(str+ " has Monsoon Season."):
		("Invalid Month")));

		System.out.println(ans);
	}
}
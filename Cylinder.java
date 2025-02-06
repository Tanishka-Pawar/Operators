/* area and volume of Cylinder*/

import java.util.Scanner;

class Cylinder
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14;

		System.out.print("Enter the radius of cylinder = ");
		double r = sc.nextDouble();

		System.out.print("Enter the height of cylinder = ");
		Double h = sc.nextDouble();

		double area = pi*r*r;
		double vol = area*h;

		System.out.println("Area of Cylinder of radius "+r+" is = "+area);
		System.out.println("Volume of Cylinder of radius "+r+" and height "+h+" is = "+vol);
		
	}
}
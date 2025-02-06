import java.util.Scanner;

class CircleArea
{ 
	public static void main(String[] args)
	{
		float r, area;
		final float pi = 22/7;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius(cm) = ");
		r = sc.nextFloat();
		area = pi*r*r;
		System.out.println("Area of circle having radius "+r+" is = "+area+" cm^2");
	}
	
}
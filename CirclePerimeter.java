import java.util.Scanner;

class CirclePerimeter
{
	public static void main(String[] args)
	{
		final float pi = 3.14f;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius ="); 
		float r = sc.nextFloat();

		float perimeter = 2*pi*r;
		System.out.println("Perimeter of circle of radius "+r+" is = "+perimeter+" cm.");
		
	}
}
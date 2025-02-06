import java.util.Scanner;

class RectArea
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the height of rectangle = ");
		float h = sc.nextFloat();

		System.out.print("Enter the width of rectangle = ");
		float w = sc.nextFloat();

		float area = h*w;
		System.out.println("Area of Rectangle of height "+h+" and width "+w+" is = "+area+" cm^2");
	}
}
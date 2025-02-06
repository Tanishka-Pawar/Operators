import java.util.Scanner;

class RectPerimeter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter height of rectangle = ");
		float h = sc.nextFloat();

		System.out.print("Enter width of rectangle = ");
		float w = sc.nextFloat();
		
		float perim = 2*(h+w);
		System.out.println("Perimeter of recatngle of width "+w+" and height "+h+" is = "+perim+" cm");
	}
}
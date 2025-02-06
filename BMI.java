import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds = ");
		float w = sc.nextFloat();
	
		System.out.print("Enter height in inches = ");
		float h = sc.nextFloat();

		float weight = w*0.45359237f;//(kg)
		float height = h* 0.0254f;//(m)

		float BMI = weight /(height*height);

		System.out.println("BMI of body  is = "+BMI);
		
		
		
	}
}
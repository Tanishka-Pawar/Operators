import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("------------------------ Arithmetic Calculator ----------------------");
		System.out.print("\n\tEnter number1 = ");
		float num1 = sc.nextFloat();

		System.out.print("\n\tEnter number2 = ");
		float num2 = sc.nextFloat();

		System.out.print("\n\tEnter Operator = ");
		char ope = sc.next().charAt(0);

		float ans = 0;
		ans = (ope == '+')?(num1 + num2):
		((ope == '-')?(num1 - num2):
		((ope == '*')?(num1 * num2):
		((ope == '/')?(num1 / num2):
		((ope == '%')?(num1 % num2):(0.000001f)))));

		//System.out.println("\n\tTotal of = "+num1+" "+ope+" "+num2+" = "+ans);

		String output = num1+" "+ope+" "+num2+" = "+ans;

		if(!(output.equals(0.000001f)))
		{
			System.out.println(output);
		}

		System.out.println("\n--------------------------------------------------------------------");
		
		
	}
}
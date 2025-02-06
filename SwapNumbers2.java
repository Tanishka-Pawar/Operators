class SwapNumbers2
{
	public static void main(String[] args)
	{
		//without using temp.
		int a = 10;
		int b = 20;
		System.out.println("---------------BEFORE SWAPPING-------------------");
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);

		a =a+b;//10+20=30-a
		b =a-b;//30-20=10-b
		a =a-b;//30-10=20-current a
		System.out.println("---------------AFTER SWAPPING-------------------");
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);

	}
}
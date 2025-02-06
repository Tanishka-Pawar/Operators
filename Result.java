import java.util.Scanner;
class Result
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student marks = ");
		float marks = sc.nextFloat();
			
		
		float percentage = (marks*100)/600;
		String ans = (percentage >= 75)?("A Grade with "+percentage+" %"):((percentage >= 60)?("B Grade with "+percentage+" %"):((percentage >= 35)?("C Grade with "+percentage+" %"):("Fail")));
		
		
		System.out.println(ans);
			
	}
}

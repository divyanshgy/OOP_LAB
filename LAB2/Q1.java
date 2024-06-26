import java.util.Scanner;
class Q1
{
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int n=sc.nextInt();
		boolean ans1=true;
		boolean ans2=false;
		
		if ((n%4==0) && (n%100!=0))
		{
			System.out.println(ans1);
		}
		
		else if ((n%4==0) && (n%100!=0) || (n%400==0))
		{
			System.out.println(ans1);
		}
		else
		{
			System.out.println(ans2);
		}
	}
}
import java.util.Scanner;
class Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,rem;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		int sum=0;
		int x=n;
		while (n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}

		if (sum==x)
		{
			System.out.println("Input is armstrong number!");
		}
		else 
		{
			System.out.println("Input is not an armstrong number");
		}
	}
}
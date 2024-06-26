import java.lang.Math;
import java.util.Scanner;
class Q7a
{
	static int Fact(int d)
	{
		int k=1;
		for (int i=1;i<=d;i++)
		{
			k=k*i;
		}
		return k;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x in degrees to calculate sin(x): ");
		int x=sc.nextInt();
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		int d=1;
		int k=1;
		float gen=0;
		
		for (int i=0;i<n;i++)
		{
			gen+=((Math.pow(-1,i))*(Math.pow(x,d)))/Fact(d);
			d+=2;
		}
		System.out.println("sin("+x+"): "+gen);
	}
}
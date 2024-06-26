import java.lang.Math;
import java.util.Scanner;
class Q7b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms in sum: ");
		int n=sc.nextInt();
		double sum=0;
		int i=1;
		while (i!=n+1)
		{
			sum+=(Math.pow((double)1/i,i));
			i++;
		}
		System.out.println("Sum: "+sum);
	}
}
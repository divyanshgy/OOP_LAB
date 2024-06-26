import java.util.Scanner;
class Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		System.out.println("Enter input number for pattern display: ");
		n=sc.nextInt();
		
		for (i=1;i<n+1;i++)
		{
			for (j=0;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}
import java.util.Scanner;
class Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,i,j;
		int flag=0;
		System.out.println("Enter values n and m to generate prime numbers between them: ");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("List of prime numbers between "+n+" and "+m+": ");
		
		for (i=n+1;i<m;i++)
		{
			for (j=2;j<i;j++)
			{
				if (i%j==0)
				{
					flag=0;
					break;
				}
				else 
				{
					flag=1;
				}
			}
			if (flag==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
















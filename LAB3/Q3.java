import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,j;
		System.out.println("Enter input number for pattern display: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		for (int k=0;k<n;k++)
		{
			arr[k]=k+1;
		}
		
		for (int i:arr)
		{
			for (j=0;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
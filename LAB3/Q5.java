import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		int flag=0;
		System.out.println("Enter number of elements in array: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr=new int[n];

		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to be searched: ");
		int key=sc.nextInt();
		System.out.println("The value is found at locations: ");
		int ind=0;
		for (int j:arr)
		{
			if (key==j)
			{
				System.out.print("arr["+ind+"]");
			}
			ind++;
		}
	}
}
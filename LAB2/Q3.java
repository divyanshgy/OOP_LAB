import java.util.Scanner;
class Q3
{
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n1=sc.nextInt();

		int m=n1<<1;
		float d=(float) (n1>>1);
		System.out.println(n1+"*2="+m);
		System.out.println(n1+"/2="+d);
	}
}
import java.util.Scanner;
class Q2
{
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer, double and character respectively: ");
		int n1=sc.nextInt();
		double n2=sc.nextDouble();
 		char n3=sc.next().charAt(0);

		byte b=(byte) n1;
		int i=(int) n3;
		byte b1=(byte) n2;
		int i1=(int) n2;

		System.out.println("After converting: "+b+" "+i+" "+b1+" "+i1+" ");
	}
}
		
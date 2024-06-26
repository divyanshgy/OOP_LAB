import java.util.Scanner;
class Q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three integral numbers: ");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		int l,s;
		l=(a>b)?((a>c)?a:c):((b>c)?b:c);
		s=(a<b)?((c<a)?c:a):((b<c)?b:c);

		System.out.println("Largest: "+l+"Smallest: "+s);
	}
}
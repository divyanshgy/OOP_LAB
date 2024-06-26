import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;	
		char c,ans;
		
		do
		{
			System.out.println("Enter the first number, operator, second number respectively: ");
			n1=sc.nextInt();
			c=sc.next().charAt(0);
			n2=sc.nextInt();

			switch (c)
			{
				case '+':
				System.out.println(n1+"+"+n2);
				System.out.println("Answer: "+(n1+n2));
				break;
				case '-':
				System.out.println(n1+"-"+n2);
				System.out.println("Answer: "+(n1-n2));
				break;
				case '*':
				System.out.println(n1+"*"+n2);
				System.out.println("Answer: "+(n1*n2));
				break;
				case '/':
				System.out.println(n1+"/"+n2);
				float x=(float) n1/n2;
				System.out.println("Answer: "+x);
				break;

				default:
				System.out.println("Operator not defined!!");
			}
			System.out.println("Do another(y/n)?");
			ans=sc.next().charAt(0);
		}while(ans=='y');
	}
}
			
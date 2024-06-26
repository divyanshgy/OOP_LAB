//program to print factorial of a given no
import java.util.Scanner;

class Q5
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int num,k,i;
        k=1;
        num=scanner.nextInt();
        for (i=num;i>0;i--)
        {
            k=k*i;
        }
        System.out.println("Factorial of entered number is: "+k);
    }
}
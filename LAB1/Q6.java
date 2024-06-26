//program to print table of number entered by user
import java.util.Scanner;

class Q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,k,num;
        num=sc.nextInt();
        for (i=1;i<11;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
        
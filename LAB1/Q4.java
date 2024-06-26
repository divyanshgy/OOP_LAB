//Program to check whether a number is palindrome
import java.util.Scanner;
class Q4
{
    public static void main(String args[])
    {
         Scanner scanner=new Scanner(System.in);
         int num,n,test,rem;
         int sum=0;
         num=scanner.nextInt();
         test=num;
         while (num>0)
         {
             rem=num%10;
             num=num/10;
             sum=(sum*10)+(rem);
         }

         if (test==sum)
         {
             System.out.println("Entered number is palindrome!!");
         }
         else 
         {
             System.out.println("Entered number is not palindrome");
         }
    }
}
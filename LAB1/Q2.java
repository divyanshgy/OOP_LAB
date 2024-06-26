import java.util.Scanner;
//Lab1 Q2
class Q2
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int[] arr;
        arr=new int[10];
        int i;
        for (i=0;i<10;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int c1=0, c2=0, c3=0;
        for (i=0;i<10;i++)
        {
            if (arr[i]>0)
            {
                 c1++;
            }
            else if (arr[i]<0)
            {
                 c2++;
            }
            else 
            {
                 c3++;
            }
        }
        System.out.println("Number of positive numbers: "+c1);
        System.out.println("Number of negative numbers: "+c2);
        System.out.println("Number of zeros: "+c3);
    }
}      
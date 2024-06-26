import java.util.Scanner;

public class Lab10q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter integer(for exception enter greater than 10): ");
        int x=sc.nextInt();
        try{
            a[x]=0;
            System.out.println("Entered integer is between 0 and 10");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught!! "+e);
        }
    }
}

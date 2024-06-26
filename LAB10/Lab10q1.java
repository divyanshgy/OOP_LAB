import java.util.Scanner;

public class Lab10q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String inp=sc.nextLine();
        try{
            int a = Integer.parseInt(inp);
        }
        catch(NumberFormatException e){
            System.out.println("Caught!! "+e);
        }
    }
}

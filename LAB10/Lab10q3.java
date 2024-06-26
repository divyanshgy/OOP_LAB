import java.util.Scanner;

public class Lab10q3 {
    public static char getGrade(double x){
        if (x>=90){
            return 'A';
        }
        else if (x>=80){
            return 'B';
        }
        else if (x>=70){
            return 'C';
        }
        else return 'F';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int rno;
        int[] mks=new int[3];
        try{
            System.out.println("Enter name, roll no, and marks in three subjects respectively: ");
            name=sc.nextLine();
            rno=Integer.parseInt(sc.nextLine());
            mks[0]=Integer.parseInt(sc.nextLine());
            mks[1]=Integer.parseInt(sc.nextLine());
            mks[2]=Integer.parseInt(sc.nextLine());

            double pc=((mks[0]+mks[1]+mks[2])/3);
            System.out.println("Percentage: "+pc);
            System.out.println("Grade: "+getGrade(pc));
        }
        catch(NumberFormatException e){
            System.out.println("Caught: "+e);
            System.out.println("Invalid input! Enter valid inputs.");
        }
    }
}

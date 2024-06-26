import java.util.Scanner;

class MarkOutofBoundsException extends Exception{
    int x;
    MarkOutofBoundsException(int x){
        this.x=x;
    }
    public String toString(){
        return "MarkOutofBoundsException: marks("+x+") are greater than 100!";
    }
}

public class Lab10q10 {

    public static void checkMarks(int x) throws MarkOutofBoundsException{
        if (x>100){
            throw new MarkOutofBoundsException(x);
        }
        System.out.println("Marks are less than equal to 100!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int a=sc.nextInt();
        try{
            checkMarks(a);
        }
        catch(MarkOutofBoundsException e){
            System.out.println("Caught: "+e);
            System.out.println("Marks more than 100!");
        }
    }
}

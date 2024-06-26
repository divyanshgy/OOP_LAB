import java.util.Scanner;

class Input_Exception extends Exception{
    int x;
    Input_Exception(int x){
        this.x=x;
    }
    public String toString(){
        return "Input_Exception: marks("+x+") are greater than 100!";
    }
}

public class Lab10q7 {

    public static void checkMarks(int x) throws Input_Exception{
        if (x>100){
            throw new Input_Exception(x);
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
        catch(Input_Exception e){
            System.out.println("Caught: "+e);
            System.out.println("Marks more than 100!");
        }
    }
}

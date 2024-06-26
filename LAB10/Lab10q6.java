import java.util.Scanner;

class NegRootException extends Exception{
    int x;
    NegRootException(int x){
        this.x=x;
    }
    public String toString(){
        return "NegRootException: root of a negative number("+x+") is not possible!";
    }
}

public class Lab10q6 {

    public static void checkNum(int x) throws NegRootException{
        if (x<0){
            throw new NegRootException(x);
        }
        System.out.println("root can be calculated!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for checking root: ");
        int x=sc.nextInt();
        try{
            checkNum(x);
        }
        catch(NegRootException e){
            System.out.println("Caught: "+e);
        }
    }
}

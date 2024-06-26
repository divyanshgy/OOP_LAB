import java.util.Scanner;

class EvenNumberException extends Exception{
    int x;
    EvenNumberException(int x){
        this.x=x;
    }
    public String toString(){
        return "EvenNumberException: number("+x+") is even!";
    }
}

public class Lab10q9 {

    public static void checkEven(int x) throws EvenNumberException{
        if (x%2==0){
            throw new EvenNumberException(x);
        }
        System.out.println("Number is odd or zero!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        try{
            checkEven(a);
        }
        catch(EvenNumberException e){
            System.out.println("Caught: "+e);
            System.out.println("Number is even!");
        }
    }
}

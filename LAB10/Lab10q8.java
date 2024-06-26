import java.util.Scanner;

class NegativeArraySizeException extends Exception{
    int x;
    NegativeArraySizeException(int x){
        this.x=x;
    }
    public String toString(){
        return "NegativeArraySizeException: Array size("+x+") cannot be negative!";
    }
}

public class Lab10q8 {

    public static void arraySize(int x) throws NegativeArraySizeException{
        if (x<0){
            throw new NegativeArraySizeException(x);
        }
        System.out.println("Valid array size!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a=sc.nextInt();
        try{
            arraySize(a);
        }
        catch(NegativeArraySizeException e){
            System.out.println("Caught: "+e);
            System.out.println("Not a valid array size!");
        }
    }
}

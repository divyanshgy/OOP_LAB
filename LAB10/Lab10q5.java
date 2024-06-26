import java.util.Scanner;

class MatrixValidationException extends Exception{
    int r,c;
    MatrixValidationException(int r, int c){
        this.r=r;
        this.c=c;
    }
    public String toString(){
        return "MatrixValidationException: rowsize("+r+")"+"is not equal to columnsize("+c+")";
    }
}

public class Lab10q5 {

    public static void validMat(int r, int c) throws MatrixValidationException{
        if (r!=c){
            throw new MatrixValidationException(r,c);
        }
        System.out.println("Square matrix!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rowsize and columnsize of matrix: ");
        int rsize=sc.nextInt();
        int csize=sc.nextInt();
        try{
            validMat(rsize,csize);
        }
        catch(MatrixValidationException e){
            System.out.println("Caught: "+e);
            System.out.println("Not a valid matrix");
        }
    }
}

import java.util.Scanner;
interface area{
    double calculateArea();
}
class square implements area{
    double s;
    square(double s){
        this.s=s;
    }
    public double calculateArea(){
        return s*s;
    }
}
class triangle implements area{
    double b;
    double h;
    triangle(double b, double h){
        this.b=b;
        this.h=h;
    }
    public double calculateArea(){
        return 0.5*b*h;
    }
}
public class Lab8q5 {
    public static void main(String[] args) {
        square sq=new square(2.5);
        triangle t=new triangle(4,3);

        double sqArea=sq.calculateArea();
        double tArea=t.calculateArea();
        System.out.println("Area of square: "+sqArea);
        System.out.println("Area of triangle: "+tArea);
    }
}

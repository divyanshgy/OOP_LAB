import java.util.Scanner;
class box{
    double w,h,d;
    void initialize(double width, double height, double depth){
        w=width;
        h=height;
        d=depth;
    }

    double volume(){
        return w*h*d;
    }
}

class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        box b=new box();
        System.out.println("Enter the width, height and depth: ");
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double d=sc.nextDouble();
        b.initialize(w, h, d);
        double vol=b.volume();
        System.out.println("Volume is: "+vol);
    }
}
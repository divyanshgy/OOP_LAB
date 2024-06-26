//Java Program to calculate area of circle, rectangle, triangle
class AreaCircle
{
    public static void main(String args[])
    {
        int a2,r,l,b,base,h;
        double a1,a3;
        r=5;
        l=10;
        b=2;
        base=3;
        h=4;
        a1=3.14*r*r;
        a2=l*b;
        a3=0.5*base*h;
        System.out.println("Area of circle is: "+a1);
        System.out.println("Area of rectangle is: "+a2);
        System.out.println("Area of triangle is: "+a3);
    }
}
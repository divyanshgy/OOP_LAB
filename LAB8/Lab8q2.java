/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q2;
import java.util.Scanner;

abstract class area{
    abstract double calculateArea();
}

class rectangle extends area{
    double l,w;
    rectangle(double len, double wid){
        l=len;
        w=wid;
    }
    double calculateArea(){
        return l*w;
    }
}

class circle extends area{
    double r;
    circle(double rad){
        r=rad;
    }
    double calculateArea(){
        return 3.14*r*r;
    }
}

public class Lab8q2 {

    public static void main(String[] args) {
        rectangle rectangle = new rectangle(5.0, 4.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of Rectangle: " + rectangleArea);

        circle circle = new circle(3.0);
        double circleArea = circle.calculateArea();
        System.out.println("Area of Circle: " + circleArea);
    }
    
}

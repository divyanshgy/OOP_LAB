/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q2;

class Count{
    static int c=0;
    Count(){
        c++;
    }
}

public class Lab7q2 {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println("Number of objects created: "+c3.c);
    }
}

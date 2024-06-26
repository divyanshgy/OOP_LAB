/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q3;
import java.util.Scanner;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

public class Lab6q3 {
    public static void main(String[] args) {
        Bank b1=new SBI();
        Bank b2=new ICICI();
        Bank b3=new AXIS();
        System.out.println("Interest rate fron SBI bank: "+b1.getRateOfInterest()+"%");
        System.out.println("Interest rate fron ICICI bank: "+b2.getRateOfInterest()+"%");
        System.out.println("Interest rate fron AXIS bank: "+b3.getRateOfInterest()+"%");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q1;
import java.util.Scanner;

class Account{
    String name;
    int accno;
    Account(String n,int ac){
        name=n;
        accno=ac;
    }
}

class Current extends Account{
    String type;
    double balance=0;
    Current(String n,int ac,String t){
        super(n,ac);
        type=t;
    }
    void deposit(double amt){
        balance=balance+amt;
    }
    void display(){
        System.out.println("Balance: "+balance);
    }
    void withdraw(double amt){
        balance=balance-amt;
    }
    void minbal(){
        if (balance<10000){
            System.out.println("Balance less than minimum amount!!");
            System.out.println("5% service tax imposed!!");
            balance=balance-(balance*0.05);
        }
        else{
            System.out.println("No service tax imposed");
        }
    }
}

class Savings extends Account{
    double balance=0;
    String type;
    Savings(String n,int ac,String t){
        super(n,ac);
        type=t;
    }
    void deposit(double amt){
        balance=balance+amt;
    }
    void display(){
        System.out.println("Balance: "+balance);
    }
    void withdraw(double amt){
        balance=balance-amt;
    }
    void interest(){
        double interest=(0.08*balance);
        balance=balance+interest;
    }
}

public class Lab6q1 {
    public static void main(String[] args) {
        Current c=new Current("Yash",46678,"current");
        System.out.println("Current account: ");
        c.deposit(7000);
        c.display();
        c.withdraw(2000);
        c.display();
        c.minbal();
        c.display();
        Savings s=new Savings("Vansh",54314,"savings");
        System.out.println("Savings account: ");
        s.deposit(11000);
        s.display();
        s.withdraw(1000);
        s.display();
        s.interest();
        s.display();
    }
}

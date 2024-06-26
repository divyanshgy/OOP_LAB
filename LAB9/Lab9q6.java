/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q6;
import java.util.Scanner;

class student{
    int regno;
    String first;
    String last;
    String degree;
    student(int regno,String first,String last,String degree){
        this.regno=regno;
        this.first=first;
        this.last=last;
        this.degree=degree;
    }
}

public class Lab9q6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student s[]=new student[4];
        s[0]=new student(220911,"yash","joshi","mech");
        s[1]=new student(220953,"vansh","narang","biomed");
        s[2]=new student(220911,"divyansh","goyal","it");
        s[3]=new student(220911, "harshit","dugar","it");
        
        System.out.println("Enter first or last name to search: ");
        String search=new String();
        search=sc.nextLine();
        for (int i=0;i<4;i++){
            if (s[i].first.equals(search) || s[i].last.equals(search)){
                System.out.println("Details: "+s[i].regno+" "+s[i].first+" "+s[i].last+" "+s[i].degree);
            }
        }
    }
    
}

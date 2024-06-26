/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q1;
import java.util.Scanner;

class Student_Detail{
    String name;
    int id;
    String college_name="MIT";
    Student_Detail(String name, int id){
        this.name=name;
        this.id=id;
    }
    void display_details(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("College: "+college_name);
    }
}

public class Lab7q1 {
    public static void main(String[] args) {
        Student_Detail s1=new Student_Detail("Yash",220911);
        Student_Detail s2=new Student_Detail("Vansh",220953);
        s1.display_details();
        s2.display_details();
    }
}

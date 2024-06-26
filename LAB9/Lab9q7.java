/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q7;
import java.util.Scanner;

public class Lab9q7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        System.out.println("Enter the elements: ");
        for (int i=0;i<5;i++){
            str[i]=sc.nextLine();
        }
        String cc=new String();
        for (int i=0;i<5;i++){
            cc=cc.concat(str[i]);
        }
        System.out.println("Final: "+cc);
    }
}

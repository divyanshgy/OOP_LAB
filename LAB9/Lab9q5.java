/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q5;
import java.util.Scanner;
import java.util.Arrays;

public class Lab9q5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        Arrays.sort(str);
        System.out.println("Elements: ");
        for (int i=0;i<n;i++){
            System.out.println(str[i]+" ");
        }
    }
    
}

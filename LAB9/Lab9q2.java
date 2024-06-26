/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q2;
import java.util.Scanner;

public class Lab9q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter replacing string: ");
        String x=sc.nextLine();
        int i,j;
        char strx[]=str.toCharArray();
        int n=strx.length;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (strx[i]==strx[j]){
                    String test=String.valueOf(strx[i]);
                    str=str.replaceAll(test, x);
                    break;
                }
            }
        }
        System.out.println(str);
    }
    
}

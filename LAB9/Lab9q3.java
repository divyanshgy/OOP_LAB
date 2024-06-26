/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q3;
import java.util.Scanner;
import java.util.Arrays;

public class Lab9q3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        while (true){
            System.out.println("1.Check palindrome\n2.write string in alphabetical order\n3.reverse string\n4.Concat original and reverse string\n5.Exit\n");
            int ch=sc.nextInt();
            
            switch(ch){
                case 1:
                    StringBuilder rev=new StringBuilder(str).reverse();
                    rev.toString();
                    if (str.equals(rev)){
                        System.out.println("Palindrome!");
                    }
                    else{
                        System.out.println("Not palindrome");
                    }
                    break;
                case 2:
                    char[] CharArray=str.toCharArray();
                    Arrays.sort(CharArray);
                    String sorted=new String(CharArray);
                    System.out.println("Alphabetically sorted string: "+sorted);
                    break;
                case 3:
                    StringBuffer revv=new StringBuffer(str).reverse();
                    revv.toString();
                    System.out.println("Reversed string: "+revv);
                    break;
                case 4:
                    StringBuffer revvv=new StringBuffer(str).reverse();
                    String reverse=revvv.toString();
                    String cc=str.concat(reverse);
                    System.out.println(cc);
                    break;
                case 5: 
                    System.exit(0);
            }
        }
    }
    
}

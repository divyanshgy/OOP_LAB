/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q4;
import java.util.Scanner;

public class Lab9q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        while (true){
            System.out.println("1.Compare\n2.Convert uppercase to lowercase and vice versa\n3.display if string contains substring\n4.If 3 is true replace it with hello\n5.Exit\n");
            int ch=sc.nextInt();
            sc.nextLine();
            
            switch(ch){
                case 1:
                    System.out.println("Enter second string: ");
                    String str2=sc.nextLine();
                    int x=str.compareTo(str2);
                    if (x>0) {
                        System.out.println("String 1>String 2");
                    }
                    else if (x==0) {
                        System.out.println("String 1=String 2");
                    }
                    else {
                        System.out.println("String 1<String 2");
                    }
                    break;
                case 2:
                    int i,n;
                    n=str.length();
                    StringBuffer result=new StringBuffer();
                    for (i=0;i<n;i++){
                        char c=str.charAt(i);
                        if (Character.isUpperCase(c)){
                            result.append(Character.toLowerCase(c));
                        }
                        else if (Character.isLowerCase(c)){
                            result.append(Character.toUpperCase(c));
                        }
                        else{
                            result.append(c);
                        }
                    }
                    System.out.println("Final string: "+result);
                    break;
                case 3:
                    System.out.println("Enter the substring: ");
                    String stri=sc.nextLine();
                    if (str.contains(stri)){
                        System.out.println("True");
                    }
                    else {
                        System.out.println("False");
                    }
                    break;
                case 4:
                    System.out.println("Enter the substring: ");
                    String strx=sc.nextLine();
                    if (str.contains(strx)){
                        String xtx=str.replaceAll(strx, "Hello");
                        System.out.println("Final string: "+xtx);
                    }
                    
                    break;
                case 5: 
                    System.exit(0);
            }
        }
    }
}

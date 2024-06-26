/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q3;

/**
 *
 * @author divyansh
 */
public class Lab7q3 {

    public static void main(String[] args) {
        int a=10;
        Integer wrapped_a=a; //autoboxing
        
        char c='a';
        Character wrapped_c=c; //autoboxing
        
        int unbox_a=wrapped_a; //unboxing
        char unbox_c=wrapped_c; //unboxing
        
        System.out.println("Primitive: "+a+" "+c);
        System.out.println("Wrapped: "+wrapped_a+" "+wrapped_c);
        System.out.println("Unboxed: "+unbox_a+" "+unbox_c);
    }
    
}

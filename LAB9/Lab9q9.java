/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q9;

import java.util.Scanner;

public class Lab9q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            System.out.println("Please enter a five-letter word.");
        } 
        else {
            System.out.println("Three-letter words that can be derived from '" + word + "':");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (i != j && i != k && j != k) {
                            String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                            System.out.println(threeLetterWord);
                        }
                    }
                }
            }
        }
    }
}


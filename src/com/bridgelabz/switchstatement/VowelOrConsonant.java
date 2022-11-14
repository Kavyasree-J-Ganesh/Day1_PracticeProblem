package com.bridgelabz.switchstatement;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a Character ");
        String  str = scan.nextLine();

        switch (str) {
            case "a":
                System.out.println("It is VOWEL");
                break;
            case "e":
                System.out.println("It is VOWEL");
                break;
            case "i":
                System.out.println("It is VOWEL");
                break;
            case "o":
                System.out.println("It is VOWEL");
                break;
            case "u":
                System.out.println("It is VOWEL");
                break;
            default:
                System.out.println("It is CONSONANT");
        }
    }
}

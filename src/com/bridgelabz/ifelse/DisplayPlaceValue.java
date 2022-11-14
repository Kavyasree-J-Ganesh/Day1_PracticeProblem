package com.bridgelabz.ifelse;

public class DisplayPlaceValue {
    public static void main(String[] args){
        int p = Integer.valueOf(args[0]);
        if (p == 1){
            System.out.println("Unit");
        } else if (p == 10) {
            System.out.println("Ten");
        } else if (p == 100) {
            System.out.println("Hundred");
        } else if (p == 1000) {
            System.out.println("Thousand");
        } else{
            System.out.println("Invalid");
        }
    }
}

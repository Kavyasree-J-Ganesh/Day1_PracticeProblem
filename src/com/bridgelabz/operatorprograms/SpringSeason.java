package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class
SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter month ");
        int m = scan.nextInt();
        System.out.println(" Enter day ");
        int d = scan.nextInt();
        if ((m == 3 && d >= 20 && d<= 31) ||
                (m == 4 && d >= 1 && d<= 30) ||
                (m == 5 && d >= 1 && d<= 31) ||
                (m == 6 && d >= 1 && d<= 20)){
            System.out.println(" True ");
        }else{
            System.out.println(" False ");
        }
    }
}

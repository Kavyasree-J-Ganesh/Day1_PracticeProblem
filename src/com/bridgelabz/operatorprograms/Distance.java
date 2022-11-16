package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the distance along x axis ");
        int x = scan.nextInt();
        System.out.println(" Enter the distance along y axis ");
        int y = scan.nextInt();
        int z = x*x + y*y;
        double distance = Math.sqrt(z);
        System.out.println(distance);
    }
}

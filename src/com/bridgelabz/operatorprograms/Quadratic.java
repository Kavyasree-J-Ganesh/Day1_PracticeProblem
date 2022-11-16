package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " Enter the value of a ");
        double a = scan.nextDouble();
        System.out.println( " Enter the value of b ");
        double b = scan.nextDouble();
        System.out.println( " Enter the value of c ");
        double c = scan.nextDouble();
        double delta = b*b - 4*a*c;
        double sqrt = Math.sqrt(delta);
        if(sqrt>=0.0){
            double result1 = (-b + delta) / (2*a);
            double result2 = (-b - delta) / (2*a);

            System.out.println(" The possible values of x are ");
            System.out.println(result1);
            System.out.println(result2);
        } else {
            System.out.println("Squre root's are not real");
        }

    }
}

package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the value of a ");
        int a = scan.nextInt();
        System.out.println(" Enter the value of b ");
        int b = scan.nextInt();
        System.out.println(" Enter the value of c ");
        int c = scan.nextInt();
        int[] arr = new int[4]; // represents there are 4 elements in this array.
        arr[0] = a+b*c;
        arr[1] = c+a/b;
        arr[2] = a%b+c;
        arr[3] = a*b+c;
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(" Min value is " + smallest );
        System.out.println(" Max value is " + largest );
    }
}

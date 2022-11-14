package com.bridgelabz.whileloop;

public class SumOfNaturalNumber {
    static int sumOfNumbers(int num) {
        int sum = 0;
        int i = 0;
        while (i <= num){
            sum = sum + i;
            i++;
        }
        return sum;
    }
    public static void main(String[] args){
        int p = sumOfNumbers(6);
        System.out.println(p);
    }
}

package com.bridgelabz.forloop;

public class SumOfNaturalNumbers {
    static void sumOfNumbers(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        sumOfNumbers(5);
    }
}

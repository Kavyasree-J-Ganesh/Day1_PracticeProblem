package com.bridgelabz.forloop;

public class ReverseNumber {
    static void reverseNumber(int num){
        int reverse = 0;
        for(; num >0; ){
            int mod = num % 10;
            reverse = reverse * 10 + mod;
            num = num / 10;
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        reverseNumber(231);
    }
}


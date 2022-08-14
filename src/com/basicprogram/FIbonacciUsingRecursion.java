package com.basicprogram;

public class FIbonacciUsingRecursion {
    static int n1 = 0, n2 = 1, n3;

    public static void main(String[] args) {
        System.out.print(n1+" "+n2);//printing 0 and 1
        int count=10;
        PrintNumber(count-2);//we are printed o and 1 so se are starting with 2
    }
    public static void PrintNumber(int count) {
        if (count >=0) {
            n3 = n1 + n2;
            n1 = n2;
            n2=n3;
            System.out.print(" "+n3);
            PrintNumber(count-1);//Recursion
        }
    }
}


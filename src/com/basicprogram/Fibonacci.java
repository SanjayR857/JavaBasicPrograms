package com.basicprogram;

public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci Series without using recursion
        int n1 = 0, n2 = 1, n3 = 0, i, count = 10;
        System.out.print(n1 + " " + n2);//print 0 and 1
        for (i = 2; i <= count; i++)//starting with 2 because 0 and 1 is printed 0 and 1
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}


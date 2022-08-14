package com.basicprogram;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //dynamic input
        int n= scan.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}

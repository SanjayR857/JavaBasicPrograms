package com.basicprogram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i=2,m=0,flog=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println("it is not PrimeNUmber");
        }
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("it is  not PrimeNUmber "+n);
                flog=1;
            }
        }
        if(flog==0){
            System.out.println("it is PrimeNumber "+n);
        }
    }
}

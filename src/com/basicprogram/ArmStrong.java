package com.basicprogram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        //limit
        System.out.println("Enter the ArmStrong "+num+" are");
        for(int i=0;i<=num;i++){
            if(isArmstrong(i))
                System.out.print(i+" ");
        }
    }

    private static boolean isArmstrong(int i) {
        int last=0,digit=0,sum=0;
        int temp=0;
        //taking i value as temp
        temp=i;
        //to find digit
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        //to find last digit and sum of the power
        temp=i;
        while(temp>0){
            last=temp%10;
            sum= (int) (sum+Math.pow(last,digit));
            temp=temp/10;
        }
        //condition
        if(i==sum)
            return true;
        else
            return  false;
    }
}

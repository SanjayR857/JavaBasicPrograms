package com.basicprogram;

public class Pattern {
    public static void main(String[] args) {
        //outside for loop rows
        for(int i=0;i<=3;i++){
            //inside loop for columns
            for(int j=0;j<=i;j++){
                System.out.print("*@");
            }
            System.out.println();
        }
    }
}

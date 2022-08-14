package com.basicprogram;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        //outside for loop for rows
        for(int i=0;i<=5;i++){
            //inner for loop for columns
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            //inner for loop for columns
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

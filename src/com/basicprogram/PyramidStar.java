package com.basicprogram;

public class PyramidStar {
    public static void main(String[] args) {
        //outside for loop for rows
        for(int i=1;i<=5;i++){
            //inner for loop for space
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            //inner for loop for star print
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            //moving to next line
            System.out.println();
        }
    }
}

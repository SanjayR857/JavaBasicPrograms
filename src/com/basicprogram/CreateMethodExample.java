package com.basicprogram;

public class CreateMethodExample implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //invoking the clone() method of the super class
        return super.clone();
    }
    String str="New Object Method";

    public static void main(String[] args) {
        //create object of class
        CreateMethodExample obj1=new CreateMethodExample();
    //create new obj2 in try and catch to handle expection
        try{
            CreateMethodExample obj2=(CreateMethodExample) obj1.clone();
            System.out.println(obj2.str);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

       // System.out.println(obj.name);
        //name has private access in com.driver.RWOnly

        //setting value to name
        obj.setName("ABC");

        //getting name
        String str= obj.getName();

        System.out.println(str);
    }
}
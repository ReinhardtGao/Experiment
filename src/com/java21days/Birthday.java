package com.java21days;

class Birthday {
    public static void main(String[] arguments){
        String BD = "04/29/2016";
        System.out.println("Month is:" + BD.substring(0, 2));
        System.out.println("Day is:" + BD.substring(3, 5));
        System.out.println("Year is:" + BD.substring(6, 10));
    }
}

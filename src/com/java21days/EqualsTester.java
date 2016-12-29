package com.java21days;

class EqualsTester {
    public static void main(String[] arguments){
        String st1, st2;
        st1 = "Boy, that escalated quickly";
        st2 = st1;

        System.out.println("String1: " + st1);
        System.out.println("String2: " + st2);
        System.out.println("Same object? " + (st1 == st2));

        st2 = new String(st1);

        System.out.println("String1: "  + st1);
        System.out.println("String2: " + st2);
        System.out.println("Same object? " + (st1 == st2));
        System.out.println("Same value? " + st1.equals(st2));
    }
}

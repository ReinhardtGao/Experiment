package com.java21days;

public class Exercise{
    public static void main(String[] arguments) {
        int inv = 14000;
        double Yearone = inv * (1 + 0.4);
        double Yeartwo = Yearone - 1500;
        double Yearthree = Yeartwo * (1 + 0.12);
        System.out.println(Yearthree + "is your final earning.");

        int a,b;
        a = 5;
        b = 11;
        float c = a/b;
        int d = a%b;;
        System.out.println("c =" + c + "\td =" + d);
    }
}
package com.java21days;

import org.jetbrains.annotations.Contract;

public class Flying {

    @Contract(pure = true)
    private static double Calculate(double x, double y){
        return y/x;
    }
    public static void main(String[] argument){
        double time = 1.25;
        HWD Miles = new HWD();
        Miles.distance = 777;
        double AVGS = Calculate(time, Miles.distance);
        System.out.println("The average speed is: "+ AVGS + " km/h");
    }
}



package com.java21days;

import java.awt.Point;

class FourPoint extends Point {
    int z = 0;
    int t = 0;

    FourPoint(int x,int y,int z,int t){
        super(x, y);
        this.z = z;
        this.t = t;
    }
    public static void main(String[] arguments) {
        FourPoint np = new FourPoint(5, 5, 4, 100);
        System.out.println("x is " + np.x);
        System.out.println("y is " + np.y);
        System.out.println("z is " + np.z);
        System.out.println("t is " + np.t);
    }

}

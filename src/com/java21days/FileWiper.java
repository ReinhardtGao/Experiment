package com.java21days;

/**
 * Created by ReinhardtGao on 2017/3/5.
 */
import java.io.*;

public class FileWiper {
    public static void main(String[] arguments) {
        try {
            FileInputStream file = new FileInputStream("WipeFile.dat");
            boolean eof = false;
            int size = 0;
            while (!eof) {
                int input = file.read();
                if (input == -1) {
                    eof = true;
                } else {
                    size++;
                }
            }
            file.close();
            FileOutputStream outFile = new FileOutputStream("WipeFile.dat");
            for (int i = 0; i < size; i++) {
                outFile.write( (byte) 0 );
            }
            outFile.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }
}

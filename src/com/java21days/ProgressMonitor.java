package com.java21days;

import java.awt.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame{

    JProgressBar current;
    JTextField t = new JTextField(4);
    JTextArea out;
    int num = 0;

    public ProgressMonitor(){
        super("Progress Monitor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(450,88);
        setLayout(new FlowLayout());
        current = new JProgressBar(0,2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current);
        add(t);
    }

    public void iterate(){
        while(num < 2000){
            current.setValue(num);
            t.setText(Integer.toString(num));
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){}
            num += 95;
        }
    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e){
            System.err.println("Couldn't use the system " + "look and feel: " + e);
        }
    }

    public static void main(String[] arguments){
        ProgressMonitor pm = new ProgressMonitor();
        pm.setVisible(true);
        pm.iterate();
    }
}

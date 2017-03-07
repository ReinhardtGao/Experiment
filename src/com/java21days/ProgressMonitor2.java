package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressMonitor2 extends JFrame{

    JProgressBar current;
    int num = 0;
    boolean done = false;

    public ProgressMonitor2(){
        super("Progress Monitor 2");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLookAndFeel();
        addWindowListener(new WindowAdapter() {
            // user has tried to close window
            @Override
            public void windowClosing(WindowEvent event) {
                if (done){
                    //allow it
                    dispose();
                    System.exit(0);
                }
            }
        });
        setSize(400,100);
        setLayout(new FlowLayout());
        current = new JProgressBar(0,2000);
        current.setValue(0);
        current.setStringPainted(true);
        current.setPreferredSize(new Dimension(360, 48));
        add(current);
        setVisible(true);
        iterate();
    }

    public void iterate(){
        while(num < 2000){
            current.setValue(num);
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

    public static void main(String[] arguments) {
        new ProgressMonitor2();
    }
}

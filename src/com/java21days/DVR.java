package com.java21days;

import javax.swing.*;
/**
 * Created by ReinhardtGao on 2017/2/4.
 */
public class DVR extends JFrame{
    JButton play = new JButton("Play");
    JButton stopEject = new JButton("Stop/Eject");
    JButton rewind = new JButton("Rewind");
    JButton fastForward = new JButton("Fast Forward");
    JButton pause = new JButton("Pause");

    public DVR(){
        super("DVR");
        setSize(500,115);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(play);
        pane.add(stopEject);
        pane.add(rewind);
        pane.add(fastForward);
        pane.add(pause);
        add(pane);
        pack();
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
            // ignore error
        }
    }

    public static void main(String[] arguments){
        DVR.setLookAndFeel();
        DVR dvr = new DVR();
    }
}

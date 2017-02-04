package com.java21days;

import javax.swing.*;

public class Subscriptions extends JFrame{
    String[] subs = { "Burningbird", "Freeform Goodness",
            "Ideoplex", "Inessential", "Intertwingly", "Now This",
            "Rasterweb", "RC3", "Whole Lotta Nothing", "Workbench" };
    JList<String> subList = new JList<>(subs);

    public Subscriptions(){
        super("Subscriptions");
        setSize(150,335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel subLabel = new JLabel("RSS Subscription");
        pane.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroll = new JScrollPane(subList);
        pane.add(scroll);
        add(pane);
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
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}

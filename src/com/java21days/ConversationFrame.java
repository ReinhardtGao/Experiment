package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ConversationFrame extends JFrame {

    private JLabel titleLabel = new JLabel("Title: ", SwingConstants.HORIZONTAL);
    private JTextField name;

    private ConversationFrame() {
        super();
        setSize(275, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // Get the name of the frame
        // Site name;
        String response = JOptionPane.showInputDialog(null,"Enter the title of the frame: ");
        name = new JTextField(response,20);
        setLayout(new GridLayout(3,2));
        add(titleLabel);
        add(name);
        setTitle(response);
        setVisible(true);
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
        ConversationFrame cf = new ConversationFrame();
    }
}

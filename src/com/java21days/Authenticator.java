/*
package com.java21days;

import  javax.swing.*;

public class Authenticator extends JFrame{
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator(){
        super("Account Information");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JScrollPane scroll = new JScrollPane(comments, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JLabel usernamelabel = new JLabel("Username: ");
        JLabel passwordlabel = new JLabel("Password: ");
        JLabel commentslabel = new JLabel("Comments: ");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        pane.add(usernamelabel);
        pane.add(username);
        pane.add(passwordlabel);
        pane.add(password);
        pane.add(commentslabel);
        pane.add(scroll);
        pane.add(comments);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] arguments){
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}
*/

package com.java21days;

import javax.swing.*;

public class Authenticator extends javax.swing.JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public Authenticator() {
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel ();
        JTextArea comments = new JTextArea(4, 15);
        JScrollPane scroll = new JScrollPane(comments,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pane.add(scroll);
        add(pane);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Couldn't use the system look and feel: " + e);
        }
    }

    public static void main(String[] arguments) {
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}
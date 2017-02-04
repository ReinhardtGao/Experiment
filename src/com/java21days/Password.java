package com.java21days;
import javax.swing.*;
/**
 * Created by ReinhardtGao on 2017/2/4.
 */
public class Password extends JFrame{
    PasswordFrame pf = new PasswordFrame();

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
            // ignore error
        }
    }

    public static void main(String[] arguments){
        Password.setLookAndFeel();
        Password pw = new Password();
    }
}

class PasswordFrame extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public PasswordFrame() {
        super("Credential Validation");
        setSize(300, 175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JLabel usernamelabel = new JLabel("Username: ");
        JLabel passwordlabel = new JLabel("Password: ");
        pane.add(usernamelabel);
        pane.add(username);
        pane.add(passwordlabel);
        pane.add(password);
        pane.add(ok);
        pane.add(cancel);
        add(pane);
        setVisible(true);
    }
}



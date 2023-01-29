package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame{
    private JButton Zalogujbutton;
    private JButton Zarejestrujbutton;
    private JButton Goscbutton;
    private JPanel MainPanel;

    public static void main (String[] args){
        Start start = new Start();

    }

    public Start(){
        super("Okno startowe");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);

        Zalogujbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login log = new Login();
                dispose();
            }
        });
        Zarejestrujbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Register reg = new Register();
                dispose();
            }
        });
        Goscbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeGuest homeGuest = new HomeGuest();
                dispose();
            }
        });
    }
}

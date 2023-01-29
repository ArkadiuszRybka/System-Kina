package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreBuy extends JFrame{
    private JPanel MainPanel;
    private JButton zarejestrujButton;
    private JButton zalogujButton;

    public static void main (String[] args){
        PreBuy preBuy = new PreBuy();

    }

    public PreBuy() {
        super("Przed kupnem");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);

        zalogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                dispose();
            }
        });
        zarejestrujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register register = new Register();
                dispose();
            }
        });
    }
}

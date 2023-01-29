package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Register extends JFrame{
    private JPanel MainPanel;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passField1;
    private JPasswordField passField2;
    private JButton zarejestrujButton;


    public static void main (String[] args){
        Register register = new Register();

    }

    public Register(){
        super("Rejestracja");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);


        zarejestrujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sprawdzNazwe()) {
                    if (sprawdzEmail()) {
                        if (String.valueOf(passField1.getPassword()).equals(String.valueOf(passField2.getPassword()))) {
                            try {

                                Statement s = DataBase.mycon().createStatement();
                                s.executeUpdate("Insert Into klienci (Name, Email, Password) Values  ('"+nameField.getText()+"','"+emailField.getText()+"','"+String.valueOf(passField1.getPassword())+"')");
                                JOptionPane.showMessageDialog(null, "Pomyślnie zarejestrowano. Zaloguj się.");
                                dispose();
                                Login log = new Login();

                            } catch (Exception r) {
                                System.out.println(r);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Różne hasła");
                            passField1.setText("");
                            passField2.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Istnieje już konto z takim emailem");
                        emailField.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ta nazwa użytkownika jest już zajęta");
                    nameField.setText("");
                }
            }
        });
    }

    public boolean sprawdzNazwe(){
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        con=DataBase.mycon();
        try{
            String sql = "Select * from klienci Where Name=?";
            pst = con.prepareCall(sql);
            pst.setString(1,nameField.getText());
            rs=pst.executeQuery();
            return !rs.next();
        } catch(Exception var){
            System.out.println(var);
        }
        return true;
    }

    public boolean sprawdzEmail(){
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        con=DataBase.mycon();
        try{
            String sql = "Select * from klienci Where Email=?";
            pst = con.prepareCall(sql);
            pst.setString(1,emailField.getText());
            rs=pst.executeQuery();
            return !rs.next();
        } catch(Exception var){
            System.out.println(var);
        }
        return true;
    }

}

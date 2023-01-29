package main;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame{
    private JTextField UserNtextField;
    private JPasswordField passField;
    private JPanel MainPanel;
    private JButton loginButton;



    public static void main (String[] args){
        Login login = new Login();

    }

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Login(){
        super("Logowanie");
        this.setVisible(true);
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);


        loginButton.addActionListener(e -> {
            con= DataBase.mycon();
            try {
                String sql = " SELECT * FROM klienci WHERE Name=? AND Password=? ";
                pst = con.prepareCall(sql);
                pst.setString(1, UserNtextField.getText());
                pst.setString(2, String.valueOf(passField.getPassword()));
                rs = pst.executeQuery();
                if (rs.next()) {
                    Home home = new Home();
                    home.userlabel.setText(UserNtextField.getText());
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Błędny login lub hasło");

                }
            } catch (Exception var) {
                System.out.println(var);
            }
        });

    }

}

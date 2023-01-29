package main;

import java.sql.*;


public class DataBase {
    public DataBase() {
    }

    public static Connection mycon() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Klienci", "root", "");
        } catch (SQLException | ClassNotFoundException var2) {
            System.out.println(var2);
        }

        return con;
    }

}

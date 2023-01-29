package main;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void sprawdzNazwe() {
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        con=DataBase.mycon();

        try{
            String sql = "Select * from klienci Where Name=?";
            pst = con.prepareCall(sql);
            pst.setString(1,"test1");
            rs=pst.executeQuery();
            assertTrue(rs.next());
        } catch(Exception var){
            System.out.println(var);
        }
    }

    @Test
    void sprawdzEmail() {
        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        con=DataBase.mycon();

        try{
            String sql = "Select * from klienci Where Email=?";
            pst = con.prepareCall(sql);
            pst.setString(1,"test@gmai.com");
            rs=pst.executeQuery();
            assertTrue(rs.next());
        } catch(Exception var){
            System.out.println(var);
        }
    }
}
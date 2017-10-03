package com.csse.db;


import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {

    //Get the connection
    public static Connection getConnection() throws ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }

}

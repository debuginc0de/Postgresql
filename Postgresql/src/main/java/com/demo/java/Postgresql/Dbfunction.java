package com.demo.java.Postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbfunction {
    public Connection connect_to_db(String dbName,String user,String password)
    {
        Connection conn=null;
        try {
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5435/"
                    +dbName,user,password);
            if (conn!=null){
                System.out.println("Successfully connected");
            }
            else{
                System.out.println("Error!!");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

}

package com.demo.java.Postgresql.Create;

import java.sql.Connection;
import java.sql.Statement;

public class createImpl {
    public void createTable(Connection conn, String table_name){
        Statement statement;
        try {
            String query="create table "+table_name+"(empId SERIAL, name VARCHAR(50), address VARCHAR(200),PRIMARY KEY(empId));";
            statement =conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}

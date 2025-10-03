package com.demo.java.Postgresql.Update;

import java.sql.Connection;
import java.sql.Statement;

public class updateImpl {
    public void Update_table(Connection conn, String table_name, String old_name, String new_name){
        Statement statement;
        try{
            String query=String.format("update %s set name='%s' where name='%s'",table_name,new_name,old_name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Update");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

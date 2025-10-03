package com.demo.java.Postgresql.Delete;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.Statement;

public class DeleteImpl {
    public void Delete_row_by_name(Connection conn,String table_name,String name){
        Statement statement;
        try{
            String query=String.format("Delete from %s where name='%s'",table_name,name);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Delete");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

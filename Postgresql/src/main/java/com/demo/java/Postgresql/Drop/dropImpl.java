package com.demo.java.Postgresql.Drop;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class dropImpl {
    public void delete_table(Connection con,String table_name){
        Statement statement;
        try{
            String query=String.format("Drop table %s",table_name);
            statement=con.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Delete");
        } catch (SQLException e) {
            System.out.println("success delete");
        }
    }
}

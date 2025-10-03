package com.demo.java.Postgresql.Search;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class searchImpl {
    public void searchBy_name(Connection conn, String table_name, String name){
        Statement statement;
        ResultSet rs=null;
        try{
            String query=String.format("Select * from %s where name= '%s'",table_name,name);
            statement=conn.createStatement();
            rs=statement.executeQuery(query);
            while (rs.next()){
                System.out.print(rs.getString("empId")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.println(rs.getString("address")+" ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

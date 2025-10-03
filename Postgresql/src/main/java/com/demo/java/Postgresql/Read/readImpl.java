package com.demo.java.Postgresql.Read;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class readImpl {
    public void Read_Data(Connection conn, String table_name){
        Statement statement;
        ResultSet res=null;
        try{
            String query=String.format("select * from %s",table_name);
            statement=conn.createStatement();
            res=statement.executeQuery(query);
            while (res.next()){
                System.out.print(res.getString("empId")+" ");
                System.out.print(res.getString("name")+" ");
                System.out.println(res.getString("address")+" ");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

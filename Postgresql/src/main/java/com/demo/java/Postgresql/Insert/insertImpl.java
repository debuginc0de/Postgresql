package com.demo.java.Postgresql.Insert;

import java.sql.Connection;
import java.sql.Statement;

public class insertImpl {
    public void insertROW(Connection conn, String table_name, String name, String address){
        Statement statement;

        try {
            String query=String.format("insert into %s(name,address) values('%s','%s');",table_name,name,address);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted");
        } catch (Exception e) {
            System.out.println("fail");
        }
    }
}

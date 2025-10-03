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

    //create table
    public void createTable(Connection conn,String table_name){
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

    //Insert Data into table
    public void insertROW(Connection conn,String table_name,String name,String address){
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

    //Read Data
    public void Read_Data(Connection conn,String table_name){
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

    //Update Table
    public void Update_table(){

    }
}

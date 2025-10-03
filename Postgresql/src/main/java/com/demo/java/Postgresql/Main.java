package com.demo.java.Postgresql;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Dbfunction dbf=new Dbfunction();
        Connection conn=dbf.connect_to_db("example","postgres","Rahul123@");
        //dbf.createTable(conn,"employee");
        dbf.insertROW(conn,"employee","Rahul Datta","kolkata");
        dbf.Read_Data(conn,"employee");
    }
}

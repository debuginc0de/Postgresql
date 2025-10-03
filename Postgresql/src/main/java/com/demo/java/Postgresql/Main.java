package com.demo.java.Postgresql;

import com.demo.java.Postgresql.Delete.DeleteImpl;
import com.demo.java.Postgresql.Drop.dropImpl;
import com.demo.java.Postgresql.Read.readImpl;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Dbfunction dbf=new Dbfunction();
        Connection conn=dbf.connect_to_db("example","","");
        //dbf.createTable(conn,"employee");
        //dbf.insertROW(conn,"employee","Rahul Datta","kolkata");
        //dbf.Update_table(conn,"employee","Rahul Das","Rohan Das");
        //dbf.searchBy_name(conn,"employee","Rohan");
        //dbf.Read_Data(conn,"employee");
        //DeleteImpl dl=new DeleteImpl();
        //dl.Delete_row_by_name(conn,"employee","Rohan Das");

//        dbf.Read_Data(conn,"employee");
        //dropImpl drop=new dropImpl();
        //drop.delete_table(conn,"employee");

        readImpl rl=new readImpl();

        rl.Read_Data(conn,"employee");
    }
}

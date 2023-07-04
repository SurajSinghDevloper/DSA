package JDBC;

import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        Conn c = new Conn();
        Connection con = c.con();

        // create a query for creating table
        String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400) not null)";

        try {
            // create a statement
            Statement stmt = con.createStatement();

            // execute update because we dont want any data we have to send.
            stmt.executeUpdate(q);
            System.out.println("Table Is Created Successfully...");

            // closing the connection
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

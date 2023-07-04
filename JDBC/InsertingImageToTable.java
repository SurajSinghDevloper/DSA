package JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class InsertingImageToTable {
    public static void main(String[] args) {
        Conn c = new Conn();
        Connection con = c.con();

        try {
            String q = "create table images(id int primary key auto_increment, pic blob )";

            // creating table
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created Successfully...");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

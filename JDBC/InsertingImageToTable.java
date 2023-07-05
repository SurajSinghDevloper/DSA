package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertingImageToTable {
    public static void main(String[] args) {
        Conn c = new Conn();
        Connection con = c.con();

        try {
            String q = "create table images(id int primary key auto_increment, pic LONGBLOB )";
            String q1 = "insert into images(pic) values(?)";

            // creating table
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created Successfully...");

            // Inserting pic into db
            PreparedStatement pstmt = con.prepareStatement(q1);

            FileInputStream fis = new FileInputStream("C:\\Users\\suraj\\OneDrive\\Desktop\\JAVAALGO\\JDBC\\Home.png");

            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();
            System.out.println("Pic inserted....");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

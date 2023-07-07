package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        Conn c = new Conn();
        Connection con = c.con();
        Scanner sc = new Scanner(System.in);

        // Query to update the table
        String q = "update table1 set tName=?, tCity=? where tId=?";

        // Accepting data from keyboard like name, city and id
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter Id: ");
        int Id = sc.nextInt();
        try {
            // creating prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);

            // setting the value to query
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, Id);

            // now run the query
            pstmt.executeUpdate();
            System.out.println("Data Updated Successfully...");

            // closing
            con.close();
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

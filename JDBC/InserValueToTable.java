package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InserValueToTable {
    public static void main(String[] args) {
        Conn c = new Conn();
        Connection con = c.con();
        Scanner sc = new Scanner(System.in);

        try {
            // creating dainamic query to insert value in table, and it is also known for
            // parameterized query
            String q = "insert into table1(tname,tCity) values(?,?)";

            // get the prepared statement object
            PreparedStatement stmt = con.prepareStatement(q);

            // asking for data to set in DB
            System.out.print("Enter Person Name  ");
            String name = sc.nextLine();
            System.out.print("Enter Person City  ");
            String city = sc.nextLine();

            // set the value to query
            stmt.setString(1, name);
            stmt.setString(2, city);

            // its not giving data thats why i am using executeUpdate
            stmt.executeUpdate();
            System.out.println("Data Inserted...");

            con.close();
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selects {
    public static void main(String[] args) throws SQLException {
        Conn c = new Conn();
        Connection con = c.con();

        String q = "select * from table1";

        try {
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);
                System.out.println("| Id = " + id + " |" + "  Name = " + name + " | City = " + city + " |");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
}

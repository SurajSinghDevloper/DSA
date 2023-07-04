package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    public Connection con() {
        Connection con = null;
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connection
            String url = "jdbc:mysql://localhost:3306/trial";
            con = DriverManager.getConnection(url, "root", "8988");

            // check whether the connection is made or not
            if (con.isClosed()) {
                System.out.println("Opps!!! connection is closed ");
            } else {
                System.out.println("WELCOME TO JDBC PIPELINE ");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println(con);
        return con;
    }

    public class con {
    }
}

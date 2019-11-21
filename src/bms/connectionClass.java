package bms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {

    private Connection con;

    public void connect() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("No database");
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms" + "?useSSL=false", "root", "1997");
//        if (con != null) {
//            return;
//        }
    }

    public void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

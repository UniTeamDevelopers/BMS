package bms;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class connectionClass {

    private Connection con;
    Statement stmt;

    public void connect() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("No database");
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms" + "?useSSL=false", "root", "1997");
    }

    public void insert() throws SQLException {
        System.out.println("Inserting records into the table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO customer "
                + "VALUES (100, 'Zara', 'Ali', 0123456789)";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table...");
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

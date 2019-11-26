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
            throw new Exception("Database not connected");
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms" + "?useSSL=false", "root", "");
    }

    public void insertCustomer(int id,String f_name,String l_name,int phone) throws SQLException {
        System.out.println("Inserting records into the customer table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO customer " + "VALUES ('"+id+"', '"+f_name+"','"+l_name+"','"+phone+"')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the custromer table...");
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

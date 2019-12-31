package bms;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class connectionClass {

    private Connection con;
    public Statement stmt;
    public ResultSet rs = null;

    //connection
    public void connect() throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Database not connected");
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms" + "?useSSL=false", "root", "");
    }

    //create customer record
    public void insertCustomer(int id, String f_name, String l_name, int phone) throws SQLException {
        System.out.println("Inserting records into the customer table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO customer " + "VALUES ('" + id + "', '" + f_name + "','" + l_name + "','" + phone + "')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the custromer table...");
    }

    //login data
    public String returnPass(String txtUname) throws SQLException {
        String pass = null;
        System.out.println("fetching data");
        stmt = con.createStatement();
        //String sql = "select password from user where u_name ='"+txtUname+"'";
        String sql = "select * from user";
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            pass = rs.getString("password");
        }
        return pass;
    }

    //connection close
    public void close() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
 
    //create product record
    public void insertProduct(int id, String p_name, int qty, double unit_price) throws SQLException {
        System.out.println("Inserting records into the product table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO Product " + "VALUES ('" + id + "', '" + p_name + "','" + qty + "','" + unit_price + "')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the product table...");
    }

    public void systemConnection() throws SQLException {
        stmt = con.createStatement();
        System.out.println("connection eatablished");

    }

    //update product record
    public void updateProduct(String name, int qty, double u_price, int change_key) throws SQLException {
        stmt = con.createStatement();
        String sql = "UPDATE Product set p_name = '" + name + "',qty ='" + qty + "',unit_price = '" + u_price + "' where p_id = '" + change_key + "'";
        stmt.executeUpdate(sql);
        System.out.println("Update complete");
    }

    //delete product record
    public void deleteFromProduct(String selected) throws SQLException {
        stmt = con.createStatement();
        String sql = "delete from product where p_id='" + selected + "'";
        stmt.executeUpdate(sql);
        System.out.println("record deleted successfully");
    }

    public void productSearch(int sk) throws SQLException {
        stmt = con.createStatement();
        System.out.println("Searching...");
    }

    //create supplier record
    public void insertsupplier(int id, String s_name, int telephone, String address, int acc_number) throws SQLException {
        System.out.println("Inserting records into the supplier table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO supplier " + "VALUES ('" + id + "', '" + s_name + "','" + telephone + "','" + address + "','" + acc_number + "')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the supplier table...");
    }
     //update supplier record
    public void updateSupplier(String s_name, int telephone, String address,int acc_number,int change_key) throws SQLException {
        stmt = con.createStatement();
        String sql = "UPDATE supplier set s_name = '"+s_name+"',telephone = '"+telephone+"',address = '"+address+"',acc_number = '"+acc_number+"' where s_id ='"+change_key+"' ";
        stmt.executeUpdate(sql);
        System.out.println("Update complete");
    }

    //delete Supplier record
    public void deleteFromSupplier(String selected) throws SQLException {
        stmt = con.createStatement();
        String sql = "delete from supplier where s_id='" + selected + "'";
        stmt.executeUpdate(sql);
        System.out.println("record deleted successfully");
    }
    
     //create customer record
    public void insertcustomer(int id, String F_name,String L_name, int Moblie) throws SQLException {
        System.out.println("Inserting records into the customer table...");
        stmt = con.createStatement();

        String sql = "INSERT INTO customer " + "VALUES ('" + id + "', '" + F_name + "','" + L_name + "','" + Moblie + "')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the supplier table...");
    }
    
    //update custmer record
    public void updateCustomer(String F_name, String L_name,int Moblie,int change_key) throws SQLException {
        stmt = con.createStatement();
        String sql = "UPDATE customer set F_name = '"+ F_name +"',L_name = '"+ L_name +"',mobile = '"+ Moblie +"' where c_id = '"+ change_key +"' ";
        stmt.executeUpdate(sql);
        System.out.println("Update complete");
    }
    
    //delete Customer record
    public void deleteFromCustomer(String selected) throws SQLException {
        stmt = con.createStatement();
        String sql = "delete from customer where s_id='" + selected + "'";
        stmt.executeUpdate(sql);
        System.out.println("record deleted successfully");
    }
    
     //delete product record home
  
}

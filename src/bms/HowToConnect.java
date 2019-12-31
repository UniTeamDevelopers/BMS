/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class HowToConnect {
    
    public Connection con;
    public Statement stat;
    public ResultSet res;

    public void systemConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            stat = (Statement) con.createStatement();
            //JOptionPane.showMessageDialog(null, "Connection stablished");
            System.out.println("Connection stablished");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed");
            System.out.println(ex.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bms.connectionClass;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Customer extends javax.swing.JInternalFrame {

    private DefaultTableModel model;
    private String clickValue;
    /**
     * Creates new form Customer
     */
    public Customer() throws Exception {
        initComponents();
        showCustomer();
        tblCustomer.setRowHeight(40);
        tblCustomer.setFont(new Font("Serif", Font.BOLD, 20));
    }
    
    public void showCustomer() throws Exception
    {
           connectionClass showCustomer = new connectionClass();
        showCustomer.connect();
        try {
            showCustomer.systemConnection();
            showCustomer.rs = showCustomer.stmt.executeQuery("select * from customer");
            while (showCustomer.rs.next()) {
                int id = showCustomer.rs.getInt(1);
                String fName = showCustomer.rs.getString(2);
                String lName = showCustomer.rs.getString(3);
                int tele = showCustomer.rs.getInt(4);
                System.out.println(id + " " + fName + " " + lName + " " + tele);
                Object[] content = {id, fName, lName, tele};
                model = (DefaultTableModel)tblCustomer.getModel();
                model.addRow(content);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Mobile Number"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 570, 430));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("First Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 50));
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 250, 50));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 250, 50));
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 250, 50));
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, 50));

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_32px.png"))); // NOI18N
        jButton5.setText("Add New Customer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 491, 270, 60));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_32px.png"))); // NOI18N
        jButton3.setText("Update Selected Customer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 491, 290, 60));

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_30px.png"))); // NOI18N
        jButton6.setText("Remove Selected Customer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 489, -1, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blur2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // add customer
        int Id = Integer.parseInt(txtID.getText().trim());
        String FName = txtFirstName.getText().trim();
        String LName = txtLastName.getText().trim();
        int Mobile = Integer.parseInt(txtMobile.getText().trim());

        try {
            // TODO add your handling code here:
            connectionClass management = new connectionClass();//connection object for add product
            try {
                management.connect();

            } catch (Exception e) {
                e.printStackTrace();
            }
            management.insertCustomer(Id, FName, LName, Mobile);
            management.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.setRowCount(0);
        try {
            showCustomer();
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // update customer
        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Update Customer");

        int Id = Integer.parseInt(txtID.getText().trim());
        String FName = txtFirstName.getText().trim();
        String LName = txtLastName.getText().trim();
        int Mobile = Integer.parseInt(txtMobile.getText().trim());
        try {
            connectionClass customerUpdate = new connectionClass();
            customerUpdate.connect();
            customerUpdate.updateCustomer(FName, LName, Mobile,Integer.parseInt(clickValue));
            customerUpdate.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        model.setRowCount(0);
        try {
            showCustomer();
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // delete customer
        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete Customer");

        connectionClass deleteCustomer = new connectionClass();
        try {
            deleteCustomer.connect();
            deleteCustomer.deleteFromCustomer(clickValue);
            deleteCustomer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        model.setRowCount(0);
        try {
            showCustomer();
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // Mouse clic event on customer table
        int column = 0;
        int row = tblCustomer.getSelectedRow();
        clickValue = tblCustomer.getModel().getValueAt(row, column).toString();
        connectionClass table = new connectionClass();
        try {
            table.connect();
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            table.systemConnection();
            table.rs = table.stmt.executeQuery("select c_id,F_name,L_Name,mobile from customer where c_id = '" + clickValue + "'");
            while (table.rs.next()) {
                int id = table.rs.getInt(1);
                String FName = table.rs.getString(2);
                String LName = table.rs.getString(3);                
                int Mobile = table.rs.getInt(4);
                System.out.println(id + " " + FName + " " + LName + " " + Mobile);

                txtID.setText(String.valueOf(id));
                txtFirstName.setText(String.valueOf(FName));
                txtLastName.setText(String.valueOf(LName));
                txtMobile.setText(String.valueOf(Mobile));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_tblCustomerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}

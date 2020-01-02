/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bms.HowToConnect;
import bms.connectionClass;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.X;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Product extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    public DefaultTableModel model;
    public String clickValue;

    /**
     * Creates new form Product
     */
    public Product() throws Exception {
        initComponents();
        showTable();
        tblProduct.setRowHeight(40);
        tblProduct.setFont(new Font("Serif", Font.BOLD, 20));
    }

    public void showTable() throws Exception {
        connectionClass table = new connectionClass();
        table.connect();
        try {
            table.systemConnection();
            table.rs = table.stmt.executeQuery("select * from product");
            while (table.rs.next()) {
                int id = table.rs.getInt(1);
                String pName = table.rs.getString(2);
                int qty = table.rs.getInt(3);
                Double uPrice = table.rs.getDouble(4);
                System.out.println(id + " " + pName + " " + qty + " " + uPrice);
                Object[] content = {id, pName, qty, uPrice};
                model = (DefaultTableModel) tblProduct.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Quntity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        i = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setOpaque(false);

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_32px.png"))); // NOI18N
        jButton3.setText("Update Selected Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_32px.png"))); // NOI18N
        jButton5.setText("Add New Product");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Quntity", "Price"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.setOpaque(false);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quntity");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price");

        ID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ID.setToolTipText("Product Name");
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKeyPressed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Name.setToolTipText("Product Name");
        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NameKeyPressed(evt);
            }
        });

        Quntity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Quntity.setToolTipText("Product Name");
        Quntity.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Quntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QuntityKeyPressed(evt);
            }
        });

        Price.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Price.setToolTipText("Product Name");
        Price.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PriceKeyPressed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_30px.png"))); // NOI18N
        jButton6.setText("Remove Selected Product");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        i.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        i.setForeground(new java.awt.Color(204, 0, 0));

        i1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        i1.setForeground(new java.awt.Color(204, 0, 0));

        i2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        i2.setForeground(new java.awt.Color(204, 0, 0));

        i3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        i3.setForeground(new java.awt.Color(204, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_50px_1.png"))); // NOI18N
        jLabel6.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Quntity, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(i1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Quntity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 590));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 78, 780, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blur2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //validation
        String iD = ID.getText().toString();
        String pName = Name.getText().toString();
        String pQuntity = Quntity.getText().toString();
        String pPrice = Price.getText().toString();
        if (iD.equals("")) {
            JOptionPane.showMessageDialog(null, "ID is Mandotory!");

        }
        if (pName.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is Mandotory!");

        }
        if (pQuntity.equals("")) {
            JOptionPane.showMessageDialog(null, "Quntity is Mandotory!");

        }
        if (pPrice.equals("")) {
            JOptionPane.showMessageDialog(null, "Price is Mandotory!");

        } else {
            JOptionPane.showMessageDialog(null, "Added Successfully");
        }

        // add product
        int id = Integer.parseInt(ID.getText().trim());
        String P_Name = Name.getText().trim();
        int qty = Integer.parseInt(Quntity.getText().trim());
        double unit_price = Integer.parseInt(Price.getText().trim());

        try {
            // TODO add your handling code here:
            connectionClass management = new connectionClass();//connection object for add product
            try {
                management.connect();

            } catch (Exception e) {
                e.printStackTrace();
            }
            management.insertProduct(id, P_Name, qty, unit_price);
            management.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.setRowCount(0);
        try {
            showTable();
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed
//product update
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // update product
        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Update Product");

        int id = Integer.parseInt(ID.getText().trim());
        String P_Name = Name.getText().trim();
        int qty = Integer.parseInt(Quntity.getText().trim());
        double unit_price = Double.valueOf(Price.getText().trim());
        try {
            connectionClass productUpdate = new connectionClass();
            productUpdate.connect();
            productUpdate.updateProduct(P_Name, qty, unit_price, Integer.parseInt(clickValue));
            productUpdate.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        model.setRowCount(0);
        try {
            showTable();
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // Mouse clic event on Product table
        int column = 0;
        int row = tblProduct.getSelectedRow();
        clickValue = tblProduct.getModel().getValueAt(row, column).toString();
        connectionClass table = new connectionClass();
        try {
            table.connect();
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            table.systemConnection();
            table.rs = table.stmt.executeQuery("select p_id,p_name,qty,unit_price from product where p_id = '" + clickValue + "'");
            while (table.rs.next()) {
                int id = table.rs.getInt(1);
                String pName = table.rs.getString(2);
                int qty = table.rs.getInt(3);
                Double uPrice = table.rs.getDouble(4);
                System.out.println(id + " " + pName + " " + qty + " " + uPrice);

                ID.setText(String.valueOf(id));
                Name.setText(String.valueOf(pName));
                Quntity.setText(String.valueOf(qty));
                Price.setText(String.valueOf(uPrice));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_tblProductMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // delete product
        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete Product");
        connectionClass deleteProduct = new connectionClass();
        try {
            deleteProduct.connect();
            deleteProduct.deleteFromProduct(clickValue);
            deleteProduct.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        model.setRowCount(0);
        try {
            showTable();
        } catch (Exception ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // product search to insert value table
        model.setRowCount(0);
        String sk = txtSearch.getText().trim();
        HowToConnect connect = new HowToConnect();
        String sql = "select * from product where p_name like '%" + sk + "%'";
        try {
            connect.systemConnection();
            connect.res = connect.stat.executeQuery(sql);

            while (connect.res.next()) {
                int id = connect.res.getInt(1);
                String pName = connect.res.getString(2);
                int qty = connect.res.getInt(3);
                Double uPrice = connect.res.getDouble(4);
                Object[] content = {id, pName, qty, uPrice};
                model = (DefaultTableModel) tblProduct.getModel();
                model.addRow(content);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyPressed
        // TODO add your handling code here:
        String id1 = ID.getText();
        //length of integer
        int length = id1.length();

        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 4) {
                ID.setEditable(true);
            } else {
                ID.setEditable(false);
                //error message for length
                i.setText("use maximum 4 numbers");
            }
        } else {
            ID.setEditable(false);
            //error message for data type                               
            i.setText("Please enter numbers only!");

            //to allow backspace and delete
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                ID.setEditable(true);
            } else {
                ID.setEditable(false);
            }
        }
    }//GEN-LAST:event_IDKeyPressed

    private void NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyPressed
        // TODO add your handling code here:
        String name2 = Name.getText();
        //length of integer
        int length = name2.length();

        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            if (length < 20) {
                Name.setEditable(true);
            } else {
                Name.setEditable(false);
                //erro message for length
                i1.setText("use maximum 20 letters");

                //to allow backspace and delete
                if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    Name.setEditable(true);
                } else {
                    Name.setEditable(false);
                }
            }
        } else {
            Name.setEditable(false);
            i1.setText("Please enter letters only!");
        }
    }//GEN-LAST:event_NameKeyPressed

    private void QuntityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuntityKeyPressed
        // TODO add your handling code here:
        String q1 = Quntity.getText();
        //length of integer
        int length = q1.length();

        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 11) {
                Quntity.setEditable(true);
            } else {
                Quntity.setEditable(false);
                //erro message for length
                i2.setText("use maximum 11 numbers");
            }
        } else {
            Quntity.setEditable(false);
            //error message for data type                               
            i2.setText("Please enter numbers only!");

            //to allow backspace and delete
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                Quntity.setEditable(true);
            } else {
                Quntity.setEditable(false);
            }
        }
    }//GEN-LAST:event_QuntityKeyPressed

    private void PriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quntity;
    private javax.swing.JLabel i;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

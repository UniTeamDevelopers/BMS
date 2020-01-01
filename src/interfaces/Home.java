package interfaces;

import bms.HowToConnect;
import bms.connectionClass;
import com.mysql.jdbc.Connection;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    Connection con;
    Statement stat;
//    private Double total = 0.0;
    private double sub;
    public String clickValue;
    public DefaultTableModel model;

    private String SearchText;
    private String discount="0";

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        tblProduct.setRowHeight(60);
        tblProduct.setFont(new Font("Serif", Font.BOLD, 20));

    }

    public void calValue() {
        Double total = 0.0;
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        for (int i = 0; i < tblProduct.getRowCount(); i++) {
            String numS = String.valueOf(tblProduct.getValueAt(i, 4));
            Double subVal = Double.valueOf(numS);
            total = total + subVal;
            System.out.println(numS);
        }
        System.out.println(total);      
        jLabel3.setText(String.valueOf(total));
        Double calTotBill = total-(total*Integer.parseInt(discount)/100);
        txtTotalBill.setText(String.valueOf(calTotBill));
    }

    public void showTable() throws Exception {
        connectionClass table = new connectionClass();
        table.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panespace = new javax.swing.JPanel();
        btnDiscount = new javax.swing.JButton();
        btnNewSale = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSelectCustomer = new javax.swing.JButton();
        lblSelectedCustomer = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalBill = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnQty = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPayment1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panespace.setBackground(new java.awt.Color(102, 102, 102));
        panespace.setOpaque(false);
        panespace.setPreferredSize(new java.awt.Dimension(1050, 600));

        btnDiscount.setBackground(new java.awt.Color(0, 153, 153));
        btnDiscount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDiscount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_discount_50px.png"))); // NOI18N
        btnDiscount.setText("Discount");
        btnDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscountActionPerformed(evt);
            }
        });

        btnNewSale.setBackground(new java.awt.Color(0, 153, 153));
        btnNewSale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNewSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_plus_24px.png"))); // NOI18N
        btnNewSale.setText("New Sale");
        btnNewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSaleActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_30px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_database_import_50px.png"))); // NOI18N
        jButton3.setText("Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Discount     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total      :");

        btnSelectCustomer.setBackground(new java.awt.Color(102, 102, 102));
        btnSelectCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSelectCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_checked_checkbox_26px.png"))); // NOI18N
        btnSelectCustomer.setText("Select Customer");
        btnSelectCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectCustomerActionPerformed(evt);
            }
        });

        lblSelectedCustomer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSelectedCustomer.setText("No customer Selected");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subtotal      :");

        txtTotalBill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalBill.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalBill.setText("0:00");

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lblDiscount.setText("0:00");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (5).png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_48px_1.png"))); // NOI18N
        jLabel15.setText(" Home");

        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.setOpaque(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.setOpaque(false);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "uPrice", "qty", "sub total"
            }
        ));
        jScrollPane3.setViewportView(tblProduct);

        btnQty.setBackground(new java.awt.Color(0, 153, 153));
        btnQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_decline_50px.png"))); // NOI18N
        btnQty.setText("Qty");
        btnQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtyActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(255, 255, 0));
        btnPayment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_cash_in_hand_32px.png"))); // NOI18N
        btnPayment.setText("Cash");
        btnPayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_50px_1.png"))); // NOI18N

        btnPayment1.setBackground(new java.awt.Color(255, 255, 0));
        btnPayment1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPayment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_card_payment_50px_1.png"))); // NOI18N
        btnPayment1.setText("Card");
        btnPayment1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPayment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayment1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (7).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panespaceLayout = new javax.swing.GroupLayout(panespace);
        panespace.setLayout(panespaceLayout);
        panespaceLayout.setHorizontalGroup(
            panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panespaceLayout.createSequentialGroup()
                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSelectCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblSelectedCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPayment1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panespaceLayout.setVerticalGroup(
            panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panespaceLayout.createSequentialGroup()
                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(lblDiscount))
                                .addGap(32, 32, 32)
                                .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panespaceLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtTotalBill)))
                                    .addComponent(btnPayment1)))
                            .addComponent(lblSelectedCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(panespaceLayout.createSequentialGroup()
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panespaceLayout.createSequentialGroup()
                                .addComponent(btnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDiscount)
                                .addGap(18, 18, 18)
                                .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panespaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSelectCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Discount  :");

        getContentPane().add(panespace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1280, 700));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 92, 660, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blur3.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //home stoct click open search
        new Search().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSelectCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectCustomerActionPerformed
        try {
            // TODO add your handling code here:
            new Customer().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelectCustomerActionPerformed

    private void btnNewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSaleActionPerformed
        // home new sale
        DefaultTableModel dm = (DefaultTableModel) tblProduct.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged(); // notifies the JTable that the model has changed
        
        //clear old payment
        jLabel3.setText(String.valueOf(""));
        lblDiscount.setText(String.valueOf(""));
        txtTotalBill.setText(String.valueOf(""));
    }//GEN-LAST:event_btnNewSaleActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // management button click open management form
        new Management().setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    //search list
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        int index = jList1.getSelectedIndex();
        System.out.println("Index Selected: " + index);
        String s = (String) jList1.getSelectedValue();
        System.out.println("Value Selected: " + s);

        HowToConnect connect = new HowToConnect();
        String sql = "select * from product where p_name = '" + s + "'";
        try {
            connect.systemConnection();
            connect.res = connect.stat.executeQuery(sql);
            while (connect.res.next()) {
                int id = connect.res.getInt(1);
                String pName = connect.res.getString(2);
                Double uPrice = connect.res.getDouble(4);
                Object[] content = {id, pName, uPrice};
                DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
                model.addRow(content);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jList1MouseClicked

    //search box 
    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
        String sk = txtSearch.getText().trim();
        jList1.enable(true);
        DefaultListModel dlm = new DefaultListModel();
        HowToConnect connect = new HowToConnect();
        String sql = "select p_name from product where p_name like '%" + sk + "%'";
        try {
            connect.systemConnection();
            connect.res = connect.stat.executeQuery(sql);

            while (connect.res.next()) {
                String pName = connect.res.getString(1);
                dlm.addElement(pName);
                jList1.setModel(dlm);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtyActionPerformed
        // hone qty
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        String qty = JOptionPane.showInputDialog("Enter quantity");
        int row = tblProduct.getSelectedRow();
        model.setValueAt(qty, row, 3);
        String value = tblProduct.getModel().getValueAt(row, 2).toString();
        sub = Double.valueOf(qty) * Double.valueOf(value);
        model.setValueAt(String.valueOf(sub), row, 4);
        calValue();
    }//GEN-LAST:event_btnQtyActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // home payment click
        calValue();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // home delete
        int x = JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete Product");
        int[] rows = tblProduct.getSelectedRows();
        DefaultTableModel tm = (DefaultTableModel) tblProduct.getModel();
        for (int row : rows) {
            tm.removeRow(tblProduct.convertRowIndexToModel(row));
        }
        tblProduct.clearSelection();


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscountActionPerformed
        // home discount
        discount = JOptionPane.showInputDialog("Enter discount precentage for full bill");
        lblDiscount.setText(discount+"%");
    }//GEN-LAST:event_btnDiscountActionPerformed

    private void btnPayment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayment1ActionPerformed
        // TODO add your handling code here:
        calValue();
    }//GEN-LAST:event_btnPayment1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //log out button
        new Login().setVisible(true);
        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiscount;
    private javax.swing.JButton btnNewSale;
    javax.swing.JButton btnPayment;
    javax.swing.JButton btnPayment1;
    private javax.swing.JButton btnQty;
    private javax.swing.JButton btnSelectCustomer;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblSelectedCustomer;
    private javax.swing.JPanel panespace;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTotalBill;
    // End of variables declaration//GEN-END:variables
}

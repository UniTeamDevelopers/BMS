/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JFrame;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 210, 320, 40);

        jPasswordField1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(340, 340, 320, 40);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 450, 110, 40);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 450, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\2nd year\\JAVA Projects\\bmsRE\\BMS\\src\\Images\\login6.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 400, 520);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 40, 448, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blur2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, -30, 1050, 630);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 480, 110, 40);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 480, 120, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

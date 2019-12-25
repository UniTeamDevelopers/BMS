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

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 180, 34, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\2nd year\\JAVA Projects\\BMS\\src\\Images\\login5.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 40, 448, 540);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blur2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1050, 630);

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

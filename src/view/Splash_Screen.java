/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Chamith
 */
public class Splash_Screen extends javax.swing.JFrame {

    
    public Splash_Screen() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 900, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 400, 40));

        lblLoading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(255, 255, 255));
        lblLoading.setText("Loading...");
        jPanel2.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 420, 160, -1));

        lblValue.setBackground(new java.awt.Color(255, 255, 255));
        lblValue.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblValue.setForeground(new java.awt.Color(255, 255, 255));
        lblValue.setText("0%");
        jPanel2.add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 40, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/WELCOME TO THE COMFORT ZONE.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        Splash_Screen sp = new Splash_Screen();
        sp.setVisible(true);
        User_Login_Form form = new User_Login_Form();
        
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.lblValue.setText(i +"%");
                
                if (i==10) {
                    sp.lblLoading.setText("Turning on...");     
                }
                 if (i==20) {
                    sp.lblLoading.setText("Loading...");   
                }
                 if (i==50) {
                    sp.lblLoading.setText("Connecting to Database...");   
                }
                 if (i==70) {
                    sp.lblLoading.setText("Connecting Successful..!");   
                }
                 if (i==90) {
                    sp.lblLoading.setText("Launching Application..");   
                }
                 sp.jProgressBar1.setValue(i);
                 if (i==100) {
                    sp.dispose();
                    form.setVisible(true);
                }
                 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}

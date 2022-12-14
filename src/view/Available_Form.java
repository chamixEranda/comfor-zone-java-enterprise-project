/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import controller.ManageAddBrands;
import controller.ManageView;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import controller.ManageBrands;
import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author Chamith
 */
public class Available_Form extends javax.swing.JFrame {

    /**
     * Creates new form Available_Form
     */
    public Available_Form() {
        initComponents();
        
        Border user_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        lblUserRegistration.setBorder(user_border);
        lblUserReports.setBorder(user_border);
        lblViewBrands.setBorder(user_border);
        lblAddBrands.setBorder(user_border);
        
        tblBrand.setSelectionBackground(new Color(204,204,204));
        tblBrand.setSelectionForeground(Color.black);
        tblBrand.setRowHeight(30);
        tblBrand.setShowGrid(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblUserRegistration = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblViewBrands = new javax.swing.JLabel();
        lblAddBrands = new javax.swing.JLabel();
        lblAvailables = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblUserReports = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrand = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo1.png"))); // NOI18N

        lblHome.setBackground(new java.awt.Color(204, 204, 255));
        lblHome.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 51, 51));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/red.png"))); // NOI18N
        lblHome.setText("        Home");
        lblHome.setOpaque(true);

        lblUser.setBackground(new java.awt.Color(153, 153, 255));
        lblUser.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Manage User");
        lblUser.setOpaque(true);

        lblUserRegistration.setBackground(new java.awt.Color(204, 204, 255));
        lblUserRegistration.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblUserRegistration.setText("User Registration");
        lblUserRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUserRegistration.setOpaque(true);
        lblUserRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserRegistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserRegistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserRegistrationMouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Brands");
        jLabel5.setOpaque(true);

        lblViewBrands.setBackground(new java.awt.Color(204, 204, 255));
        lblViewBrands.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblViewBrands.setText("View & Delete Brands");
        lblViewBrands.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViewBrands.setOpaque(true);
        lblViewBrands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewBrandsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblViewBrandsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblViewBrandsMouseExited(evt);
            }
        });

        lblAddBrands.setBackground(new java.awt.Color(204, 204, 255));
        lblAddBrands.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblAddBrands.setText("Add Brands");
        lblAddBrands.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddBrands.setOpaque(true);
        lblAddBrands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddBrandsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddBrandsMouseExited(evt);
            }
        });

        lblAvailables.setBackground(new java.awt.Color(255, 255, 255));
        lblAvailables.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblAvailables.setText("Availables");
        lblAvailables.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAvailables.setOpaque(true);
        lblAvailables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAvailablesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAvailablesMouseExited(evt);
            }
        });

        lblLogOut.setBackground(new java.awt.Color(153, 153, 255));
        lblLogOut.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 51, 51));
        lblLogOut.setText("Log Out");
        lblLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut.setOpaque(true);
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblUserReports.setBackground(new java.awt.Color(204, 204, 255));
        lblUserReports.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblUserReports.setText("View Users");
        lblUserReports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUserReports.setOpaque(true);
        lblUserReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserReportsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblViewBrands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddBrands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAvailables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserReports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblViewBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvailables, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnMinimize.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinimize.setText("-");
        btnMinimize.setBorderPainted(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 51, 51));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setBorderPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ok_24px.png"))); // NOI18N
        jLabel1.setText("Availables");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClose)
                        .addComponent(btnMinimize)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        tblBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand ID", "Brand Name", "Size", "Colour"
            }
        ));
        jScrollPane1.setViewportView(tblBrand);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(153, 153, 153));
        btnPrint.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblUserRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserRegistrationMouseClicked
        User_Register_Form form = new User_Register_Form();
        form.setVisible(true);
        form.pack();
        this.dispose();
    }//GEN-LAST:event_lblUserRegistrationMouseClicked

    private void lblUserRegistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserRegistrationMouseEntered
        lblUserRegistration.setBackground(Color.white);
        lblUserRegistration.setForeground(Color.black);
    }//GEN-LAST:event_lblUserRegistrationMouseEntered

    private void lblUserRegistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserRegistrationMouseExited
        lblUserRegistration.setBackground(new Color(204,204,255));
        lblUserRegistration.setForeground(Color.black);
    }//GEN-LAST:event_lblUserRegistrationMouseExited

    private void lblUserReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserReportsMouseClicked
        View_User_Form form = new View_User_Form();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblUserReportsMouseClicked

    private void lblUserReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserReportsMouseEntered
        lblUserReports.setBackground(Color.white);
        lblUserReports.setForeground(Color.black);
    }//GEN-LAST:event_lblUserReportsMouseEntered

    private void lblUserReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserReportsMouseExited
        lblUserReports.setBackground(new Color(204,204,255));
        lblUserReports.setForeground(Color.black);
    }//GEN-LAST:event_lblUserReportsMouseExited

    private void lblViewBrandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewBrandsMouseClicked
        View_Brand_Form form = new View_Brand_Form();
        form.setVisible(true);
        form.pack();
        this.dispose();
    }//GEN-LAST:event_lblViewBrandsMouseClicked

    private void lblViewBrandsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewBrandsMouseEntered
        lblViewBrands.setBackground(Color.white);
        lblViewBrands.setForeground(Color.black);
    }//GEN-LAST:event_lblViewBrandsMouseEntered

    private void lblViewBrandsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewBrandsMouseExited
        lblViewBrands.setBackground(new Color(204,204,255));
        lblViewBrands.setForeground(Color.black);
    }//GEN-LAST:event_lblViewBrandsMouseExited

    private void lblAddBrandsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddBrandsMouseEntered
        lblAddBrands.setBackground(Color.white);
        lblAddBrands.setForeground(Color.black);
    }//GEN-LAST:event_lblAddBrandsMouseEntered

    private void lblAddBrandsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddBrandsMouseExited
        lblAddBrands.setBackground(new Color(204,204,255));
        lblAddBrands.setForeground(Color.black);
    }//GEN-LAST:event_lblAddBrandsMouseExited

    private void lblAvailablesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvailablesMouseEntered
        
    }//GEN-LAST:event_lblAvailablesMouseEntered

    private void lblAvailablesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvailablesMouseExited
       
    }//GEN-LAST:event_lblAvailablesMouseExited

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        Home_Dashboard form = new Home_Dashboard();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(View_Brand_Form.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        Home_Dashboard form = new Home_Dashboard();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ManageBrands printview = new ManageBrands();
            ResultSet rs = printview.printBrand();
            
            while (rs.next()) {                
                String BrandID = String.valueOf(rs.getString("brandid"));
                String Brandname = String.valueOf(rs.getString("brandname"));
                String Size = String.valueOf(rs.getString("size"));
                 String Colour = String.valueOf(rs.getString("colour"));
                

                String tbData[] = {BrandID,Brandname,Size,Colour};
                DefaultTableModel brandtable = (DefaultTableModel)tblBrand.getModel();
                
                brandtable.addRow(tbData);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        MessageFormat header = new MessageFormat("Available Stocks");
        MessageFormat footer = new MessageFormat("................");
        
        try {
            tblBrand.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Available_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddBrands;
    private javax.swing.JLabel lblAvailables;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserRegistration;
    private javax.swing.JLabel lblUserReports;
    private javax.swing.JLabel lblViewBrands;
    private javax.swing.JTable tblBrand;
    // End of variables declaration//GEN-END:variables
}

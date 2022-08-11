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
import model.ViewBrands;
import controller.ManageBrands;
import model.DB_Connection;
import java.util.Vector;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamith
 */
public class View_Brand_Form extends javax.swing.JFrame {

    
    public View_Brand_Form() {
        initComponents();
        
        Border user_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);
        jLabel_Register.setBorder(user_border);
        jLabel_Report.setBorder(user_border);
        jLabel_View.setBorder(user_border);
        jLabel_Add1.setBorder(user_border);
        jLabel_Available.setBorder(user_border);
        
        
        tblBrands.setSelectionBackground(new Color(204,204,204));
        tblBrands.setSelectionForeground(Color.black);
        tblBrands.setRowHeight(30);
        tblBrands.setShowGrid(true);
        
//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
//        tblBrands.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.RIGHT );
        tblBrands.setDefaultRenderer(String.class, centerRenderer);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Home = new javax.swing.JLabel();
        jLabel_User = new javax.swing.JLabel();
        jLabel_Register = new javax.swing.JLabel();
        jLabel_Report = new javax.swing.JLabel();
        jLabel_User1 = new javax.swing.JLabel();
        jLabel_View = new javax.swing.JLabel();
        jLabel_Available = new javax.swing.JLabel();
        jLabel_Logout = new javax.swing.JLabel();
        jLabel_Add1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBrandID = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBrands = new javax.swing.JTable();
        btnClear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logo1.png"))); // NOI18N

        jLabel_Home.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_Home.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/red.png"))); // NOI18N
        jLabel_Home.setText("       Home");
        jLabel_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseClicked(evt);
            }
        });

        jLabel_User.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_User.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel_User.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_User.setText("Manage User");
        jLabel_User.setOpaque(true);

        jLabel_Register.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Register.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel_Register.setText("User Registration");
        jLabel_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Register.setOpaque(true);
        jLabel_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_RegisterMouseExited(evt);
            }
        });

        jLabel_Report.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Report.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel_Report.setText("View Users");
        jLabel_Report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Report.setOpaque(true);
        jLabel_Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ReportMouseExited(evt);
            }
        });

        jLabel_User1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_User1.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel_User1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_User1.setText("Manage Brands");
        jLabel_User1.setOpaque(true);

        jLabel_View.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_View.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel_View.setText("View & Delete Brands");
        jLabel_View.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_View.setOpaque(true);
        jLabel_View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ViewMouseExited(evt);
            }
        });

        jLabel_Available.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Available.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel_Available.setText("Availables");
        jLabel_Available.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Available.setOpaque(true);
        jLabel_Available.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AvailableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AvailableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AvailableMouseExited(evt);
            }
        });

        jLabel_Logout.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_Logout.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel_Logout.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Logout.setText("Log Out");
        jLabel_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Logout.setOpaque(true);
        jLabel_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LogoutMouseClicked(evt);
            }
        });

        jLabel_Add1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Add1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel_Add1.setText("Add Brands");
        jLabel_Add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Add1.setOpaque(true);
        jLabel_Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Add1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_User1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_View, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Available, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Add1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_User, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Report, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_User1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_View, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Available, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

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

        btnMinimize.setBackground(new java.awt.Color(204, 204, 204));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMinimize.setText("-");
        btnMinimize.setBorderPainted(false);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/view_24px.png"))); // NOI18N
        jLabel4.setText("View Brands");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClose)
                        .addComponent(btnMinimize))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Brand ID         :");

        txtBrandID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandIDActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(153, 153, 255));
        btnView.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnView.setText("VIEW");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 255));
        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblBrands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand ID", "Brand Name", "Size", "Colour", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblBrands);

        btnClear1.setBackground(new java.awt.Color(153, 153, 153));
        btnClear1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClear1.setText("CLEAR");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBrandID, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrandID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void jLabel_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RegisterMouseEntered
        jLabel_Register.setBackground(Color.white);
        jLabel_Register.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_RegisterMouseEntered

    private void jLabel_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RegisterMouseExited
        jLabel_Register.setBackground(new Color(204,204,255));
        jLabel_Register.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_RegisterMouseExited

    private void jLabel_ReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReportMouseEntered
         jLabel_Report.setBackground(Color.white);
         jLabel_Report.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_ReportMouseEntered

    private void jLabel_ReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReportMouseExited
        jLabel_Report.setBackground(new Color(204,204,255));
        jLabel_Report.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_ReportMouseExited

    private void jLabel_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ViewMouseEntered
        
    }//GEN-LAST:event_jLabel_ViewMouseEntered

    private void jLabel_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ViewMouseExited
       
    }//GEN-LAST:event_jLabel_ViewMouseExited

    private void jLabel_AvailableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AvailableMouseEntered
        jLabel_Available.setBackground(Color.white);
        jLabel_Available.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_AvailableMouseEntered

    private void jLabel_AvailableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AvailableMouseExited
        jLabel_Available.setBackground(new Color(204,204,255));
        jLabel_Available.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_AvailableMouseExited

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

            Home_Dashboard form = new Home_Dashboard();
            form.setVisible(true);
            dispose();
      
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setExtendedState(View_Brand_Form.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void jLabel_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseClicked
        Home_Dashboard form = new Home_Dashboard();
        form.setVisible(true);
        form.pack();
        this.dispose();
    }//GEN-LAST:event_jLabel_HomeMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
         if (txtBrandID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Brand ID");
        }
        try {
            ManageBrands manage = new ManageBrands();
            ResultSet rs = manage.seeBrands(txtBrandID.getText());
            while (rs.next()) {                
                String BrandID = String.valueOf(rs.getString("brandid"));
                String Brandndame = String.valueOf(rs.getString("brandname"));
                String Size = String.valueOf(rs.getString("size"));
                String Colour = String.valueOf(rs.getString("colour"));
                String Price = String.valueOf(rs.getString("price"));
                
                String tbData[] = {BrandID,Brandndame,Size,Colour,Price};
                DefaultTableModel brandtable = (DefaultTableModel)tblBrands.getModel();
                
                brandtable.addRow(tbData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
       
    }//GEN-LAST:event_btnViewActionPerformed

    private void jLabel_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RegisterMouseClicked
        User_Register_Form form = new User_Register_Form();
        form.setVisible(true);
        form.pack();
        this.dispose();
    }//GEN-LAST:event_jLabel_RegisterMouseClicked

    private void txtBrandIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandIDActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtBrandID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Brand ID");
        }
          
           ManageBrands deleteBrands = new ManageBrands();
            try{
                deleteBrands.deleteBrands(txtBrandID.getText());
                DefaultTableModel brandtable = (DefaultTableModel)tblBrands.getModel();
                brandtable.setRowCount(0);
            }
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
            }
        
  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jLabel_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LogoutMouseClicked
        int opt = JOptionPane.showConfirmDialog(null, "Do you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            User_Login_Form form = new User_Login_Form();
            form.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel_LogoutMouseClicked

    private void jLabel_AvailableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AvailableMouseClicked
       Available_Form form = new Available_Form();
       form.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel_AvailableMouseClicked

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        txtBrandID.setText("");
        DefaultTableModel brandtable = (DefaultTableModel)tblBrands.getModel();
        brandtable.setRowCount(0);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void jLabel_ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReportMouseClicked
        View_User_Form form = new View_User_Form();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_ReportMouseClicked

    private void jLabel_Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Add1MouseClicked
        Add_Brand_Form form = new Add_Brand_Form();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_Add1MouseClicked

    private void jLabel_Add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Add1MouseEntered
       jLabel_Add1.setBackground(Color.white);
        jLabel_Add1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_Add1MouseEntered

    private void jLabel_Add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Add1MouseExited
        jLabel_Add1.setBackground(new Color(204,204,255));
        jLabel_Add1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_Add1MouseExited

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
            java.util.logging.Logger.getLogger(View_Brand_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Brand_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Brand_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Brand_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Brand_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Add1;
    private javax.swing.JLabel jLabel_Available;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Logout;
    private javax.swing.JLabel jLabel_Register;
    private javax.swing.JLabel jLabel_Report;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JLabel jLabel_User1;
    private javax.swing.JLabel jLabel_View;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBrands;
    private javax.swing.JTextField txtBrandID;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.DB_Connection;
import model.ViewBrands;
/**
 *
 * @author Chamith
 */
public class ManageBrands {
//    ViewBrands view;

    public ManageBrands() {
//        this.view = view;
    }
    
    public ResultSet seeBrands(String id){
        ResultSet rs = null;
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "SELECT * FROM `brands` WHERE brandid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            
            
            rs = st.executeQuery();
        } catch (Exception e) {
             System.out.println("Error "+e.getMessage());
        }
        return rs;
    }
    
    public void deleteBrands(String ID){
       
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "DELETE  FROM `brands` WHERE brandid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, ID);
            
            int result = st.executeUpdate();
            if(result > 0){
                JOptionPane.showMessageDialog(null, "Brand hass been delete successfully","Delete Brands",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    public ResultSet printBrand(){
        ResultSet rs = null;
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "SELECT * FROM `brands`";
            PreparedStatement st = con.prepareStatement(sql);
            rs = st.executeQuery();
        } catch (Exception e) {
             System.out.println("Error "+e.getMessage());
        }
        return rs;
    }
    
}

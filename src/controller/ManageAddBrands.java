/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.DB_Connection;
import model.ViewBrands;
import java.sql.*;
/**
 *
 * @author Chamith
 */
public class ManageAddBrands {
    ViewBrands brandview;
    
    public ManageAddBrands(ViewBrands brandview){
        this.brandview = brandview;
    }
    
    
    public int addBrand(){
        int i = 0;
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "INSERT INTO `brands`(`brandid`, `brandname`, `size`, `colour`, `price`) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, brandview.BrandID);
            st.setString(2, brandview.Brandname);
            st.setString(3, brandview.Size);
            st.setString(4, brandview.Colour);
            st.setString(5, brandview.Price);
            i = st.executeUpdate(); 
        } catch (Exception e) {
        }
        return i;
    }
    
    
}

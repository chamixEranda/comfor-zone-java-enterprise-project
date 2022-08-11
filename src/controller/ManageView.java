/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import javax.swing.JOptionPane;
import model.DB_Connection;
import model.UserRegister;
/**
 *
 * @author Chamith
 */
public class ManageView {
    
    public ResultSet viewUsers(){
        ResultSet rs = null;
        try {
            Connection con = DB_Connection.createConnection();
            
            String sql = "SELECT * FROM `comfort_users`";
            PreparedStatement st = con.prepareStatement(sql);
            rs = st.executeQuery();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return rs;
    }
}

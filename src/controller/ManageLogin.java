/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DB_Connection;
import model.UserLogin;
import java.sql.*;

/**
 *
 * @author Chamith
 */
public class ManageLogin {
    UserLogin user;
    
//    public ManageLogin(){}
    
    public ManageLogin(UserLogin user){
        this.user = user;
    }
    
     public int Loginuser() {
        ResultSet rs;
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "SELECT * FROM `comfort_users` WHERE `username`=? AND `password`=? ";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user.Uname);
            st.setString(2, user.password); 
            
            rs = st.executeQuery();
            
            if (rs.next()) {
                   return 1;
            }
            
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return 0;
    }
}


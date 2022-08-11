/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.DB_Connection;
import model.UserRegister;

/**
 *
 * @author Chamith
 */
public class ManageUser {
    UserRegister user;
    
    public ManageUser(){}
    
    public ManageUser(UserRegister user){
        this.user = user;
    }
    
    public void saveUser(){
        try {
            Connection con = DB_Connection.createConnection();
            String sql = "INSERT INTO `comfort_users`( `username`,`email`, `password`, `contact`) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, user.Uname);
            st.setString(2, user.email);
            st.setString(3, user.passowrd);
            st.setString(4, user.contact);
            
            
            
            int result = st.executeUpdate();
            if (result > 0 ) {
                JOptionPane.showMessageDialog(null,"User has been registered","User Management",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          
       
    }
     
}

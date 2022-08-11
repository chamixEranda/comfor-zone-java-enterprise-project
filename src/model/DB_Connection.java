/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
/**
 *
 * @author Chamith
 */
public class DB_Connection {
    public static Connection createConnection() throws Exception{
        String url = "jdbc:mysql://localhost/comfort_zone_db";
        Connection con = DriverManager.getConnection(url,"root","");
        return con;
    }
}

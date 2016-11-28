/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rana.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author J2EE-27
 */
public class DataBaseUtil {
    
    private Connection con;
    private String user="root";
    private String password="1234";
    private String url="jdbc:mysql://localhost:3306/ticket";

    public DataBaseUtil() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        
    }
    
    public Connection getCon() throws SQLException{
    
        con= DriverManager.getConnection(url,user,password);
        return con;
    }
}

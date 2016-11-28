/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rana.Impl;

import Rana.Dao.Dao;
import Rana.Model.BuyTicketModel;
import Rana.util.DataBaseUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rana
 */
public class BuyTicketImpl implements Dao<BuyTicketModel>{
    
    DataBaseUtil database;
    
     public BuyTicketImpl(){
        try {
            database = new DataBaseUtil();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyTicketImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    

    @Override
    public void save(BuyTicketModel value) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String sql = "insert into buyticket values(?,?,?,?,?,?,?,?,?,?,?,?) ";
       
        try {
            PreparedStatement pstm = database.getCon().prepareStatement(sql);
            pstm.setString(1, value.getSlno());
            pstm.setString(2, value.getCustomername());
            pstm.setString(10,value.getContact());
            pstm.setString(3, value.getDestination());
            pstm.setString(4, value.getTime());
            pstm.setString(5, value.getFare());
            pstm.setString(6, value.getComment());
            pstm.setString(7, value.getDate());
            pstm.setString(8, value.getPayment());
            pstm.setString(9, value.getSeat());
            pstm.setString(11, value.getType());
            pstm.setString(12, value.getBusname());
            
            
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BuyTicketImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(BuyTicketModel value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    @Override
    public void delete(BuyTicketModel value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BuyTicketModel find(BuyTicketModel vlaue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BuyTicketModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

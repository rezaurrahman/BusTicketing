/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rana.Impl;

import Rana.Model.SeatModel;
import Rana.Dao.Dao;
import Rana.util.DataBaseUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author J2EE-27
 */
public class SeatImpl implements Dao<SeatModel>{
    DataBaseUtil dataBase;
    public SeatImpl(){
        try {
            dataBase = new DataBaseUtil();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyTicketImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void save(SeatModel value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into seat values(?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement pstm = dataBase.getCon().prepareStatement(sql);
            
            pstm.setInt(1, value.getSlno());
            pstm.setString(2, value.getDate());
            pstm.setString(3, value.getSeat());
            pstm.setString(4, value.getBusname());
            pstm.setString(7, value.getDestination());
            pstm.setString(5, value.getType());
            pstm.setDouble(8, value.getFare());
            pstm.setString(6, value.getTime());
            
            
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SeatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(SeatModel value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void delete(SeatModel value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SeatModel find(SeatModel vlaue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SeatModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void e1seatno(){
     String sql = "Select  seat from econo1 where max(Slno)";
     
        try {
            PreparedStatement pstm = dataBase.getCon().prepareStatement(sql);
           // pstm.setString(3, );
            
        } catch (SQLException ex) {
            Logger.getLogger(SeatImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}

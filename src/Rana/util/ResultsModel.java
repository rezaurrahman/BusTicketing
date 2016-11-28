package Rana.util;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rana
 */
public class ResultsModel extends  AbstractTableModel{
    
    private String[] columnNames = new String[0];
    private Vector<String[]> dataRows = new Vector<String[]>();
    String[] maxColumnCell = null; 
    
    public void setResultSet(ResultSet results){
    
    if(results == null){
    columnNames = new String[0];
    dataRows.clear();
        fireTableChanged(null);
        return;
    
    }
        try {
            ResultSetMetaData metadata = results.getMetaData();
            int columns = metadata.getColumnCount();
            columnNames = new String[columns];
            // get the column names
            for(int i=0; i<columns; i++){
                columnNames[i] = metadata.getColumnLabel(i+1);
                if(columnNames[i] !=null){
                columnNames[i].trim();
                }
            }
            
            dataRows.clear();
            String[] rowData = null;
            while(results.next()){
                rowData= new String[columns];
                for(int i=0; i<columns; i++){
                rowData[i] = results.getString(i+1);
                if(rowData[i] != null){
                rowData[i].trim();
                
                }
                
                }
                dataRows.addElement(rowData);
          
            }
            fireTableChanged(null);
            
        } catch (SQLException sqle) {
            //Logger.getLogger(ResultsModel.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(sqle);
        }
    
    
    
    }

    @Override
    public int getRowCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(dataRows == null){
       return 0;
       }else{
       return dataRows.size();
       }
    }

    @Override
    public int getColumnCount() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return dataRows.elementAt(row)[column];
       
    }
    
    public String getColumnName(int column){
    return columnNames[column] == null? "No name": columnNames[column];
    }
    
    public Class getColumnClass(int columnIndex){
    return String.class;
    
    } 
    
    
}

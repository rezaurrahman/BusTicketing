/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rana.Dao;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author J2EE-27
 */
public interface Dao<T> {
    public void save(T value);
    public void update(T value);
    public void delete(T value);
    public T find (T vlaue);
    public List<T> getAll();
    public ResultSet display();
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employesdashboard.dao;

import employesdashboard.model.Employee;
import employesdashboard.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployeeDao {
    
    
    PreparedStatement ps;
    DbUtil util = new DbUtil();
    ResultSet rs;
    String sql ="";
    
    public void saveData(Employee e){
        sql = "insert int employee (name, salary) values(?,?)";
        
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            
            ps.executeUpdate();
            ps.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
            
    
}

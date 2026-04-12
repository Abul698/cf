/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abul
 */
public class CrudJava {

    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static void main(String[] args) {
//        save("Abul", "abul@gmail.com");

      findAll();
//      save("Sheikh Shaheb", "sheikh@gmail.com");
//      save("Sheikh ", "sh@gmail.com");
//      save("Shaheb", "shaheb@gmail.com");

        update("Badrul", "badrul@gmail.com", 4);

        delete(4);
    }

    public static Connection getCon() {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/jeestore";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;

    }

    public static void save(String name, String email){
        sql="insert into student (name,email) values(?,?)";
        
        try {
            ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("student saved");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void findAll(){
    sql="select * from student";
        try {
            ps=getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("id="+rs.getInt("id")+"  Name: "+rs.getString("name")+"  Email: "+rs.getString("email"));      
            }
            rs.close();
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
    public static void update(String name, String email,int id){
    
        sql="update student set name=?,email=? where id =?";
        try {
            ps=getCon().prepareStatement(sql);
             ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("student updated");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            System.out.println("student not updated");
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void delete(int id){
    sql="delete from student where id =?";
        try {
            ps=getCon().prepareStatement(sql);
            ps.setInt(1, id);
             ps.executeUpdate();
            System.out.println("student deleted");
            ps.close();
            getCon().close();
            findAll();
          
        } catch (SQLException ex) {
            Logger.getLogger(CrudJava.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("student not deleted");
        }
    }
    
    
}



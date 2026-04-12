package crudvaja;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudVaja {

    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static void main(String[] args) {
        //save("Abul Hasan", "hasan@gmail.com", 1234.34);
        //save("Mahbub", "mahbub@gmail.com", 2400.5);
        update("Mahbubur Rahman", "mahbub.a@gmail.com", 1234.43, 2);
        delete(3);
        

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
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void save(String name, String email, double salary) {
        sql = "insert into employee (name,email,salary) values(?,?,?)";

        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("employee saved");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void findAll() {
        sql = "select * from employee";
        try {
            ps = getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id") + "  Name : " + rs.getString("name") + "  Email : " + rs.getString("email") + "  Salary : " + rs.getDouble("salary"));
            }
            rs.close();
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(String name, String email, double salary, int id) {
        sql = "update employee set name=?,email=?,salary=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);
            ps.setInt(4, id);
            ps.executeUpdate();
            System.out.println("employee updated");
            System.out.println("-----------------------------------------------------------");
            ps.close();
            getCon().close();
            findAll();

        } catch (SQLException ex) {
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("employee not updated");
            
        }
    }
    public static void delete(int id){
        sql="delete from employee where id=?";
        try {
            ps = getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("employee deleted");
            System.out.println("-----------------------------------------------------------");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CrudVaja.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("employee Not deleted");
        }
    
    }

}

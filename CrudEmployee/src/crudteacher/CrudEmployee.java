
package crudteacher;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudEmployee {

    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void main(String[] args) {
       save("Abul Hasan", "2020-10-25", 50000,"Managger");
       save("Mahbub", "2021-10-25", 60000,"Sales");
       
       findAll();
       
        delete(1);
        findAll();
        
        System.out.println("After Delet");
        
        update(1,"Abul Hasan", "2020-10-25", 50000,"Managger");
        findAll();
        
        System.out.println("After Update");
//        save("Mahbub", "mahbub@gmail.com",30000,"Supervisor" );
        
    }
    
  public static Connection getCon(){
      Connection con=null;
        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "1234";
        
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
  
  }
  
   public static void save(String name, String joining_date ,double salary,String designation){
        sql="insert into employee(name,joining_date, salary,designation) values(?,?,?,?)";
       
        try {
            ps = getCon().prepareStatement(sql);
             ps.setString(1, name);
            ps.setDate(2, Date.valueOf(joining_date));
            ps.setDouble(3, salary);
            ps.setString(4, designation);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
   
   public static void findAll() {
        sql = "select * from employee";
        
        try {
            ps =getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                System.out.println("ID : " + rs.getInt("id")+ "  Name : " + rs.getString("name") + "  Joining Date : " + rs.getString("joining_date") + "  Salary : " + rs.getDouble("salary")+ "  Designation : " + rs.getString("designation")) ;
                
            }
                rs.close();
                 ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

public static void update(int id, String name, String joining_date, double salary, String designation) {

    String sql = "UPDATE Employee SET name=?, joinDate=?, salary=?, designation=? WHERE id=?";

    try {
        PreparedStatement ps = getCon().prepareStatement(sql);

        ps.setString(1, name);
        ps.setDate(2, Date.valueOf(joining_date)); // format: yyyy-MM-dd
        ps.setDouble(3, salary);
        ps.setString(4, designation);
        ps.setInt(5, id);

        ps.executeUpdate();

        System.out.println("Employee updated successfully!");
        System.out.println("***********************************");

        ps.close();
        getCon().close();

        findAll(); // show updated list

    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Employee not updated");
    }
}
        
     
     public static void delete(int id){
        sql="delete from employee where id=?";  
        
        try {
            ps = getCon().prepareStatement(sql);
        ps.setInt(1, id);
         ps.executeUpdate();
             ps.executeUpdate();
            System.out.println("employee deleted");
            System.out.println("***************************************************");
            ps.close();
            getCon().close();
            findAll();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

}
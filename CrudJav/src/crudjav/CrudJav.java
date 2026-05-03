
package crudjav;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrudJav {
  public static PreparedStatement ps;
  public static ResultSet rs;
    private static String createSql;
  
   
            
    public static void main(String[] args) {
       
        createemployee("Abul", "abul@gmail.com", 100000);
        createemployee("Pk", "pk@gmail.com", 90000);
        
    }
    public static Connection getConnection() {
        
    
    String url="jdbc:mysql://localhost:3306/mysql";
    String user="root";
    String password="1234";
    Connection connection=null;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudJav.class.getName()).log(Level.SEVERE, null, ex);
        }
   return connection;
}

    public static void createemployee(String Name, String email, double salary) {
        
      String  creatSql = "insert into employee (name,email,salary)values(?,?,?)";
      try {
          ps = getConnection().prepareStatement(createSql);
          ps.setString(1, name);
          ps.setString(2, email);
          ps.setString(3, salary);
         int status =ps.executeUpdate();
          ps.close();
          
          
      } catch (SQLException ex) {
          Logger.getLogger(CrudJav.class.getName()).log(Level.SEVERE, null, ex);
      }
        
      }
    
    public static void showAllStudent() {
        String AllStudent ="select*from employee";
      try {
          ps = getConnection().prepareStatement(AllStudent);
          rs =ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " "
                        + rs.getString("email") + " " + rs.getFloat("salary"));

            }
            ps.close();

          
      } catch (SQLException ex) {
          Logger.getLogger(CrudJav.class.getName()).log(Level.SEVERE, null, ex);
      }
         
    }
    
     public static void deleteEmployee(int id) {
         String delete = "delete from employee where id=?";

      try {
          ps =getConnection().prepareStatement(delete) ;
          
            ps.setInt(1, id);
            int status = ps.executeUpdate();
            ps.close();
      } catch (SQLException ex) {
          Logger.getLogger(CrudJav.class.getName()).log(Level.SEVERE, null, ex);
      }

     }
   
     public static void updateStudent(String name, String email, double salary, int id) {
        String update = "update student set name=?,email=?,fee=? where id=?";
      try {
          ps =getConnection().prepareStatement(update);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);
            ps.setInt(4, id);

            int status2 = ps.executeUpdate();
            ps.close();
          
      } catch (SQLException ex) {
          Logger.getLogger(CrudJav.class.getName()).log(Level.SEVERE, null, ex);
      }
     
     }  
}
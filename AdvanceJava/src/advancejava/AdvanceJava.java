package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceJava {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        //creatstudent("emon", "emon1@gmail.com", 3000);
        showAllStudent();
        deleteStudent(1);
        showAllStudent();

        updateStudent("Abul", "abul@gmail.com", 50000, 2);
        showAllStudent();
    }

    public static Connection getconnection() {

        String url = "jdbc:mysql://localhost:3306/practice?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1234";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static void creatstudent(String name, String email, float fee) {
        String creatSql = "insert into student(name,email,fee)values(?,?,?)";

        try {
            ps = getconnection().prepareStatement(creatSql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);

            int status = ps.executeUpdate();
            ps.close();

            if (status > 0) {
                System.out.println("Save");
            } else {
                System.err.println("Not save");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudent() {
        String AllStudent = "select*from student";

        try {
            ps = getconnection().prepareStatement(AllStudent);

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " "
                        + rs.getString("email") + " " + rs.getFloat("fee"));

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteStudent(int id) {
        String delete = "delete from student where id=?";

        try {
            ps = getconnection().prepareStatement(delete);

            ps.setInt(1, id);
            int ststus1 = ps.executeUpdate();
            ps.close();

            if (ststus1 > 0) {
                System.out.println("delete");
            } else {
                System.err.println("Not delete");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStudent(String name, String email, float fee, int id) {
        String update = "update student set name=?,email=?,fee=? where id=?";

        try {
            ps = getconnection().prepareStatement(update);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.setInt(4, id);

            int status2 = ps.executeUpdate();
            ps.close();

            if (status2 > 0) {
                System.out.println("update");
            } else {
                System.err.println("Not update");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

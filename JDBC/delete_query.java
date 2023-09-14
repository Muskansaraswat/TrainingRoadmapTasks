


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author muskansaraswat
 */
public class delete_example {
  public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/muskansaraswat";
        String username = "muskansaraswat";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement ps = connection.prepareStatement("delete from employee where emp_id=?");
            ps.setInt(1,12);
            if(ps.executeUpdate()>0){
                System.out.println("Record Deleted Successfully");
            }
            connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }  
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author muskansaraswat
 */
public class update_example {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/muskansaraswat";
        String username = "muskansaraswat";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement ps = connection.prepareStatement("UPDATE employee SET emp_name=? where emp_id=?");
            ps.setString(1,"Elon musk");
            ps.setInt(2,11);
            if(ps.executeUpdate()>0){
                System.out.println("Record Updated Successfully");
            }
            connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }  
}


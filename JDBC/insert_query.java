/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author muskansaraswat
 */
public class insert_example2 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/muskansaraswat";
        String username = "muskansaraswat";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement st=connection.createStatement();
            if(st.executeUpdate("insert into employee values (12,'Barney Stephen','Boston',28)")>0){
                System.out.println("Record Inserted");
            }
            connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author muskansaraswat
 */
public class insert_example {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/muskansaraswat";
        String username = "muskansaraswat";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values (?,?,?,?)");
            preparedStatement.setInt(1,11);
            preparedStatement.setString(2, "JAMES BOND");
            preparedStatement.setString(3, "New York City");
            preparedStatement.setInt(4,29);
           
            if(preparedStatement.executeUpdate()>0) {
                System.out.println("RecordInsertedSuccessfully");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


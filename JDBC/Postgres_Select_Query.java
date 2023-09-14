/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muskansaraswat
 */
import java.sql.*;

public class PostgresExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/muskansaraswat";
        String username = "muskansaraswat";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE city = ?");
            preparedStatement.setString(1, "New York");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("email  "));
            }
            
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



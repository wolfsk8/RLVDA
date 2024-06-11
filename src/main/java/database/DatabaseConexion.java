/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author juan
 */
public class DatabaseConexion {
    
    
       
    public static Connection getConnection() throws SQLException {
        
        // Registrar el driver JDBC
        try {
            Class.forName("org.postgresql.Driver"); // Reemplaza con el driver correspondiente a tu base de datos
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("No suitable driver found");
        }
        String URL ="jdbc:postgresql://192.168.0.106:5432/rlvd";
        String USER="admin";
        String PASSWORD="admin";
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

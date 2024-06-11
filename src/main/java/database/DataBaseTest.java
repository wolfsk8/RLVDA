/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import Consultas.Consultas_listado;
import Objetos.obj_cargo;
import Objetos.obj_producto;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseTest {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConexion.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM CARGO")) {

            while (resultSet.next()) {
                // Obtener los valores de las columnas de la fila actual
                System.out.println("Valor de la columna 1: " + resultSet.getString(1));
                System.out.println("Valor de la columna 2: " + resultSet.getString(2));
                // Agrega más líneas para obtener los valores de otras columnas según tu necesidad
            }
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<obj_cargo> list_cargo = new ArrayList<>();
            list_cargo = Consultas_listado.listarCargos(0, 0, "SECRETARIA", " ", 0);
            System.out.println("Usando un bucle foreach:");
        for (obj_cargo cargo : list_cargo) {
        System.out.println(cargo.getCargo()+", "+cargo.getDescripcion());
        }
        List<obj_producto> list_producto = new ArrayList<>();
            BigDecimal aud_fecha =new BigDecimal("20240610000000");
            list_producto = Consultas_listado.GestionProductos(0, 0, " ", 0, 0, aud_fecha, 0);
            System.out.println("lista de proudctos:");
        for (obj_producto producto : list_producto) {
        System.out.println(producto.getDescripcion_producto()+", "+producto.getPrecio());
        }
    }
}
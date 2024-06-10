/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import database.DatabaseConexion;
import Objetos.obj_cargo;
import Objetos.obj_producto;
import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas_listado {
    
    public static List<obj_cargo> listarCargos(int condicion,int id_cargo, String cargo, String descripcion, long fecha_aud) {
        List<obj_cargo> list_cargo = new ArrayList<>();
        try (Connection conn = DatabaseConexion.getConnection();
             CallableStatement stmt = conn.prepareCall("{ CALL F_LISTA_CARGO(?, ?, ?, ?, ?) }")) {
            // Establece los valores de los parámetros de entrada
                stmt.setInt(1, condicion);
                stmt.setInt(2, id_cargo);
                stmt.setString(3, cargo);
                stmt.setString(4, descripcion);
                stmt.setLong(5, fecha_aud);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj_cargo obj_consulta = new obj_cargo();
                obj_consulta.setId_cargo(rs.getInt("ID_CARGO"));
                obj_consulta.setCargo(rs.getString("CARGO"));
                obj_consulta.setDescripcion(rs.getString("DESCRIPCION"));
                list_cargo.add(obj_consulta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_cargo;
    }
    public static List<obj_producto> GestionProductos(int condicion,int id_producto, String descripcion_producto, int stock, double precio, BigDecimal aud_fecha, int tipo_producto) {
        List<obj_producto> list_producto = new ArrayList<>();
        try (Connection conn = DatabaseConexion.getConnection();
             CallableStatement stmt = conn.prepareCall("{ CALL F_GESTION_PRODUCTOS(?, ?, ?, ?, ?, ?, ?) }")) {
            // Establece los valores de los parámetros de entrada
                stmt.setInt(1, condicion);
                stmt.setInt(2, id_producto);
                stmt.setString(3, descripcion_producto);
                stmt.setInt(4, stock);
                stmt.setDouble(5, precio);
                stmt.setInt(6, tipo_producto);
                stmt.setBigDecimal(7, aud_fecha);
                              

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj_producto obj_consulta = new obj_producto();
                obj_consulta.setId_producto(rs.getInt("OUT_ID_PRODUCCION"));
                obj_consulta.setDescripcion_producto(rs.getString("OUT_DESCIPCION"));
                obj_consulta.setStock(rs.getInt("OUT_STOCK"));
                obj_consulta.setPrecio(rs.getDouble("OUT_PRECIO"));
                obj_consulta.setAud_fecha(rs.getBigDecimal("OUT_AUD_FECHA"));
                obj_consulta.setId_tipo_producto(rs.getInt("OUT_TIPO_PRODUCTO"));
                list_producto.add(obj_consulta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_producto;
    }
}

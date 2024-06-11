/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package net.tinajero.servlets;

import com.google.gson.Gson;
import Consultas.Consultas_listado;
import Objetos.obj_producto;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author juan
 */
public class ListarProductos extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //configuración de la respuesta
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        // Obtener la lista de productos desde la consulta
        List<obj_producto> list_producto = new ArrayList<>();
        list_producto = Consultas_listado.GestionProductos(0, 0, " ", 0, 0, BigDecimal.ZERO, 0);
        //convertir la lista de prductos a JSON
        Gson gson = new Gson();
        String json = gson.toJson(list_producto);
        
         // Escribir la respuesta JSON en el cuerpo de la respuesta
        try (PrintWriter out = response.getWriter()) {
            out.print(json);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();  // Imprimir cualquier excepción que ocurra
        }
        
    }

}

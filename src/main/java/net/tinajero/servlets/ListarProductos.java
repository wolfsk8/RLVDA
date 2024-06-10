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
import java.util.List;

/**
 *
 * @author juan
 */
public class ListarProductos extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        List<obj_producto> list_productos = Consultas_listado.GestionProductos(0, 0, LEGACY_DO_HEAD, 0, 0, BigDecimal.ZERO, 0);
        //convertir la lista de prductos a JSON
        Gson gson = new Gson();
        String json = gson.toJson(list_productos);
        
        PrintWriter out =
        response.getWriter();
        out.print(json);
        out.flush();
        
    }

}

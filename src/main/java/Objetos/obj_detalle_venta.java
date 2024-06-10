/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.List;

/**
 *
 * @author juan
 */
public class obj_detalle_venta {
    protected int id_detalle_venta;
    public List<obj_usuario> obj_usuarios;
    public List<obj_ventas> obj_venta;
    double precio_unitario;
    int cantidad;
    long fecha_aud;

    public obj_detalle_venta() {
    }

    public obj_detalle_venta(int id_detalle_venta, List<obj_usuario> obj_usuarios, List<obj_ventas> obj_venta, double precio_unitario, int cantidad, long fecha_aud) {
        this.id_detalle_venta = id_detalle_venta;
        this.obj_usuarios = obj_usuarios;
        this.obj_venta = obj_venta;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.fecha_aud = fecha_aud;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public List<obj_usuario> getObj_usuarios() {
        return obj_usuarios;
    }

    public void setObj_usuarios(List<obj_usuario> obj_usuarios) {
        this.obj_usuarios = obj_usuarios;
    }

    public List<obj_ventas> getObj_venta() {
        return obj_venta;
    }

    public void setObj_venta(List<obj_ventas> obj_venta) {
        this.obj_venta = obj_venta;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(long fecha_aud) {
        this.fecha_aud = fecha_aud;
    }
    
}

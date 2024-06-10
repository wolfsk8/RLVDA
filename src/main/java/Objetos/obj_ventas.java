/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juan
 */
public class obj_ventas {
    int id_venta;
    obj_usuario obj_usuarios;
    obj_cliente obj_clientes;
    long fecha_venta;
    double precio_total;
    long fecha_aud;

    public obj_ventas() {
    }

    public obj_ventas(int id_venta, obj_usuario obj_usuarios, obj_cliente obj_clientes, long fecha_venta, double precio_total, long fecha_aud) {
        this.id_venta = id_venta;
        this.obj_usuarios = obj_usuarios;
        this.obj_clientes = obj_clientes;
        this.fecha_venta = fecha_venta;
        this.precio_total = precio_total;
        this.fecha_aud = fecha_aud;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public obj_usuario getObj_usuarios() {
        return obj_usuarios;
    }

    public void setObj_usuarios(obj_usuario obj_usuarios) {
        this.obj_usuarios = obj_usuarios;
    }

    public obj_cliente getObj_clientes() {
        return obj_clientes;
    }

    public void setObj_clientes(obj_cliente obj_clientes) {
        this.obj_clientes = obj_clientes;
    }

    public long getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(long fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public long getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(long fecha_aud) {
        this.fecha_aud = fecha_aud;
    }
    
}

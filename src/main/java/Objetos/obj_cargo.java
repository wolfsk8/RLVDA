/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juan
 */
public class obj_cargo {
    int id_cargo;
    String cargo;
    String descripcion;
    long fecha_aud;

    public obj_cargo(int id_cargo, String cargo, String descripcion, long fecha_aud) {
        this.id_cargo = id_cargo;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.fecha_aud = fecha_aud;
    }

    public obj_cargo() {
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(long fecha_aud) {
        this.fecha_aud = fecha_aud;
    }

}

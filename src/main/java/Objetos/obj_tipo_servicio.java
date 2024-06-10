/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_tipo_servicio {
    int id_tipo_servicio;
    String nombre_servicio;
    String descripcion;
    long aud_fecha;

    public obj_tipo_servicio() {
    }

    public obj_tipo_servicio(int id_tipo_servicio, String nombre_servicio, String descripcion, long aud_fecha) {
        this.id_tipo_servicio = id_tipo_servicio;
        this.nombre_servicio = nombre_servicio;
        this.descripcion = descripcion;
        this.aud_fecha = aud_fecha;
    }

    public int getId_tipo_servicio() {
        return id_tipo_servicio;
    }

    public void setId_tipo_servicio(int id_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getAud_fecha() {
        return aud_fecha;
    }

    public void setAud_fecha(long aud_fecha) {
        this.aud_fecha = aud_fecha;
    }
    
    
}

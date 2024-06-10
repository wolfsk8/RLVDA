/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_servicio {
    int id_servicio;
    long fecha_conclusion;
    long aud_estado;
    obj_tipo_servicio tipo_servicio;

    public obj_servicio() {
    }

    public obj_servicio(int id_servicio, long fecha_conclusion, long aud_estado, obj_tipo_servicio tipo_servicio) {
        this.id_servicio = id_servicio;
        this.fecha_conclusion = fecha_conclusion;
        this.aud_estado = aud_estado;
        this.tipo_servicio = tipo_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public long getFecha_conclusion() {
        return fecha_conclusion;
    }

    public void setFecha_conclusion(long fecha_conclusion) {
        this.fecha_conclusion = fecha_conclusion;
    }

    public long getAud_estado() {
        return aud_estado;
    }

    public void setAud_estado(long aud_estado) {
        this.aud_estado = aud_estado;
    }

    public obj_tipo_servicio getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(obj_tipo_servicio tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
    
}

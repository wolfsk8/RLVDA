/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author juan
 */
public class obj_persona {
    int id_persona;
    String nombres;
    String apellido_parteno;
    String apellido_materno;
    String direccion;
    String telefono;
    String correo;
    Date fecha_nac;

    public obj_persona(int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.apellido_parteno = apellido_parteno;
        this.apellido_materno = apellido_materno;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha_nac = fecha_nac;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_parteno() {
        return apellido_parteno;
    }

    public void setApellido_parteno(String apellido_parteno) {
        this.apellido_parteno = apellido_parteno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    
}

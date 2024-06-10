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
public class obj_cliente extends obj_persona{
    int id_cliente;
    String antiguedad;
    long aud_fecha;

    public obj_cliente(int id_cliente, String antiguedad, long aud_fecha, int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        super(id_persona, nombres, apellido_parteno, apellido_materno, direccion, telefono, correo, fecha_nac);
        this.id_cliente = id_cliente;
        this.antiguedad = antiguedad;
        this.aud_fecha = aud_fecha;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public long getAud_fecha() {
        return aud_fecha;
    }

    public void setAud_fecha(long aud_fecha) {
        this.aud_fecha = aud_fecha;
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

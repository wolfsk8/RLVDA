/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author juancazana
 */
public class obj_agente_proveedor extends obj_persona{
    int id_agente_proveedor;
    obj_proveedor obj_proveedores;
    long fecha_aud;

    public obj_agente_proveedor(int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        super(id_persona, nombres, apellido_parteno, apellido_materno, direccion, telefono, correo, fecha_nac);
    }

    public obj_agente_proveedor(int id_agente_proveedor, obj_proveedor obj_proveedores, long fecha_aud, int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        super(id_persona, nombres, apellido_parteno, apellido_materno, direccion, telefono, correo, fecha_nac);
        this.id_agente_proveedor = id_agente_proveedor;
        this.obj_proveedores = obj_proveedores;
        this.fecha_aud = fecha_aud;
    }

    public int getId_agente_proveedor() {
        return id_agente_proveedor;
    }

    public void setId_agente_proveedor(int id_agente_proveedor) {
        this.id_agente_proveedor = id_agente_proveedor;
    }

    public obj_proveedor getObj_proveedores() {
        return obj_proveedores;
    }

    public void setObj_proveedores(obj_proveedor obj_proveedores) {
        this.obj_proveedores = obj_proveedores;
    }

    public long getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(long fecha_aud) {
        this.fecha_aud = fecha_aud;
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

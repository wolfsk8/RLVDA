/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_empresa extends obj_proveedor {
    int id_empresa;
    String razon_social;
    String direccion_empresa;
    String nit_empresa;
    String telefono_empresa;
    String correo_empresa;
    long aud_fecha;

    public obj_empresa(int id_empresa, String razon_social, String direccion_empresa, String nit_empresa, String telefono_empresa, String correo_empresa, long aud_fecha) {
        this.id_empresa = id_empresa;
        this.razon_social = razon_social;
        this.direccion_empresa = direccion_empresa;
        this.nit_empresa = nit_empresa;
        this.telefono_empresa = telefono_empresa;
        this.correo_empresa = correo_empresa;
        this.aud_fecha = aud_fecha;
    }

    public obj_empresa() {
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    public String getNit_empresa() {
        return nit_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }

    public String getTelefono_empresa() {
        return telefono_empresa;
    }

    public void setTelefono_empresa(String telefono_empresa) {
        this.telefono_empresa = telefono_empresa;
    }

    public String getCorreo_empresa() {
        return correo_empresa;
    }

    public void setCorreo_empresa(String correo_empresa) {
        this.correo_empresa = correo_empresa;
    }

    public long getAud_fecha() {
        return aud_fecha;
    }

    public void setAud_fecha(long aud_fecha) {
        this.aud_fecha = aud_fecha;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
}

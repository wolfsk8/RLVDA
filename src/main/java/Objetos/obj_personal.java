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
public class obj_personal extends obj_persona{
    int id_personal;
    int estado;
    long fecha_aud;

    public obj_personal(int id_personal, int estado, long fecha_aud, int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        super(id_persona, nombres, apellido_parteno, apellido_materno, direccion, telefono, correo, fecha_nac);
        this.id_personal = id_personal;
        this.estado = estado;
        this.fecha_aud = fecha_aud;
    }
    
}

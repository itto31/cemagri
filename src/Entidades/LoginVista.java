/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author marlo
 */
public class LoginVista {
    int log_Codigo;
    String log_Nombre;
    String log_Contraseña;
    String rol_nombre;

    public int getLog_Codigo() {
        return log_Codigo;
    }

    public void setLog_Codigo(int log_Codigo) {
        this.log_Codigo = log_Codigo;
    }

    public String getLog_Nombre() {
        return log_Nombre;
    }

    public void setLog_Nombre(String log_Nombre) {
        this.log_Nombre = log_Nombre;
    }

    public String getLog_Contraseña() {
        return log_Contraseña;
    }

    public void setLog_Contraseña(String log_Contraseña) {
        this.log_Contraseña = log_Contraseña;
    }

    public String getRol_nombre() {
        return rol_nombre;
    }

    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    public LoginVista() {
    }

    public LoginVista(String log_Nombre, String log_Contraseña, String rol_nombre) {
        this.log_Nombre = log_Nombre;
        this.log_Contraseña = log_Contraseña;
        this.rol_nombre = rol_nombre;
    }

    public LoginVista(int log_Codigo, String log_Nombre, String log_Contraseña, String rol_nombre) {
        this.log_Codigo = log_Codigo;
        this.log_Nombre = log_Nombre;
        this.log_Contraseña = log_Contraseña;
        this.rol_nombre = rol_nombre;
    }
    
    
}

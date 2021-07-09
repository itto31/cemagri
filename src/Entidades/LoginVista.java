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
    String log_Contrasena;
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

    public String getLog_Contrasena() {
        return log_Contrasena;
    }

    public void setLog_Contraseña(String log_Contrasena) {
        this.log_Contrasena = log_Contrasena;
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
        this.log_Contrasena = log_Contrasena;
        this.rol_nombre = rol_nombre;
    }

    public LoginVista(int log_Codigo, String log_Nombre, String log_Contraseña, String rol_nombre) {
        this.log_Codigo = log_Codigo;
        this.log_Nombre = log_Nombre;
        this.log_Contrasena = log_Contrasena;
        this.rol_nombre = rol_nombre;
    }
    
    
}

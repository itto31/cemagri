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
public class Categorías {
    int cat_Codigo;
    String cat_Nombre;

    public int getCat_Codigo() {
        return cat_Codigo;
    }

    public void setCat_Codigo(int cat_Codigo) {
        this.cat_Codigo = cat_Codigo;
    }

    public String getCat_Nombre() {
        return cat_Nombre;
    }

    public void setCat_Nombre(String cat_Nombre) {
        this.cat_Nombre = cat_Nombre;
    }

    public Categorías(int cat_Codigo, String cat_Nombre) {
        this.cat_Codigo = cat_Codigo;
        this.cat_Nombre = cat_Nombre;
    }

    public Categorías() {
    }

    public Categorías(String cat_Nombre) {
        this.cat_Nombre = cat_Nombre;
    }

 
    
    
}

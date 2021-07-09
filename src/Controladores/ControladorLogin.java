/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.LoginVista;
import conexionSQL.conexionSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marlo
 */
public class ControladorLogin {
  private Connection con = new conexionSQL().conexion();
  
   public int looo(String string, String string1, String string2) throws SQLException {
             int rsñ = 0;           
        try {                      
            CallableStatement a = con.prepareCall("{call Login_Register ('"+string+"','"+string1+"','"+string2+"')}");
            ResultSet rs = a.executeQuery();
              while(rs.next()){    
              rsñ = rs.getInt(1);    
              }
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
        }
        return rsñ;
    }
}

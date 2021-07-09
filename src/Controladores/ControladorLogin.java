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
import javax.swing.JOptionPane;

/**
 *
 * @author marlo
 */
public class ControladorLogin {
  private Connection con = new conexionSQL().conexion();
  
   public int looo(LoginVista l, String rol) throws SQLException {
             int rsñ = 0;           
        try {                      
            CallableStatement a = con.prepareCall("call Login_Register (?,?,?)");
             a.setString("nombre",l.getLog_Nombre());
              a.setString("pass",l.getLog_Contrasena());
              a.setString("rol",rol);
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

package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
        try {
           String url = "jdbc:mysql://localhost:3306/cemagri";
            String UsuarioBD = "root";
            String ContraseñaBD= "";
             conectar = DriverManager.getConnection(url, UsuarioBD, ContraseñaBD);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la connecion!" + e);
        }
            
         return conectar;
    }
    
}

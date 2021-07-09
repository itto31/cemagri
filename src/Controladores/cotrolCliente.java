package Controladores;

import Entidades.Clientes;
import java.sql.Connection;
import conexionSQL.conexionSQL;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class cotrolCliente {
     private Connection con = new conexionSQL().conexion();
     
      public void InsertarPersona(Clientes cliente) throws SQLException{
          try {
               CallableStatement statement = con.prepareCall("call insertar_Cliente(?,?,?,?,?,?,?)");
               statement.setString("nombre",cliente.getCli_Nombre());
                 statement.setString("direccion",cliente.getCli_Direccion());
        statement.setString("DUI", cliente.getCli_DUI());
           statement.setString("NIT", cliente.getCli_NIT());    
           statement.setString("Telefono", cliente.getCli_Telefono());
           statement.setString("NRC", cliente.getCli_NRC());
               statement.setInt("Activo", cliente.getCli_Activo());
                 statement.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!", "Mensaje de sistema", 1);
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
          }
             
      con.close();
      }
      
        public ArrayList<Clientes>BuscarClientes(Clientes cliente){
         ArrayList<Clientes> Clientes = new ArrayList<>();
         try {
       
             CallableStatement cb = con.prepareCall("call Mostrar_Clientes(?)");
             cb.setString("nombre",cliente.getCli_Nombre());
             ResultSet rs = cb.executeQuery();
           
             while (rs.next()) {
                 Clientes c = new Clientes();
                 c.setCli_Codigo(rs.getInt("cli_Codigo"));
                c.setCli_Nombre(rs.getString("cli_Nombre"));
                c.setCli_Direccion(rs.getString("cli_Direccion"));
                c.setCli_DUI(rs.getString("cli_DUI"));
                c.setCli_NIT(rs.getString("cli_NIT"));
                c.setCli_Telefono(rs.getString("cli_Telefono"));
                c.setCli_NRC(rs.getString("cli_NRC"));
                c.setCli_Activo(rs.getInt("cli_Activo"));
                Clientes.add(c);
              
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return Clientes;
     }
       public void ActualizarCliente(Clientes cliente)throws SQLException{
           try {
               CallableStatement statement = con.prepareCall("call actualizar_Cliente(?,?,?,?,?,?,?,?)");
               statement.setInt("id", cliente.getCli_Codigo()); 
               System.out.println(cliente.getCli_Codigo());
                statement.setString("nombre",cliente.getCli_Nombre());
                 statement.setString("direccion",cliente.getCli_Direccion());
        statement.setString("DUI", cliente.getCli_DUI());
           statement.setString("NIT", cliente.getCli_NIT());    
           statement.setString("Telefono", cliente.getCli_Telefono());
           statement.setString("NRC", cliente.getCli_NRC());
               statement.setInt("Activo", cliente.getCli_Activo());
                
               statement.execute();
        JOptionPane.showMessageDialog(null, "Actualizo Exitoso!!", "Mensaje de sistema", 1);
           } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
           }
            con.close();
       }
}

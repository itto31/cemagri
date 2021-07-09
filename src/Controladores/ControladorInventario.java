package Controladores;

import Entidades.Inventario;
import conexionSQL.conexionSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControladorInventario {
     private Connection con = new conexionSQL().conexion();
     
      public ArrayList<Inventario>BuscarClientes(Inventario inventario){
           ArrayList<Inventario> Inventarios = new ArrayList<>();
          try {
                CallableStatement cb = con.prepareCall("Mostrar_Buscar_por_Nombre_Inventario(?,?)");
                 cb.setString("sucursal",inventario.getScr_Direcion());
                 cb.setString("producto",inventario.getPrd_Nombre());
                  ResultSet rs = cb.executeQuery();
                   while (rs.next()) {
                   Inventario i = new Inventario();
                   i.setInv_Codigo(rs.getInt("inv_Codigo"));
                   i.setInv_CodigoInven(rs.getString("inv_CodigoInven"));
                   i.setPrd_Nombre(rs.getString("prd_Nombre"));
                   i.setPrd_Descripcion(rs.getString("prd_Descripcion"));
                   i.setMar_Nombre(rs.getString("mar_Nombre"));
                   i.setInv_Existencia(rs.getInt("inv_Existencia"));
                   
                   }
          } catch (Exception e) {
          }
      return Inventarios;
      }
    
}

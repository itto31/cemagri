package Controladores;

import Entidades.Inventario;
import conexionSQL.conexionSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorInventario {
     private Connection con = new conexionSQL().conexion();
     
      public ArrayList<Inventario>BuscarInventario(Inventario inventario){
           ArrayList<Inventario> Inventarios = new ArrayList<>();
          try {
                CallableStatement cb = con.prepareCall("call Mostrar_Buscar_por_Nombre_Inventario(?,?)");
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
                   i.setPrd_Precio(rs.getDouble("prd_Precio"));
                   i.setInv_PrecioVen(rs.getDouble("inv_PrecioVen"));
                   i.setPrv_Empresa(rs.getString("prv_Empresa"));
                   i.setScr_Nombre(rs.getString("scr_Nombre"));
                   i.setScr_Direcion(rs.getString("scr_Direcion"));
                   i.setCat_Nombre(rs.getString("cat_Nombre"));
                   i.setInv_codprd(rs.getInt("inv_codprd"));
                   i.setInv_codscr(rs.getInt("inv_codscr"));
                   i.setPrd_codprv(rs.getInt("prd_codprv"));
                   i.setPrd_codmar(rs.getInt("prd_codcat"));
                   Inventarios.add(i);
                   }
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "ERROR"+e);
          }
      return Inventarios;
      }
    
}

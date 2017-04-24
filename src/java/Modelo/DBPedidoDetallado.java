/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBPedidoDetallado {
    
    public int RegistrarPedidoDetallado(int pedido_id, String prenda, int telas_id, int color_id,String talla, int cantidad, float valor_unitario, float iva, float valor_total){
    String habilitado="si";
    String sql="INSERT INTO pedidos_detallados(pedido_id, prenda,telas_id, color_id, talla, cantidad, valor_unitario,iva,valor_total,habilitado) VALUES(?,?,?,?,?,?,?,?,?,?);";
    int r=0;
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setInt(1, pedido_id);
            pst.setString(2, prenda);
            pst.setInt(3, telas_id);
            pst.setInt(4,color_id);
            pst.setString(5, talla);
            pst.setInt(6, cantidad);
            pst.setFloat(7, valor_unitario);
            pst.setFloat(8, iva);
            pst.setFloat(9,valor_total);
            pst.setString(10, habilitado);
            r=pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
    }
    
    public ResultSet BuscarDetallesDePedidosPorIdPedido(int id){
        ResultSet rs=null;
        
        String habilitado = "si";
        String sql = "SELECT * FROM pedidos_detallados WHERE pedido_id='"+id+"' AND habilitado='" + habilitado + "';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {

                return rs;
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
        
        
        
    }
    
    
    
    
}

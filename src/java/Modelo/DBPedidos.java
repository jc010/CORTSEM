/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Date;
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
public class DBPedidos {
    
    public int RegistrarPedido(String fecha_pedido, String fecha_entrega, int empleado_id, String descripcion,int cliente_id){
    String habilitado="si";
    String sql="INSERT INTO pedidos(f_pedido, f_entrega,empleado_id, descripcion, cliente_id, habilitado) VALUES(?,?,?,?,?,?);";
    int r=0;
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setString(1, fecha_pedido);
            pst.setString(2, fecha_entrega);
            pst.setInt(3, empleado_id);
            pst.setString(4,descripcion);
            pst.setInt(5, cliente_id);
            pst.setString(6, habilitado);
            r=pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return r;
    }
    
    
    public ResultSet ListarPedido(){
        ResultSet rs=null;
        String habilitado="si";
        String sql="SELECT * FROM pedidos WHERE habilitado='"+habilitado+"';";
        
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.next()){
            
                return rs;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
    
    public int BuscarIdPedido(String fecha_pedido, String fecha_entrega, int empleado_id, String descripcion,int cliente_id){
        ResultSet rs=null;
        int u=0;
        String habilitado="si";
        String sql="SELECT * FROM pedidos WHERE f_pedido='"+fecha_pedido+"', f_entrega='"+fecha_entrega+"',empleado_id='"+empleado_id+"', descripcion='"+descripcion+"', cliente_id='"+cliente_id+"' AND habilitado='"+habilitado+"',;";
        
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.next()){
            
                return u;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return u;
    }
}

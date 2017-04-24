package Modelo;

import Modelo.ControlBD;
import Modelo.ConexionBD;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALEJANDRA MOLINA
 */
public class prueba {

    public static void main(String[] args) {
         
        
        ControlBD cont = new ControlBD();
        ConexionBD bd = new ConexionBD();
        DBPedidos ped = new DBPedidos();
        DBClientes cli = new DBClientes();
        DBEmpleado emp= new DBEmpleado();
        DBUsuarios user= new DBUsuarios();
        DBPedidoDetallado pedd = new DBPedidoDetallado();
//        String usuario, contrasena, rol, nombre, habilitado, documento, telefono, celular, correo, cargo;
//        String fentrega, fpedido, descripcion, rh,fnacimiento,contacto_familiar;
//        String prenda, talla, direccion;
       
      String usuario,contrasena;
        int usuario_id;

        int pedido_id, telas_id, color_id, cantidad;
        float valor_unitario, iva, valor_total;
        int cedula, u = 0;
        int id, empleado_id;
        String habilitado = "si";
        ResultSet rs = null;
        if (bd == null) {
            System.out.println("hay errores con la conexion");
        } else {
            id=3;
            emp.EliminarEmpleados(id);
            
            usuario="juanfer@cortsem.com";
            contrasena="123";
            if(user.ValidarUsuario(usuario, contrasena)==true){
                ArrayList<Clientes> Listar = new ArrayList();
                Listar.clear();
                Listar=cli.ListarClientes();
                
                System.out.println(Listar);
            
            }else{
            
                System.out.println("nononon");
            }
            
//             try {
//                 if(rs.next()){
//                     System.out.println("SIIISISISIsi");
//                     
//                 }else{
//                     System.out.println("NONONONO");
//                 }} catch (SQLException ex) {
//                 Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
//             }
            
        }

    }
}

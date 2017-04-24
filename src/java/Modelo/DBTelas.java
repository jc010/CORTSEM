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
public class DBTelas {
    public int RegistrarTela(String ref_tela, String descripcion, String diseno) {
            String habilitado = "si";
            String sql = "INSERT INTO telas(ref_tela, descripcion, diseno, habilitado) VALUES(?,?,?,?);";
            int r = 0;

            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, ref_tela);
                pst.setString(2, descripcion);
                pst.setString(3, diseno);
                pst.setString(4, habilitado);
            
                

                r = pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return r;
        }

        public int BuscarIDTela(String ref_tela) {
            int u = 0;
            String habilitado;
            habilitado="si";
            String sql = "SELECT * FROM usuarios WHERE ref_tela='" + ref_tela+ "' AND habilitado='"+habilitado+"';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {

                    u = rs.getInt(1);
                    return u;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            return u;

        }
}

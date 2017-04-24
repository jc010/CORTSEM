/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBClientes;
import Modelo.DBPedidoDetallado;
import Modelo.DBPedidos;
import Modelo.DBTelas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan
 */
@WebServlet(name = "InsertarPedido", urlPatterns = {"/InsertarPedido"})
public class InsertarPedido extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            DBPedidos ped=new DBPedidos();
            DBClientes clien=new DBClientes();
            DBPedidoDetallado pd=new DBPedidoDetallado();
            DBTelas telas= new DBTelas();
                    
            String f_pedido,f_entrega,descripcion,nombreCliente,nit,prenda,ref_tela,talla, cantidad1,diseno;
            int empleado_id,cliente_id,cantidad, pedido_id;
            float valorUnitario,valorTotal,iva;
            ResultSet rs;
            
            f_pedido=request.getParameter("f_pedido");
            f_entrega=request.getParameter("f_entrega");
            empleado_id=1;
            descripcion=request.getParameter("descripcion");           
            talla=request.getParameter("talla");
            prenda=request.getParameter("prenda");
            ref_tela=request.getParameter("ref_tela");
            nombreCliente=request.getParameter("nombreCliente");
            nit=request.getParameter("nit");
            cantidad1=request.getParameter("cantida");
            cantidad=Integer.parseInt(cantidad1);
            cantidad=5;
            valorUnitario=Float.parseFloat(request.getParameter("valorUnitario"));
            valorTotal=Float.parseFloat(request.getParameter("valorTotal"));
            iva=Float.parseFloat(request.getParameter("iva"));
            
            diseno=request.getParameter("diseno");
            
            
            telas.RegistrarTela(ref_tela, descripcion, diseno);
            
            cliente_id=clien.BuscarIDClientes(nombreCliente, nit);
            ped.RegistrarPedido(f_pedido, f_entrega, empleado_id, descripcion, cliente_id);
            pedido_id=ped.BuscarIdPedido(f_pedido, f_entrega, empleado_id, descripcion, cliente_id);
            pd.RegistrarPedidoDetallado(pedido_id, prenda, cliente_id, cantidad, talla, cantidad, valorUnitario, iva, valorTotal);
            
            rs=ped.ListarPedido();
            request.setAttribute("ListarPedidos", rs);
            RequestDispatcher rd=request.getRequestDispatcher("ListarPedidos.jsp");
            rd.forward(request, response);
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

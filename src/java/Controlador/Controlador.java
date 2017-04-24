package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.ControlBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ALEJANDRA MOLINA
 */
@WebServlet(urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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
            ControlBD contr=new ControlBD();
            String user,contrasena,rol,nombre,cedulas;
            int cedula,verificar;
            
            user= (String) request.getParameter("usuario");
            contrasena= (String) request.getParameter("contrasena");
            rol= (String) request.getParameter("rol");
            nombre=(String) request.getParameter("nombre");
            cedula= Integer.parseInt(request.getParameter("cedula"));
            verificar=contr.registrarEmpleado(user, contrasena, rol, cedula, nombre);
//            if(verificar==0){
//            
//            System.out.println("tenemos problemas");
//            out.println("<h1>Servlet Controlador at que problema" + request.getContextPath() + "</h1>");
//            }else{
//                
//                response.sendRedirect("index.jsp");
//            
//            }
            
            if(contr.validarUsuario(user, contrasena)){
            
                HttpSession session= request.getSession();
                session.setAttribute("user", user);
                session.setAttribute("clave", contrasena);
                session.setAttribute("rol", rol);
            
                response.sendRedirect("index.jsp");
            }else{
            
            
                System.out.println("tenemos problemas");
            
            }
            
            
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at que problema" + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

<%-- 
    Document   : tablaEmpleados
    Created on : 27/03/2017, 10:23:00 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container" id="contenido">
    <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Empleados</h3>
                    <div class="pull-right">
                        <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
                            
                        </span>
                    </div>
                </div>
                <div class="panel-body">
                    <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                </div>
                <table class="table table-hover" id="dev-table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Documento</th>
                            <th>Cargo</th>
                            <th>Usuario</th>
                            <th>Ver Detalle</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <%ArrayList<Empleados> Listar= (ArrayList<Empleados>) request.getAttribute("listar_empleados");
                        
                        int cont;
                        cont = 1;
                        for(Empleados myemp: Listar) {

                    %>
                    <tbody>
                        <tr>
                            <td><%=cont%></td>
                            <td><%=myemp.getNombre()%></td>
                            <td><%=myemp.getDocumento()%> </td>
                            <td><%=myemp.getCargo()%></td>
                            <td><%=myemp.getUsuarioId().getUsuario()%></td>
                            <td><a  href="EditarEmpleados?id=<%=myemp.getId() %>" ><span>Ver Detalles</span></a></td>
                            <td><a href="EditarEmpleados?id=<%=myemp.getId() %>" id="editar"><span>Edicion</span></a></td>
                             <td><a href="#" data-toggle="modal" data-target="#ModalEliminar<%=myemp.getId()%>"><span>Eliminar</span></a></td>

                        </tr>

                    </tbody>
                    <div id="ModalEliminar<%= myemp.getId()%>" class="modal fade" role="dialog">
                            <div class="modal-dialog modal-sm">


                                <div class="modal-content cuadromodal">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title text-center">Está Seguro?</h4>
                                    </div>
                                    <div class="modal-body">
                                        <div class="col-lg-offset-3">
                                            <a class="btn btn-primary" href="EliminarEmpleado?id=<%= myemp.getId()%>" >Si</a>
                                            <button type="button" class="btn btn-success" data-dismiss="modal">No</button>
                                        </div>

                                    </div>

                                </div>



                            </div>
                        </div>
                    <%;%>
                    <%cont += 1;
                        }%>
                </table>
            </div>
        </div>

    </div>
</div>

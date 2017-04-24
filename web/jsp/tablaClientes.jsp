<%-- 
    Document   : tablaClientes
    Created on : 19/04/2017, 11:14:34 AM
    Author     : Juan
--%>

<%@page import="Modelo.Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container" id="contenido">
    <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
    <form method="POST">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Clientes</h3>
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

                                <th>Usuario</th>
                                <th>Ver Detalle</th>
                                <th>Editar</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
                        <%ArrayList<Clientes> Listar = (ArrayList<Clientes>) request.getAttribute("Listar_Clientes");
                            int cont;
                            cont = 1;

                            for (Clientes cli : Listar) {

                        %>
                        <tbody>
                            <tr>
                                <td><%=cont%></td>
                                <td><%=cli.getNombre()%></td>
                                <td><%=cli.getDocumento()%> </td>
                                <td><%=cli.getUsuarioId().getUsuario()%></td>

                                <td><a  href="EditarClientes?id=<%=cli.getId()%>" ><span>Ver Detalles</span></a></td>
                                <td><a href="EditarClientes?id=<%=cli.getId()%>" id="editar"><span>Edicion</span></a></td>



                                <td><a href="#" data-toggle="modal" data-target="#ModalEliminar<%=cli.getId()%>"><span>Eliminar</span></a></td>



                            </tr>

                        </tbody>
                        <div id="ModalEliminar<%= cli.getId()%>" class="modal fade" role="dialog">
                            <div class="modal-dialog modal-sm">


                                <div class="modal-content cuadromodal">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title text-center">Está Seguro?</h4>
                                    </div>
                                    <div class="modal-body">
                                        <div class="col-lg-offset-3">
                                            <a class="btn btn-primary" href="EliminarCliente?id=<%= cli.getId()%>" >Si</a>
                                            <button type="button" class="btn btn-success" data-dismiss="modal">No</button>
                                        </div>

                                    </div>

                                </div>



                            </div>
                        </div>
                        <%;%>
                        <%cont += 1;
                        };%>
                    </table>
                </div>
            </div>

        </div>
    </form>
</div>

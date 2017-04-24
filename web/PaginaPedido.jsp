<%-- 
    Document   : PaginaPedido
    Created on : 25/02/2017, 09:18:28 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <title>JSP Page</title>
    <body>

        <%@include file="jsp/header.jsp" %>


        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <div class="contact_form">
                        <h3 class="heading"><strong>Pedido</strong> Contact <span></span></h3>
                        <div class="con_form">
                            <form action="InsertarPedido"  id="contactFrm" name="contactFrm" >
                                <input type="text" required="" placeholder="Nombre Cliente" value="" tabindex="1" name="nombreCliente" class="con_txt">
                                <input type="text" required="" placeholder="Nit Cliente" tabindex="2" value="" name="nit" class="con_txt">


                                <input type="text" required="" placeholder="Prenda" tabindex="2" value="" name="prenda" class="con_txt">

                                <input type="text" required="" placeholder="referencia de tela" tabindex="2" value="" name="ref_tela" class="con_txt">
                                <div class="col-md-2">
                                    <select name="talla" class="form-control" size="1.5">
                                        <option value="XS" class="selector" selected>XS</option> 
                                        <option value="S" class="selector">S</option>
                                        <option value="M" class="selector">M</option>
                                        <option value="L" class="selector">L</option>
                                        <option value="XL" class="selector">XL</option>
                                        <option value="XLL" class="selector">XLL</option>
                                    </select>
                                </div>

                                <input type="text" required="" placeholder="descripcion" tabindex="2" value="" name="descripcion" class="con_txt">

                                <input type="text" required="" placeholder="cantidad" tabindex="2" value="" name="cantida" class="con_txt">

                                <input type="text" required="" placeholder="Valor unitario" tabindex="2" value="" name="valorUnitario" class="con_txt">

                                <input type="text" required="" placeholder="iva" tabindex="2" value="" name="iva" class="con_txt">

                                <input type="text" required="" placeholder="valor total" tabindex="2" value="" name="valorTotal" class="con_txt">

                                <input type="text" required="" placeholder="diseno" tabindex="2" value="" name="diseno" class="con_txt">








                                <div class="col-md-4">
                                    <label>Fecha de pedido</label>
                                    <input type="date" required="" placeholder="Fecha de pedido" tabindex="3" value="" name="f_pedido" class="con_txt form-control">
                                </div>

                                <div class="col-md-4">
                                    <label>Fecha de pedido</label>
                                    <input type="date" required="" placeholder="fecha de entrega" tabindex="3" value="" name="f_entrega" class="con_txt form-control">
                                </div>
                                <input type="submit" value="ingresar" name="BOTONES" class="con_txt2">
                                <input type="submit" value="limpiar" name="BOTONES" class="con_txt2">
                                
                            </form>
                            <form action="ListarPedidos">
                                <input type="submit" value="listar" name="BOTONES" class="con_txt2">
                            </form>
                        </div>

                    </div>


                </div>
            </div>
        </div>
        <%@include file="jsp/body.jsp" %>
        <%@include file="jsp/footer.jsp" %>

    </body>
</html>

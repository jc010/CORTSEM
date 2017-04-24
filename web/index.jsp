<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 25/02/2017, 08:22:48 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        
        <title>Index Cortsem</title>
        <script ></script>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>
        <%@include file="jsp/bodyIndex.jsp" %>
        
       
        
        <div class="container"> 
            <div class="row">
                <div class="col-sm-2 col-sm-offset-1">
                    <h2 class="">MISIÓN</h2>
                    <hr class="rayamision"></div>
                <div class="col-sm-2 col-sm-offset-6">
                    <h2 class="">VISIÓN</h2>
                    <hr class="raya"> </div>

                <div class="row">
                    <div class="col-sm-4">

                        <p align="justify">Somos una empresa que día a día trabaja por su crecimiento económico y corporativo, 
                        brindando calidad y los mejores productos a cada empresa;logrando la satisfacción 
                        plena en términos de relación costo – beneficio, este resultado se refleja en la 
                        constancia y persistencia de cada uno de nuestros trabajadores. </p>

                    </div>
                    <div class="col-sm-4 col-sm-offset-4">
                        <p align="justify"> Nuestra meta en el 2015 es seguir siendo una excelente alternativa, y consolidarnos 
                        como la mejor  opción para el consumidor final en términos de calidad, tiempos de entrega, 
                        precios competitivos e innovación</p>
                    </div>
                </div>






            </div>

        </div> 
        
        <%@include file="jsp/footer.jsp" %>
        <script type="text/javascript" src="script/funciona.js"></script>
    </body>
</html>

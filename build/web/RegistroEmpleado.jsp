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
        <title></title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>
        
        <div class="container mover-form-empleado-registro">

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                    <form role="form" action="RegistroEmpleados">
                        <h2>Registro Empleado <small> cortsem.</small></h2>
                        <hr class="colorgraph">
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="nombre" id="first_name" class="form-control input-lg" placeholder="Nombre" tabindex="1">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="apellido" id="last_name" class="form-control input-lg" placeholder="Apellido" tabindex="2">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="documento" id="first_name" class="form-control input-lg" placeholder="C.c" tabindex="1">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="cargo" id="last_name" class="form-control input-lg" placeholder="Cargo" tabindex="2">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6 espacio">
                                <div class="form-group">
                                    <input type="text" name="telefono" id="password" class="form-control input-lg" placeholder="telefono" tabindex="5">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="celular" id="password_confirmation" class="form-control input-lg" placeholder="Celular" tabindex="6">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6 espacio">
                                <div class="form-group">
                                    <label for="sel1" >Fecha de Naciemiento</label>
                                    <input type="date" name="fecha_nacimiento" id="password" class="form-control input-lg" placeholder="fecha_nacimiento" tabindex="5">
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <label for="sel1">Seleccione RH</label>
                                    <select class="form-control seleccion" id="sel1" style="height:45px;" name="rh">
                                        <option value="O-">O-</option>
                                        <option value="O+">O+</option>
                                        <option value="A-">A-</option>
                                        <option value="A+">A+</option>
                                        <option value="B-">B-</option>
                                        <option value="B+">B+</option>
                                        <option value="AB-">AB-</option>
                                        <option value="AB+">AB+</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div>	
                            <div class="form-group">
                                <input type="text" name="nombre_contacto" id="display_name" class="form-control input-lg" placeholder="Nombre Contacto" tabindex="3">
                            </div>

                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6 espacio">
                                    <div class="form-group">
                                        <input type="text" name="telefono_contacto" id="password" class="form-control input-lg" placeholder="telefono" tabindex="5">
                                    </div>
                                </div>
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <input type="text" name="celular_contacto" id="password_confirmation" class="form-control input-lg" placeholder="Celular_contacto" tabindex="6">
                                    </div>
                                </div>
                            </div>



                            <div>	
                                <div class="form-group">
                                    <input type="email" name="usuario" id="display_name" class="form-control input-lg" placeholder="Usuario" tabindex="3">
                                </div>

                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6 espacio">
                                        <div class="form-group">
                                            <input type="password" name="contrasena" id="password" class="form-control input-lg" placeholder="Contraseña" tabindex="5">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="password" name="confirmar_contrasena" id="password_confirmation" class="form-control input-lg" placeholder="Confirmar Contraseña" tabindex="6">
                                        </div>
                                    </div>
                                    
                                </div>






                                <div>	
                                    <div class="form-group">
                                        <input type="text" name="direccion" id="display_name" class="form-control input-lg" placeholder="Direccion" tabindex="3">
                                    </div>


                                </div>






                                <hr class="colorgraph">
                                <div class="row">
                                    <div class="col-xs-6 col-md-6"><input type="submit" value="aceptar" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                                    <div class="col-xs-6 col-md-6"><a href="#" class="btn btn-danger btn-block btn-lg">cancelar</a></div>
                                </div>
                                
                            </div>
                        </div>
                    </form>
                    <form action="ListarEmpleados">
                    <div class="col-xs-6 col-md-6">
                        <input type="submit" type="sumit" href="#" class="btn btn-success btn-block btn-lg" value="Listar">
                    </div>
                    </form>
                </div>
                </div>
        </div>
                <%@include file="jsp/body.jsp" %>
                <%@include file="jsp/footer.jsp" %>
                </body>
                </html>
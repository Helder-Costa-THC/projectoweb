<%-- 
    Document   : cadastrardisciplina
    Created on : 1/jan/2019, 20:28:44
    Author     : HelderD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar disciplina</title>
    </head>
    <body>
        <h1>Cadastrar disciplina</h1>
        <form name="formulario" method="post" action="salvardisciplina.jsp">
            <label>Nome</label>
            <input type="text" name="nome" placeholder="Nome da disciplina"/>
            <br/>
            <label>Carga Horaria</label>
            <input type="number" name="cargaHoraria" placeholder="Carga Horaria"/>
            <br/>
            <input type="submit" name="enviar" value="Salvar"/>            
        </form>
        <a href="listardisciplina.jsp">Ver disciplinas</a>
    </body>
</html>

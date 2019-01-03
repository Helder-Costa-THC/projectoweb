<%-- 
    Document   : listardisciplina
    Created on : 1/jan/2019, 23:47:36
    Author     : HelderD
--%>

<%@page import="java.io.File"%>
<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="escola.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar disciplinas</title>
    </head>
    <body>
        <h1>Disciplinas</h1>
        <%
        ArrayList<Disciplina> vetDisciplinas = Disciplina.listar();
        for(Disciplina disciplina: vetDisciplinas){
            %>
            Nome <%=disciplina.getNome()%><br/>
            Carga Horaria <%=disciplina.getCargaHoraria()%> <br/><br/>
            <%
        }
        %>
        <a href="cadastrardisciplina.jsp">Cadastrar</a>
    </body>
</html>

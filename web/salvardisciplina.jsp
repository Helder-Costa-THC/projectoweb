<%-- 
    Document   : salvardisciplina
    Created on : 2/jan/2019, 11:58:38
    Author     : HelderD
--%>

<%@page import="java.io.File"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="escola.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
        String nome = request.getParameter("nome");
        String cargaHoraria = request.getParameter("cargaHoraria");
        /*
        out.println("Nome");
        out.println(nome);
        out.println("</br> Carga Horaria");
        out.println(cargaHoraria); 
        o codigo de baixo faz o mesmo de forma mais simples
        */
        //Busca como no banco so que XML
        
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setCargaHoraria(Integer.parseInt(cargaHoraria));
        if(disciplina.salvar()){
            out.println("Disciplina salva com sucesso!");
        }else{
            out.println("Ops!...Erro ao salvar!");
        }
            
        %>  
        <br/>
        Nome: <%=nome%><br/>        
        Carga Horaria: <%=cargaHoraria%><br/><br/>
       
        <a href="cadastrardisciplina.jsp" > Cadastrar disciplina</a><br/>
        <a href="listardisciplina.jsp" > Ver disciplinas </a>
    </body>
</html>

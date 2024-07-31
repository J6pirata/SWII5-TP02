<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.List, java.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="a"%>
      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Produtos</title>
</head>
<body>
 <ul>
     <a:forEach items="${Produtos}" var ="produto">
     
        <li>
             <a> "${produto.nome }"</a>
       
        </li>
     
     
      </a:forEach>
     
    
     
 </ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
    
    
    <c:url value = "/MostraProduto" var ="LinkProduto"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos do mercado</title>
</head>
<body>
             
     <h3>Produtos do mercado</h3>
        <a>
         <button onclick ="LinkProduto">Ver Produtos</button>
        </a> 
        <br/>
        <a>
          <button onclick = " " >Inserir Produto</button>
        </a>
        
</body>
</html>
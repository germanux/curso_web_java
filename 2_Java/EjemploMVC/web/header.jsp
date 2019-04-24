<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
        <h1>Pagina principal Aplicacion Servlets</h1>    
</header>
<% if (5 == 5) { %>
    5 es igual a 5
<% } %>
<c:if test="${5 eq 5  and  3 lt 5}">
    <c:if test="${5 == 5  &&  3 lt 5}">
        5 es igual a 5
    </c:if>
</c:if>
<nav>
    <a href="login.jsp">Login</a> 
    <a href="registro.jsp">Registro</a> 
    <a href="listar.jsp">Listado</a>  
</nav>
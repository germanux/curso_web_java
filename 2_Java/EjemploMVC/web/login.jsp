<%@include file="head.jsp" %>

<html>
    <%= head()%>
    <body>
        <%@include file="header.jsp" %>
        <h2>Login</h2>
                
        <form name="form1" method="get" action="usuarios.do">
            <table border="1">
              <tr><td>Email:</td><td>
                <input type="email" name="email" id="email" size="100" 
                       required="required" value="emailmvc@valido.com"/> </td></tr>
              <tr><td>Contraseña:</td><td>
                <input type="password" name="passwd" id="passwd" size="25" 
                       required="required" value="1234"/> </td></tr>
            </table>
            <input type="hidden" name="accion" id="accion" value="login"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>

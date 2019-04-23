<%@include file="head.jsp" %>
<% ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();%>
<html>
    <%= head()%>
    <body>
        <%@include file="header.jsp" %>

        <%-- Comentario JSP --%>
        <table>
            <thead>
            <th>Nombre</th>
            <th>Email</th>
        </thead>
        <tbody>
            <%
                for (Usuario usu : listaUsu) {
            %>
            <tr>
                <td> <% out.println(usu.getNombre());%>  </td>
                <td> <%= usu.getEmail()%> </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>

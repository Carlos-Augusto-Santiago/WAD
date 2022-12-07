<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Ejemplo Ámbito</title>
</head>
<body>
    <!-- Este código incrementa un contador. El valor es guardado
    en el objeto implícito application con el nombre atrCounter -->
    <%
        Integer contador = (Integer) pageContext.getAttribute("atrCounter", PageContext.APPLICATION_SCOPE);
        if(contador == null) {
            contador = 1;
        }
        else
            contador++;
        //PageContext.APPLICATION_SCOPE
        //PageContext.SESSION_SCOPE
        //PageContext.REQUEST_SCOPE
        //PageContext.PAGE_SCOPE
        pageContext.setAttribute("atrCounter", contador, PageContext.APPLICATION_SCOPE);
    %>
    <h1>Ejemplo de seguimiento a nivel de aplicacion</h1>
    <h2>Esta página ha sido visitada <%=contador%><%=contador==1? " vez." : " veces."%></h2>
    <h3>Mi nombre es: Carlos Augusto Santiago Pérez</h3>
</body>
</html>
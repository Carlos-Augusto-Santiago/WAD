<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejemplo JSP</title>
</head>
<body style="background-color: #E6E6FA">
    <div align="center">
        <%java.util.Date hoy = new java.util.Date();%>
    </div>
    <h1>Hello Mundo desde JSP</h1>
    <h2>Hoy es <%=hoy%></h2>
    <h3>Mi nombre es: Carlos Augusto Santiago Pérez</h3>
</body>
</html>
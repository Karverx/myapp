<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="indexBean" type="ru.levelp.myapp.web.IndexBean" scope="application"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Part has been added successfully.<h1>
<div>
    <p>Part ID: ${bean.partId}</p>
    <p>Title: ${bean.title}</p>
    <p>Supplier: ${bean.supplierName}</p>

</div>
</body>
</html>
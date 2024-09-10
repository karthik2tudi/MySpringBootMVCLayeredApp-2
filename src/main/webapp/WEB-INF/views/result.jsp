<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>
    <head>
      <meta charset="ISO-8859-1">
      <title>Infosys</title>
       <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-table@1.23.2/dist/bootstrap-table.min.css">
    </head>
    <body>
    <h1 style="color:blue;text-align: center;":>Infosys Employees Data</h1>
    <table class="table">
     <thead class="thead-dark">
    <tr>
      <th>EID</th>
      <th>ENAME</th>
      <th>ADRESS</th>
      <th>SALERY</th>
        <th>DELETE</th>
          <th>EDIT</th>
    </tr>
  </thead>
    <c:forEach items="${empDetails}" var="emp">
    <tr>
    <td><c:out value="${emp.eid}"/> </td>
    <td><c:out value="${emp.ename}"/> </td>
    <td><c:out value="${emp.address}"/> </td>
    <td><c:out value="${emp.grossSalery}"/> </td>
    <td><a href="delete?id=${emp.eid}" class="btn btn-danger">DELETE</a></td>
      <td><a href="edit?id=${emp.eid}" class="btn btn-primary">EDIT</a>
      </td>
    </tr>
    </c:forEach>
    </table>
    </body>
    </html>
    

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        text-align: center;
    }
    
    .my-table {
        margin: 0 auto;
        border-collapse: collapse;
        width: 80%;
    }
    
    th, td {
        padding: 10px;
        text-align: left;
        border: 1px solid #ddd;
    }
    
    th {
        background-color: blue;
        color: white;
    }
    
    a {
        color: #337ab7;
        text-decoration: none;
    }
    
    a:hover {
        text-decoration: underline;
    }
    
  
    
</style>
</head>
<body>
	<h1>Expense Tracker</h1>
	<p>${message}</p>
	
	<table class="my-table">
              <tr>
                <th>Description</th>
                <th>Amount</th>
                <th>&nbsp</th>
              </tr>
              
	        <c:forEach var="expense" items="${expenses}">		
			<tr>
			<td>${expense.description}</td>
			<td>&#8377;${expense.amount}<td>
			<a href="${contextRoot}/expense/${expense.id}">Edit</a>
			</tr>
		    </c:forEach>
              
    </table>
	<a href="${contextRoot}/expense">Add Expense</a>
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
			margin: 0;
			padding: 0;
		}
		h1 {
			text-align: center;
			margin-top: 50px;
			margin-bottom: 30px;
		}
		form {
			width: 500px;
			margin: 0 auto;
			background-color: #fff;
			padding: 20px;
			box-shadow: 0 0 10px rgba(0,0,0,0.2);
			border-radius: 5px;
		}
		label {
			display: block;
			margin-bottom: 5px;
			font-weight: bold;
		}
		input[type="text"], input[type="email"], textarea {
			display: block;
			width: 100%;
			padding: 10px;
			border: none;
			border-radius: 5px;
			margin-bottom: 20px;
			box-sizing: border-box;
		}
		button[type="submit"] {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
		}
		button[type="submit"]:hover {
			background-color: #3e8e41;
		}
		a {
			display: block;
			margin-top: 20px;
			text-align: center;
			color: #999;
			text-decoration: none;
		}
		a:hover {
			color: #666;
		}
	</style>
</head>
<body>

 <h1>Add Expense</h1>
 
 <form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
 	 <form:hidden path="id" />
 	 <form:input path="description" placeholder="Enter Expense Name"/>
 	 <form:input path="amount" placeholder="Enter Expense Amount"/>
 	 <form:textarea path="note" placeholder="Enter Note (Optional)"/>
 	 <button type="submit">Add Expense</button>
 </form:form>
 
 <a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
</body>
</html>
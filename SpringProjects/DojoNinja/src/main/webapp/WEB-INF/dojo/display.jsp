<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1><c:out value="${dojo.name}" /> Location Ninjas</h1>
		<a href="/"> Create New Dojo</a>
		<a href="/ninja/new"> Create New Ninja</a>
		<h2>
			Number of Created Ninjas:
			<c:out value="${dojo.ninjas.size()}" />
		</h2>
		<table class="table table-dark">
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${dojo.ninjas}">
					<tr>
						<td><c:out value="${ninja.firstName}" /></td>
						<td><c:out value="${ninja.lastName}" /></td>
						<td><c:out value="${ninja.age}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
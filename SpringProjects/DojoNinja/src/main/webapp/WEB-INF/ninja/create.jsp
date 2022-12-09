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
		<h1>Create Ninja</h1>
		<a href="/"> Create New Ninja</a>
		<form:form method="POST" action="/ninja/new" modelAttribute="ninjaObj" >
			<p>
				First Name:
				<form:input type="text" path="firstName"/>
				<form:errors path="firstName" />
			</p>
			<p>
				Last Name:
				<form:input type="text" path="lastName"/>
				<form:errors path="lastName" />
			</p>
			<p>
				Age:
				<form:input type="number" path="age"/>
				<form:errors path="age" />
			</p>
			<p>
				Dojo:
				<form:select path="creator">
					<c:forEach var="dojo" items="${allDojos}">
						<form:option value="${dojo.id}">
							<c:out value="${dojo.name}" />
						</form:option>
					</c:forEach>
				</form:select>
			</p>
			<button>Create</button>
		</form:form>
		
	</div>

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
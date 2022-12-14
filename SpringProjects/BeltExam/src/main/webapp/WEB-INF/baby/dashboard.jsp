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
		<h1>Hello, <c:out value="${oneUser.firstName}"/>  Here are some name suggestions.</h1>
		<a href="/logout">logout</a>
	</div>
	
	<div class="container">
	<h3> Baby Names</h3>
	</div>
	
		<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>				
					<th>Name</th>
					<th>Gender</th>
					<th>Origin</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="baby" items="${allBabys}">
					<tr>
						<td>
							<a href="/babys/${baby.id}">							
								<c:out value="${baby.name}" />
							</a>
						</td>
						<td><c:out value="${baby.gender}" /></td>
						<td><c:out value="${baby.orgin}" /></td>						
												

<%-- 						<td>
							<a href="/babys/${baby.id}">View</a>
							<c:if test="${user_id == baby.creator.id }">
								<a href="/babys/${baby.id}/edit">Edit</a>
								<a href="/babys/${baby.id}/delete">Delete</a>							
							</c:if>
							<form action="/babys/${baby.id}" method="POST">
								<input type="hidden" name="_method" value="DELETE" />
								<button>Delete</button>
							</form>
						</td>
					</tr> --%>
				</c:forEach>
			</tbody>
		</table>
		<a  class="btn btn-dark" href="/babys/new">New Name</a>
	</div>
	
	


<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
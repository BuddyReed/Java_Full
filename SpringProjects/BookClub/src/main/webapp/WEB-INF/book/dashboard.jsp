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
		<div class="row">
			<div class="col">
				<h1>Welcome, <c:out value="${oneUser.firstName}"/> </h1>
				<h5>Books from everyone's shelves:</h5>
			</div>
			<div class="col">
				<h5>				
				<a href="/logout">logout</a>
				</h5>
				<h5>
				<a href="/book/new">+ Add to my shelf </a>
				</h5>
			</div>
		</div>
	</div>
			
		<div class="container">
		<table class="table table-dark">
			<thead>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</thead>
			<tbody>
				<c:forEach var="book" items="${allBooks}">
					<tr>
						<td><c:out value="${book.id}" /></td>
						<td><a href="/books/${id}"><c:out value="${book.title}" /></a></td>
						<td><c:out value="${book.author}" /></td>
						<td><c:out value="${book.description}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
		

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
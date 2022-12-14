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
		<h1><c:out value="${oneBaby.name }" /></h1>
		<h2>Added By: <c:out value="${oneBaby.creator.firstName }" /></h2>
		
		
		<h5>
			Gender Name:
			<c:out value=" ${oneBaby.gender}"/>
		</h5>
		<h5>
			Origin:
			<c:out value="${oneBaby.orgin}"/>
		</h5>
		
		<h5>
			Meaning:
			<c:out value="${oneBaby.description}"/>
		</h5>
		

	</div>
	
	<div class="container">
	
<%-- 			<c:choose>
				<c:when test = "${user_id == baby.creator.id }">
					<a class="btn btn-dark" href="/babys/${id}/edit">Edit</a>
					<a class="btn btn-dark" href="/babys">Back to Baby Names</a>
				</c:when>
	            <c:otherwise>
					<a class="btn btn-dark" href="/babys">Back to Baby Names</a>
	            </c:otherwise>
			</c:choose> --%>
	
	
		

		<c:if test="${user_id == oneBaby.creator.id }">
			<a class="btn btn-dark" href="/babys/${id}/edit">Edit</a>
		</c:if>
		<a class="btn btn-dark" href="/babys">Back to Baby Names</a>
	</div>
	

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
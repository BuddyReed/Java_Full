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
				<h1><c:out value="${book.title}"/></h1>
			</div>
			<div class="col">
				<a href="/books"> back to the shelves</a>
			</div>	
		</div>
	</div>

	<div class="container">	
		<div>
			<p>
		<!-- 	// THIS CODE ALLOW YOU TO SHOW A USER WHO IS LOGGED IN ONE THING COMPARED TO IF THEY'RE NOT LOGGED IN -->
			<c:choose>
				<c:when test = "${user_id == book.creator.id }">
					You read <c:out value="${book.title}"/>
					by <c:out value="${book.author}"/>	
					<p> Here are your thoughts </p>
				</c:when>
				
	            <c:otherwise>
					<c:out value="${book.creator.firstName}"/> 
					read <c:out value="${book.title}"/>
					by <c:out value="${book.author}"/>	
					<p>Here are <c:out value="${book.creator.firstName}"/>'s thoughts</p>
	            </c:otherwise>
			</c:choose>
						
			</p>
		</div>
<%-- 		<div>
			<p>
				Here are <c:out value="${book.creator.firstName}"/>'s Thoughts
			</p>
		</div> --%>
		<div>
			<p>
				<c:out value="${book.description}"/>
			</p>
		</div>
		<c:if test="${user_id == book.creator.id }">
			<a class="btn btn-dark" href="/books/${book.id}/edit">Edit</a>
			<a class="btn btn-dark" href="/book/${book.id}/delete ">Delete</a>
		</c:if>
		
	</div>


<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
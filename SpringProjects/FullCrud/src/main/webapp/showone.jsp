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
		<h1><c:out value="${oneRecipe.name }" /></h1>
		<h2>Created By: <c:out value="${oneRecipe.creator.userName }" /></h2>
		<h2>
			Under 30 Minutes? 
			<c:choose>
				<c:when test="${oneRecipe.under30Min}">
					Yes
				</c:when>
				<c:otherwise>
					No
				</c:otherwise>
			</c:choose>
		</h2>
	</div>
	
	
	OPTION 2 THIS PAGE JUST SHOWS THE ITEM UNABLE TO EDIT ARE DO ANYTHING
		<div class="container">
	
		<h1>Expense Details
		</h1>
			<a href="/expense">Go Back</a>
		<h5>
			Expenses Name:
			<c:out value=" ${travel.expense}"/>
		</h5>
		<h5>
			Vendor:
			<c:out value="${travel.vendor}"/>
		</h5>
		<h5>
			Amount:
			<c:out value="${travel.amount}"/>
		</h5>
		<h5>
			Description:
			<c:out value="${travel.description}"/>
		</h5>
		
	</div>
	

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
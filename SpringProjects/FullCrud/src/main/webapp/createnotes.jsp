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
		<h1>Create Recipe</h1>
		// THE MODELATTRIBUTE BELOW COMES FOR THE ROUTE WHERE YOU CREATE THE EMTPY AND FULL OBJECT
		<form:form method="POST" action="/recipes/new" modelAttribute="recipeObj">
			// LINE BELOW CONNECTS THE USER TO THE MANY OBJECT YOU ARE CREATING. 
			// IN THIS CASE A RECIPE. THE PATH IS SET TO THE CREATOR BECAUSE IT IS DEFINED IN THE
			// MANY MODEL OF THE MEMBER VARIABLE THAT CONNECTS THE USER. THE VALE IS USER_ID BECAUSE YOU 
			// STORE THE USER ID UNDER THAT VARIABLE IN THE USER CONTROLLER WHEN YOU GETTHEID (CALIING THE ID)
			<form:input type="hidden" path="creator" value="${user_id}" /> 
			<p>
				Name:
				<form:input path="name" />
				<form:errors path="name" />
			</p>
			<p>
				Description:
				<form:textarea path="description"/>
				<form:errors path="description" />
			</p>
			<p>
				Under 30 mins?
				<form:checkbox path="under30Min"/>
			</p>
			<button>Create</button>
		</form:form>
	</div>
	
	
	// OPTION 2

	<div class="container">	
			<p class="text-danger"> Author Must Not Be Blank </p>
			<form:form modelAttribute="bookObj" action="/book/new" method="POST">
				<!-- <input type="hidden" name="_method" value="put"> -->
				<!-- modelAttrivute matches @modelAttribute in @Getmapping BookController -->
				<form:input type="hidden" path="creator" value="${user_id}" />
				<div class="form-group">
					<form:label path="title" class="form-label">Title:</form:label>
					<form:errors path="title" class="text-danger" />
					<form:input path="title" id="" class="form-control"/>
				</div>
				<div class="form-group">
					<form:label path="Author" class="form-label">Author:</form:label>
					<form:errors path="Author" class="text-danger" />
					<form:input path="Author" id="" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="description" class="form-label">My Thoughts:</form:label>
					<form:errors path="description" class="text-danger" />
					<form:textarea type="number" path="description" id="" class="form-control" />
				</div>
				
				
				<input type="submit" value="submit"/>
				<!-- submit button doesn't need form tag -->
				<!-- path names have to match member variables -->
			</form:form>
	</div>	




<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
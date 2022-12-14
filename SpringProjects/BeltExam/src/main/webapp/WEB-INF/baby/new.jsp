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
		<h1> Add a name!</h1>
		<a href="/babys">Back to Baby Names</a>
	</div>
	
		<div class="container">	
			<form:form modelAttribute="babyObj" action="/babys/new" method="POST">
				<!-- <input type="hidden" name="_method" value="put"> -->
				<!-- modelAttrivute matches @modelAttribute in @Getmapping BookController -->
				<form:input type="hidden" path="creator" value="${user_id}" />
				<div class="form-group">
					<form:label path="name" class="form-label">name:</form:label>
					<form:errors path="name" class="text-danger" />
					<form:input path="name" id="" class="form-control"/>
				</div>
				<form:select path="gender">
						<form:option value="Male">Male</form:option>
						<form:option value="Female">Female</form:option>
						<form:option value="Neutral">Neutral</form:option>	
				</form:select>
				
				<div class="form-group">
					<form:label path="orgin" class="form-label">orgin:</form:label>
					<form:errors path="orgin" class="text-danger" />
					<form:input path="orgin" id="" class="form-control" />
				</div>
				<p class="text-danger"> Meaning is required </p>
				<div class="form-group">
					<form:label path="description" class="form-label">My Thoughts:</form:label>
					<form:errors path="description" class="text-danger" />
					<form:textarea type="number" path="description" id="" class="form-control" />
				</div>
				
				<a class="btn btn-dark" href="/babys">Cancel</a>
				<input type="submit" value="submit"/>
				<!-- submit button doesn't need form tag -->
				<!-- path names have to match member variables -->
			</form:form>
	</div>	
	

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
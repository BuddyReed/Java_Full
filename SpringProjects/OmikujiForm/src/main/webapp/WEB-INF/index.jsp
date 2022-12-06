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
	<h1 class="text-center">Send an Omikuji</h1>
	<div class="container">	
		<form action="login" method="POST">
		  <div class="mb-3">
		    <div class="mb-3">
		    <label class="form-label" for="exampleCheck1">Pick Any Numbe from 5-25</label>
		    <input name="number" type="number" class="form-control" id="exampleCheck1">
		  </div>
		    <label for="exampleInputEmail1" class="form-label">Enter the name of anycity:</label>
		    <input name="city" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Enter the name of any real person</label>
		    <input name="person" type="text" class="form-control" id="exampleInputPassword1">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Enter professional endeavor or hobby;</label>
		    <input name="hobby" type="text" class="form-control" id="exampleInputPassword1">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Enter any type of a living thing:;</label>
		    <input name="animal" type="text" class="form-control" id="exampleInputPassword1">
		  </div>  
			<div class="mb-3">
			  <label for="floatingTextarea2">Say something nice to some one:</label>
			  <textarea name="message" class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
			</div>		  
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
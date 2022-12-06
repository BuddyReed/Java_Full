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

	<div >
		<div class="d-flex">		
			<h1>Your Gold:</h1>
			<h1 class="border-light">_____</h1>
		</div>
		
		<div class="container">
			<div class="row gap-3">			
				<div class="col card bg-light p-4">
					<form action="">					
						<h1>Farm</h1>
						<h4>(earns 10-20 gold)</h4>
						<a class="btn btn-dark"> Find Gold</a>
					</form>
				</div>
				<div class="col card bg-light p-4">
					<form action="">					
						<h1>Cave</h1>
						<h4>(earns 10-20 gold)</h4>
						<a class="btn btn-dark"> Find Gold</a>
					</form>
				</div>
				<div class="col card bg-light p-4">
					<form action="">					
						<h1>House</h1>
						<h4>(earns 10-20 gold)</h4>
						<a class="btn btn-dark"> Find Gold</a>
					</form>
				</div>	
				<div class="col card bg-light p-4">
					<form action="">					
						<h1>Quest</h1>
						<h4>(earns/take 10-50 gold)</h4>
						<a class="btn btn-dark"> Find Gold</a>
					</form>
				</div>			
			</div>
		
		</div>

		<div clas="container ">
		<div class="row p-5">	
		
				<h1> Activities</h1>
				<textarea cols="12" rows="5" style="overflow:hidden;">
		  		</textarea>			

		</div>
		</div>		
	</div>

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
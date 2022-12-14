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
		<h1>Dashboard for Recipes</h1>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Under</th>
					<th>Posted By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			// THE ITEMS BELOW YOU WILL GET THE VARIABLE FROM YOUR CONTROLLER WHERE;
			// YOU CALLED THE model.addAttribute("allRecipes", recipeServ.getAll());
			// REMEBER THE MODEL IS HOW YOU SHOW DATA TO THE JSP;
				<c:forEach var="recipe" items="${allRecipes}">
					<tr>
						<td><c:out value="${recipe.name}" /></td>
						<td><c:out value="${recipe.under30Min}" /></td>
						<td><c:out value="${recipe.creator.userName}" /></td> // THIS SHOW THE CREATOR OF THE RECIPE
						<td>
							<a href="/recipes/${recipe.id}">View</a>
							// THIS IF STATEMENT BELOW ONLY ALLOWS THE CREATOR OR THE RECIPE (OR MANY ITEM)
							// TO EDIT OR DELETE IF THEY ARE LOGGED IN IF NOT THEY WONT BE ABLE TO BE SELECTED.
							// REFERENCE 9:25 ON READ ALL VIEDO
							<c:if test="${user_id == recipe.creator.id }">
								<a href="/recipes/${recipe.id}/edit">Edit</a>
								<a href="/recipes/${recipe.id}/delete">Delete</a>							
							</c:if>
							<form action="/recipes/${recipe.id}" method="POST">
								<input type="hidden" name="_method" value="DELETE" />
								<button>Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
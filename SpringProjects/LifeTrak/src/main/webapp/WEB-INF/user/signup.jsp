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
<!-- NEW LINKS -->
<link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel = "stylesheet">  
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js">  
</script>  
</head>
<body>

<!-- NAVBAR  --> 
<section>
	<div class="container">
		<nav class="navbar navbar-dark bg-dark fixed-top p-2">
		  <div class="container-fluid">
		  <div class="navbar-edit">	  
		    <a class="navbar-brand" href="#">LifeTrak</a>
		  </div>
		   <div class="navbar-edit ">	
		 <!--   NAV BAR LOGO   -->
		    <a class="navbar-brand" href="#">
		    	<img  class="img-fluid" src="/img/white_logo.png" width="80px" height="100px" />
		    </a>
		  </div>
		    <button class="navbar-toggler me-5" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
		      <div class="offcanvas-header">
		        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">LifeTrak</h5>
		        <button type="button" class="btn-close btn-close-dark" data-bs-dismiss="offcanvas" aria-label="Close"></button>
		      </div>
		      <div class="offcanvas-body">
		        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
		          <li class="nav-item">
		            <a class="nav-link active text-dark" aria-current="page" href="/">Home</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link text-dark" href="/signup">Login</a>
		          </li>
		          <li class="nav-item dropdown">
		            <a class="nav-link dropdown-toggle text-dark" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		              Dropdown
		            </a>
		            <ul class="dropdown-menu dropdown-menu-dark">
		              <li><a class="dropdown-item text-dark" href="#">Action</a></li>
		              <li><a class="dropdown-item text-dark" href="#">Another action</a></li>
		              <li>
		                <hr class="dropdown-divider">
		              </li>
		              <li><a class="dropdown-item text-dark" href="#">Something else here</a></li>
		            </ul>
		          </li>
		        </ul>
		      </div>
		    </div>
		  </div>
		</nav>
	</div>
</section>


<!--Sign Up -->
<section class="vh-100 mt-5" style="background-color: white;">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-12 col-xl-11">
        <div class="card text-black" style="border-radius: 25px;">
          <div class="card-body p-md-5">
            <div class="row justify-content-center">
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>

                <form class="mx-1 mx-md-4">

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="text" id="form3Example1c" class="form-control" />
                      <label class="form-label" for="form3Example1c">Your Name</label>
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="email" id="form3Example3c" class="form-control" />
                      <label class="form-label" for="form3Example3c">Your Email</label>
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="password" id="form3Example4c" class="form-control" />
                      <label class="form-label" for="form3Example4c">Password</label>
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input type="password" id="form3Example4cd" class="form-control" />
                      <label class="form-label" for="form3Example4cd">Repeat your password</label>
                    </div>
                  </div>

                  <div class="form-check d-flex justify-content-center mb-5">
                    <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" />
                    <label class="form-check-label" for="form2Example3">
                      I agree all statements in <a href="#!">Terms of service</a>
                    </label>
                  </div>

                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                    <button type="button" class="btn btn-primary btn-lg">Register</button>
                  </div>

                </form>

              </div>
              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
				<!-- IMAGE PLACEMENT -->
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                  class="img-fluid" alt="Sample image">

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>


 
 
 
 


<!--  Footer -->
<section>
	<footer class="bg-dark text-center text-white">
	  <!-- Grid container -->
	  <div class="container p-4 pb-0">
	    <!-- Section: Form -->
	    <section class="">
	      <form action="">
	        <!--Grid row-->
	        <div class="row d-flex justify-content-center">
	          <!--Grid column-->
	          <div class="col-auto">
	            <p class="pt-2">
	              <strong>Sign up for our newsletter</strong>
	            </p>
	          </div>
	          <!--Grid column-->
	
	          <!--Grid column-->
	          <div class="col-md-5 col-12">
	            <!-- Email input -->
	            <div class="form-outline form-white mb-4">
	              <input type="email" id="form5Example29" class="form-control" />
	              <label class="form-label" for="form5Example29">Email address</label>
	            </div>
	          </div>
	          <!--Grid column-->
	
	          <!--Grid column-->
	          <div class="col-auto">
	            <!-- Submit button -->
	            <button type="submit" class="btn btn-outline-light mb-4">
	              Subscribe
	            </button>
	          </div>
	          <!--Grid column-->
	        </div>
	        <!--Grid row-->
	      </form>
	    </section>
	    <!-- Section: Form -->
	  </div>
	  <!-- Grid container -->
	
	  <!-- Copyright -->
	  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
	    © 2020 Copyright:
	    <a class="text-white" href="https://mdbootstrap.com/">LifeTrak.com</a>
	  </div>
	  <!-- Copyright -->
	</footer>
</section>



<!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
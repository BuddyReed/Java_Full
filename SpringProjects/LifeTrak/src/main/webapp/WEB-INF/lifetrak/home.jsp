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
<title>LifeTrak</title>
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
		<nav class="navbar navbar-dark bg-info fixed-top p-2 navcolor">
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
		           		<a class="nav-link text-dark" href="/alltask">All Task</a>
		          </li>
				  <li class="nav-item">
		            	<a class="nav-link text-dark" href="/signup">Sign Up</a>
		          </li>
		          <li class="nav-item">
		            	<a class="nav-link text-dark" href="/signin">Sign In</a>
		          </li>
		          <li class="nav-item">
		            	<a class="nav-link text-dark" href="/logout">Logout</a>
		          </li>
		        </ul>
		      </div>
		    </div>
		  </div>
		</nav>
	</div>
</section>




<!-- Banner -->

<section>

	<div class="container banner">
		<img src="/img/lifetrak.png" class="img-fluid shadow-lg p-3 mb-5 bg-body rounded" alt="...">
	</div>
</section>






<!-- CARDS  -->
 <section class="wrapper">
        <div class="container-fostrap">
            <div class="content">
                <div class="container">
                    <div class="row">
                        <!-- CARD 1 -->
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="/signup">
                                    <img src="/img/homesign.png" />
                                </a>
                                <div class="card-content text-center">
                                    <h4 class="card-title">
                                        <a href="/signup">
                                            Sign Up for LifeTrak Today!
                                        </a>
                                    </h4>
                                    <p class="">
                                    	Looking for away to keep track of you lifestyle? You found the perfect place.                            
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="/signup" class="btn btn-link btn-block">
                                        Sign Up Today
                                    </a>
                                </div>
                            </div>
                        </div>
                        <!-- CARD 2  -->
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card"
                                    href="#">
                                    <img
                                        src="/img/sub.png" />
                                </a>
                                <div class="card-content text-center">
                                    <h4 class="card-title">
                                        <a
                                            href="#route">
                                            Subscribe Below!
                                        </a>
                                    </h4>
                                    <p class="">
										Out team sends out inspirational advice daily to ensure you stay on trak.
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="https://codepen.io/wisnust10/full/ZWERZK/" class="btn btn-link btn-block">
                                        Subscribe Now
                                    </a>
                                </div>
                            </div>
                        </div>
                        
                        <!-- CARD 3  -->
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card"
                                    href="/signin">
                                    <img
                                        src="/img/homesignin.png" />
                                </a>
                                <div class="card-content text-center">
                                    <h4 class="card-title">
                                        <a
                                            href="/signin">
                                            Already Have an Account?
                                        </a>
                                    </h4>
                                    <p class="">
                                    	Access your account. Be sure to stay up on trak. Your life well change

                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="/signin"
                                        class="btn btn-link btn-block">
                                        Sign In
                                    </a>
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
	<footer class="bg-info text-center text-white">
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
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
		<nav class="navbar navbar-dark bg-info fixed-top p-2">
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


<!-- Task Tabs -->

<section>

	<div class="container alltask">
	
<!-- COLUMN 1 -->	
	
	<!-- Task Create Form -->
		<div class="row">
			        <div class="col-lg-6 col-sm-12 mb-5">
			          <div class="card" style="border-radius: 15px;">
			            <div class="card-body p-5">
			              <h2 class="text-uppercase text-center mb-5">Create lifetask</h2>
			
			              <form>
			                <div class="form-outline mb-4">
			                  <label class="form-label" for="form3Example1cg">LifeTask:</label>
			                  <input type="text" id="form3Example1cg" class="form-control form-control-lg" />
			                </div>
			                
			                <div class="form-outline mb-4">
			                  <label class="form-label" for="form3Example4cg">Due by:</label>
			                  <input type="date" id="form3Example4cg" class="form-control form-control-lg" />
			                </div>			
			
			
							<div class="input-group mb-3">
							  <label class="input-group-text bg-info" for="inputGroupSelect01">TrakTask:</label>
							  <select class="form-select" id="inputGroupSelect01">
							    <option selected>Choose...</option>
							    <option value="3">Daily</option>
							    <option value="3">Weekly</option>
							    <option value="2">Monthly</option>
							    <option value="1">Yearly</option>
							  </select>
							</div>
							<div class="mb-3">
							  <label for="exampleFormControlTextarea1" class="form-label">Description</label>
							  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
							</div>
							
			
			                <div class="form-outline mb-4">
								<h2 class="text-uppercase text-center my-5">Make your dreams a reality!</h2>
			                </div>
						
			                <div class="d-flex justify-content-center">
			                  <button type="button"
			                    class="btn btn-info btn-block btn-lg gradient-custom-4 text-body">Create LifeTask</button>
			                </div>
			
			              </form>
			            </div>
			          </div>
			        </div>		

<!-- COLUMN 2 -->

				<!-- Nav Tabs -->
			<div class="col-lg-6 col-sm-12">
				  <ul class="nav nav-tabs" id="myTab" role="tablist">
					  <li class="nav-item" role="presentation">
					    <button class="nav-link active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home-tab-pane" type="button" role="tab" aria-controls="home-tab-pane" aria-selected="true">Yearly</button>
					  </li>
					  <li class="nav-item" role="presentation">
					    <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile-tab-pane" type="button" role="tab" aria-controls="profile-tab-pane" aria-selected="false">Monthly</button>
					  </li>
					  <li class="nav-item" role="presentation">
					    <button class="nav-link" id="contact-tab" data-bs-toggle="tab" data-bs-target="#contact-tab-pane" type="button" role="tab" aria-controls="contact-tab-pane" aria-selected="false">Weekly</button>
					  </li>
					  <li class="nav-item" role="presentation">
					    <button class="nav-link" id="contact-tab" data-bs-toggle="tab" data-bs-target="#contact-tab-pane" type="button" role="tab" aria-controls="contact-tab-pane" aria-selected="false">Daily</button>
					  </li>				  
				  </ul>
				
				<!-- TAB CONTENT 1 Yearly-->
				
				<div class="tab-content p-2" id="myTabContent">
					<div class="tab-pane fade show active" id="home-tab-pane" role="tabpanel" aria-labelledby="home-tab" tabindex="0">
					  <!-- The table -->
					  <table class="table align-middle mb-0 bg-white">
						  <thead class="bg-light">
						    <tr>
						      <!-- <th>Name</th> -->
						      <th>LifeTask</th>
						      <th>Due By:</th>
						      <th>TrakTask</th>
						      <th>Actions</th>
						    </tr>
						  </thead>
						  <tbody>
						    <tr>
						      <td>
<!-- 						        <div class="d-flex align-items-center">
						          <img
						              src="https://mdbootstrap.com/img/new/avatars/8.jpg"
						              alt=""
						              style="width: 45px; height: 45px"
						              class="rounded-circle"
						              />
						        </div> -->
						      </td>
						      <td>
						        <p class="fw-normal mb-1">Software engineer</p>
						        <p class="text-muted mb-0">IT department</p>
						      </td>
						      <td>
						        <span class="badge badge-success rounded-pill d-inline">Active</span>
						      </td>
						      <td>Senior</td>
						      <td>
						        <button type="button" class="btn btn-link btn-sm btn-rounded">
						          Edit
						        </button>
						        
						        
						      </td>
						    </tr>
						    
						    
						    
						    <tr>
						      <td>
<!-- 						        <div class="d-flex align-items-center">
						          <img
						              src="https://mdbootstrap.com/img/new/avatars/6.jpg"
						              class="rounded-circle"
						              alt=""
						              style="width: 45px; height: 45px"
						              />
						        </div> -->
						      </td>
						      <td>
						        <p class="fw-normal mb-1">Consultant</p>
						        <p class="text-muted mb-0">Finance</p>
						      </td>
						      <td>
						        <span class="badge badge-primary rounded-pill d-inline"
						              >Onboarding</span
						          >
						      </td>
						      <td>Junior</td>
						      <td>
						        <button
						                type="button"
						                class="btn btn-link btn-rounded btn-sm fw-bold"
						                data-mdb-ripple-color="dark"
						                >
						          Edit
						        </button>
						      </td>
						    </tr>
						    
						    
						    <tr>
						      <td>
<!-- 						        <div class="d-flex align-items-center">
						          <img
						              src="https://mdbootstrap.com/img/new/avatars/7.jpg"
						              class="rounded-circle"
						              alt=""
						              style="width: 45px; height: 45px"
						              />
						        </div> -->
						      </td>
						      <td>
						        <p class="fw-normal mb-1">Designer</p>
						        <p class="text-muted mb-0">UI/UX</p>
						      </td>
						      <td>
						        <span class="badge badge-warning rounded-pill d-inline">Awaiting</span>
						      </td>
						      <td>Senior</td>
						      <td>
						        <button
						                type="button"
						                class="btn btn-link btn-rounded btn-sm fw-bold"
						                data-mdb-ripple-color="dark"
						                >
						          Edit
						        </button>
						      </td>
						    </tr>
						  </tbody>
						</table>
					  </div>
					<div class="tab-pane fade" id="profile-tab-pane" role="tabpanel" aria-labelledby="profile-tab" tabindex="0">...</div>
					<div class="tab-pane fade" id="contact-tab-pane" role="tabpanel" aria-labelledby="contact-tab" tabindex="0">...</div>
					<div class="tab-pane fade" id="disabled-tab-pane" role="tabpanel" aria-labelledby="disabled-tab" tabindex="0">...</div>
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
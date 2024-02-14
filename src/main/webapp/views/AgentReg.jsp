<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Data leakage Detection</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free Website Template" name="keywords">
    <meta content="Free Website Template" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Flaticon Font -->
    <link href="lib/flaticon/font/flaticon.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    
    
    
    
    <script type="text/javascript">
            function validate()
            {
                var a = document.getElementById("name");
                var mailid = document.getElementById("mailid");
                var ip = document.getElementById("ip");
                var password = document.getElementById("password");
                var un = document.getElementById("username");
                var contact = document.getElementById("contact");
              
                
              
                var valid = true;
                if(a.value.length<=0 )
                    {
                        alert("Don't leave the name empty!");
                        valid = false;
                    }
              else if(mailid.value.length<=0 )
                {
                    alert("Don't leave the mailid empty!");
                    valid = false;
                }
             
                
                else if(contact.value.length!=10 && isNaN(contact))
                {
                    alert("Enter a Valid Contact Number!");
                    valid = false;
                }
                
                
                else if(ip.value.length<=0 )
                {
                    alert("Don't leave the IP Address empty!");
                    valid = false;
                }
                else if(un.value.length<6)
                {
                    alert("Enter a Valid Username!");
                    valid = false;
                }
                else if(password.value.length<5 )
                {
                    alert("Enter a Valid Password of minimum 5 characters!");
                    valid = false;
                }
               
                return valid;
            };
        </script>

</head>

<body class="bg-white">
    <!-- Topbar Start -->
 
 
 <div class="row bg-secondary py-2 px-lg-5">
            <div class="col-lg-6 text-center text-lg-left">
                <div class="d-inline-flex align-items-center">
                    <h1 class="m-0 display-5 text-capitalize font-italic"><span class="text-primary">Data leakage </span><span style="color:white; ">Detection</span></h1>
                    
              
                <nav class="navbar navbar-expand-lg bg-none navbar-dark py-0">
           
            
            <div class="collapse navbar-collapse" style="position:absolute;left:300px;float:right;" id="navbarCollapse">
                <div class="navbar-nav m-auto py-4">
                    <a href="index.html" class="nav-item nav-link active">Home</a>
                    <a href="about.html" class="nav-item nav-link">About</a>
                    <a href="AgentLogin.jsp" class="nav-item nav-link">Agents</a>
                    <a href="distributor.jsp" class="nav-item nav-link">Distributor</a>
                   
                    <a href="contact.html" class="nav-item nav-link">Contact</a>
                </div>
            </div>
        </nav>
            </div>
       
        </div>
      </div>
       
    <!-- Topbar End -->


    <!-- Navbar Start -->
    <div class="container-fluid p-0 nav-bar">
        
    </div>
<div class ="container">
<section class="h-100 h-custom" style="background-color: #8fc4b7;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="./images/agentreg.png"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Registration Information</h3>

            <form class="px-md-2" action="/dld/agentreg" method="post" onsubmit="return validate()" >

              <div class="form-outline mb-4">
                <input type="text"  class="form-control" name="name" id="name"/>
                <label class="form-label" for="form3Example1q">Name</label>
              </div>
  			<div class="form-outline mb-4">
                <input type="email"  class="form-control" name="mailid" id="mailid"/>
                <label class="form-label" for="form3Example1q">E-Mail ID</label>
              </div>
          
            
            <div class="form-outline mb-4">
                <input type="text"  class="form-control" name="contact" id="contact"/>
                <label class="form-label" for="form3Example1q">Contact Number</label>
              </div>

               <div class="form-outline mb-4">
                <input type="text"  class="form-control" name="ipaddress" id="ip"/>
                <label class="form-label" for="form3Example1q">IP Address</label>
              </div>
              
                <div class="form-outline mb-4">
                <input type="text"  class="form-control" name="username" id="username" />
                <label class="form-label" for="form3Example1q">Username</label>
              </div>
              
               <div class="form-outline mb-4">
                <input type="text"  class="form-control" name="password" id="pwd" />
                <label class="form-label" for="form3Example1q">Password</label>
              </div>
               
              
              
              
              
              <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>
		<button type="reset" class="btn btn-success btn-lg mb-1">Reset</button>
            </form>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>


</div>
</body>
</html>
</body>
</html>
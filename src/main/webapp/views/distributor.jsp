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
                var a = document.getElementById("a");
                var b = document.getElementById("b");
                var valid = true;
                if(a.value.length<=0 || b.value.length<=0)
                    {
                        alert("Don't leave the field empty!");
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
  
    
    <!-- Navbar End -->
<div class="container" style="position:absolute;left:200px;top:100px;">
<img src="images/log1.jpeg" style="position:relative;left:50px;padding:10px; width:400px;height:300px">
 <form action="/dld/agentlogin" method="post" onsubmit="return validate()" style="position:absolute;left:470px;padding:10px;top:10px; width:400px">
                <div class="row" >
                    <div class="form-group col-lg-7">
                        <label for="code">Username</label>
                        <input type="text" class="form-control" name="username" id="a"/>
                    </div>
                </div>
        
                <div class="row">
                    <div class="form-group col-lg-7 ">
                        <label for="code">Password</label>
                        <input type="text" class="form-control input-normal" name="password" id="b"/>
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-lg-7 ">
                        <button type="submit" class="btn btn-info buton ">Login</button>
                        <button type="button" class="btn btn-info buton ">Back</button>
                	</div>
                </div>
             
                   <a href="forgotpwdDistributor.jsp">Forgot Password ? </a></p>
                   
                    
            </form>

</div>
   
  
  
</body>
</html>

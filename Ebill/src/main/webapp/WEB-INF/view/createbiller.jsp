<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<style>
body {
		    background-color: white;
			font-family: Arial, sans-serif;
			text-align: center;
		  }
  .header {
			background-color:#4E4E50;
			padding: 10px;
			color: white;
			text-align: center;
	   	  }
  .footer {
			background-color:#4E4E50;
			padding: 10px;
			color: white;
			margin-top:30px;
			bottom: 0;
			width: 100%;
			text-align: center;
	    	}
  .btn      {
           margin: auto;
           background-color:lightgrey;
           border-radius:10px;
           width: 150px;
           height: 50px;
           border-radius: 10px;
           border: 2px solid black;
           style= "Trirong",seri";
           style="font-size:130;
           }
  .form-box 
           {
			background-color: #41B3A3;
			width: 500px;
			margin: 0 auto;
			margin-top: 50px;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
		}
		.center
          {
            margin:10px 10px;
            text-align:center;
           }
		
</style>
</head>
<link>
<body>
<div class="header">
		<h1>EBILL</h1>
</div>

<div class="form-box">
<form action="savebiller" method="post">
<pre style="font-weight:500;font-size: 20px;white-space: pre-wrap; margin: 10;">
<label for="rollno"> ID :</label>
<input type="text" required pattern="[0-9]+" id="rollno" name="rollno" class="center"><br>
<label for="fname">First name:</label>
<input type="text" required pattern="[A-Za-z ]+" id="fname" name="fname" class="center"><br>
<label for="lname">Last name:</label>
<input type="text" required pattern="[A-Za-z ]+" id="lname" name="lname" class="center"><br>
<label for="dept">DEPARTMENT :</label>
<select id="dept" name="dept">
  <option value="cse">CSE</option>
  <option value="ece">ECE</option>
  <option value="eee">EEE</option>
  <option value="civil">CIVIL</option>
  <option value="mech">MECH</option>
</select><br>
<label for="phone">PHONE</label>
<input type="text" required pattern="[0-9]+"id="phone" name="phone" class="center"><br>
<label for="email">EMAIL</label>
<input type="text" required id="email" name="email" class="center"><br>
<label for="password">SET PASSWORD</label>
<input type="text" required pattern="[A-Za-z0-9 ]+" id="password" name="password" class="center"><br>
<label for="dno">Door no:</label>
<input type="text" id="dno" name="dno" class="center"><br>
<label for="street">Street:</label>
<input type="text" required pattern="[A-Za-z0-9 ]+" id="street" name="street" class="center"><br>
<label for="city">City:</label>
<input type="text" required pattern="[A-Za-z ]+" id="city" name="city" class="center"><br>
<label for="state">State:</label>
<input type="text" required pattern="[A-Za-z ]+" id="state" name="state" class="center"><br>
<label for="pincode">Pincode:</label>
<input type="text" required pattern="[0-9]+"id="pincode" name="pincode" class="center"><br>
<input type="submit" value="Submit">
</pre>
</form>
</div>    

<div class="footer">
		<p>Submitted by - name</p>
		</div>
</body>
</html>
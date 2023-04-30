<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL</title>
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
			bottom: 0;
			position:absolute;
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
            margin: 30px 30px;
            text-align: center;
           }
</style>
</head>
<link>
<body>
<div class="header">
		<h1>EBILL</h1>
</div>
<div class="box">
<div class="form-box">
<form action="seebill" method ="post">
<label for="rollno">ENTER Bill-ID:</label>
<input type="text" required pattern="[0-9]+"id="rollno" name="rollno" class="center"><br>
<input type="submit" value="Submit">
</form>
</div>
</div>
<div class="footer">
		<p>Submitted by - name</p>
		</div>

</body>
</html>

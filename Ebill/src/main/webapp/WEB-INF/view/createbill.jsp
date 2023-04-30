<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBILL</title>
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
			position: absolute;
			bottom: 0;
			width: 100%;
			text-align: center;
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
<form action="savebill" method="post">
<label for="rollno">ROLL NO :</label>
<input type="text" required pattern="[0-9]+"id="rollno" name="rollno" class="center"><br>
<label for="paidfees">PAID FEES</label>
<input type="text" required pattern="[0-9]+"id="paidfees" name="paidfees" class="center"><br>
<input type="submit" value="Submit">
</form>
</div>
</div>
<div class="footer">
		<p>Submitted by - name</p>
		</div>

</body>
</html>

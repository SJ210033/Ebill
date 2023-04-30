<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILLER</title>
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
            margin: 30px 30px;
            text-align: center;
           }
</style>
</head>
<body>
<div class="header">
		<h1>EBILL</h1>
</div>
<form id="1" action="" method="post">
<div class="box">
<div class="form-box">
         <h1 style="text-align:center;border-bottom:solid black;border-style:double;">BILLER</h1>
<div class="center">
   
       <button class="btn" onclick="createbill()">CREATE BILL</button><br>
       
       </div>
<div class="center">
       
       <button class="btn" onclick="viewbill()">VIEW BILL</button><br>
       
       </div>
</div>
</div>
</form>
<div class="footer">
		<p>Submitted by - name</p>
		</div>
<script type="text/javascript">
function createbill() {
	document.getElementById('1').action='createbill';
	document.getElementById('1').submit();
}
function viewbill() {
	document.getElementById('1').action='viewbill';
	document.getElementById('1').submit();		}

</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Permission Portal</title>
</head>
<body style="text-align:left" >
<div style="background-image: url('https://pdavedotme.files.wordpress.com/2015/04/permission-granted.jpg?w=520');background-size: 100%;">


     <h1>  PERMISSION PORTAL</h1>
     
    	<br><br><br>
 <form action="askPermission" method="post">
  	<h2>Enter your Name: <input type="text" name="aname"><br><br>
  		
  		Address : <input type="text" name="address"><br><br>
  		
  		Pincode of Area: <select name="pincode">
	  		<option>431104</option>
	  		<option>431007</option>
	  		<option>431008</option>
	  		<option>431121</option>
	  		<option>431110</option>
	  		<option>431134</option>
  		</select>
  		<br><br>
  		
  		Permission For: <select name="permissions">
	  		<option>Festival permission</option>
	  		<option>Loud Speaker permission</option>
	  		<option>Mass meetings</option>
	  		<option>Arms license</option>
	  		<option>Hotel/Lodge</option>
	  		<option>Browsing center</option>
  		</select>
  		<br><br>
  		Mobile Number : <input type="text" name="mobile"><br><br>
  		
  		ID Proof Name : <input type="text" name="id"><br><br>
  		
  		Upload Document : <input type="file" name="description"><br><br>
  		Description :<br>
  		<textarea id="w3review" name="w3review" rows="4" cols="50">
  	
  		</textarea>
       <input type="submit" name="submit" width:250px;
height:100px;"></h2>
       
       
       </form>
       
       <br><br>
       				<h2><a href="/">Back To Home</a></h2>
     
</body>
</html>
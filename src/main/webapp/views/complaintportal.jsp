<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint Portal</title>
</head>
<body style="text-align:left">
<div style="background-image: url('https://wpforms.com/wp-content/uploads/2019/03/create-a-complaint-form.jpg');background-size: 100%;">


 <h1 style="color:purple;text-align:center">Complaint Portal</h1>
 <br><br><br>
 <form action="addComplaint" method="post">
  	<h2>Enter your Name: <input type="text" name="cname"><br><br>
  		
  		Address(Crime Scene Place): <input type="text" name="caddress"><br><br>
  		
  		Pincode of Area (Crime Scene area pincode): <select name="pincode">
	  		<option>431104</option>
	  		<option>431007</option>
	  		<option>431008</option>
	  		<option>431121</option>
	  		<option>431110</option>
	  		<option>431134</option>
  		</select>
  		<br><br>
  		
  		Date of Crime (DD/MM/YYYY): <input type="date" name="cdate"><br><br>
  		
  		Mobile Number : <input type="text" name="mobile"><br><br>
  		
  		Complaint Type: <select name="ctype">
	  		<option>Missing person Complaint</option>
	  		<option>Drunk and Drive case</option>
	  		<option>Accident</option>
	  		<option>kidnapping case</option>
	  		<option>Annoying telephone calls</option>
	  		<option>Cruelty to Animals</option>
	  		<option>willful and malicious destruction of property</option>
	  		<option>Threatening by a criminal</option>
	  		<option>Other</option>
  		</select>
  		<br><br>
  		
  		Complaint Against(If accused is known) : <input type="text" name="criminal"><br><br>
  		
  		Complaint Description: <br><textarea id="w3review" name="description" rows="4" cols="50">
  	
  		</textarea>
  		
       <input type="submit" name="submit">
       
       
       </form>
       
       <br><br>
       				<a href="/">Back To Home</a>
</body>
</html>
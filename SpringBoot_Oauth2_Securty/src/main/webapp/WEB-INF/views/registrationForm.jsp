<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <style>
.center {
  text-align: center;
  border: 3px solid green;
}

input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

</style>
  
</head>
<body>

<div class="container-fluid">

<div class="row">
      <div class="col-sm-12 center" style="background-color:Black;">
      
      <font size="6"
          face="verdana"
          color="white">
          New Registration
        </font>
              
      </div>
            
 </div>

</div>

<hr>

<div class="container-fluid ">

<div class="row">
      
      <div class="col-sm-12 " style="background-color:white;">
     
      <div>
 <form:form action="/newRegistration" modelAttribute="newUser"  method="POST"  class="form-horizontal">
   
    <form:label path="fullname" for="fullname">Full Name</form:label>
    <form:input path="fullname" type="text" id="fullname" name="fullname" placeholder="Your Full name.."/>
    
    <form:label path="username" for="username">User Name</form:label>
    <form:input path="username" type="text" id="username" name="username" placeholder="Your Username.."/>
    
    <form:label path="password" for="password">Password</form:label>
    <form:input path="password" type="password" id="password" name="password" placeholder="Your Password name.."/>
    
    <form:label path="gender" for="gender">Gender</form:label>
    <form:input path="gender" type="text" id="gender" name="gender" placeholder="Your Gender name.."/>
    
    <form:label path="email" for="email">Email ID</form:label>
    <form:input path="email" type="text" id="email" name="email" placeholder="Your Email ID name.."/>
    
    <form:label path="mobileno" for="mobileno">Mobile Number</form:label>
    <form:input path="mobileno" type="text" id="mobileno" name="mobileno" placeholder="Your Mobile Number name.."/>
  

     
    <input type="submit" value="Submit">
  </form:form>
</div>
    

      </div>
            
</div>
 

</div>





</body>
</html>
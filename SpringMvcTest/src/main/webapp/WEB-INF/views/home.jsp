<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
         <h1>Welcome to spring MVC Application</h1>
          <%  String s = (String) request.getAttribute("Name"); 
           int i = (Integer)request.getAttribute("Id");
           int sal = (Integer)request.getAttribute("Salary");
           String c = (String) request.getAttribute("City");
          
           out.println("Emp ID:"+i+" "+"Emp Name:"+s+" "+"Emp Salary:"+sal+" "+"Emp City:"+c); 
       %> 
       
</body>
</html>
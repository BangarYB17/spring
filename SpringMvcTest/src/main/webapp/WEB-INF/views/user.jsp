<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h2>Registration Form</h2>
      <form  method='post'>
	<pre>
	     ID:
	        <input type="number" name="id">
		 Name:
		    <input type="text" name="name">
		 Email:
		    <input type="text" name="email">
		 City:
		    <input type="text" name="city"><br>
		    <input type="submit" formaction="result" value="result"><br>
		    <input type="submit" formaction="registerUser" value="register">
	</pre>
	</form>

</body>
</html>
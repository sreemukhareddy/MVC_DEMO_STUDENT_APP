<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage}</h1>
<form:errors path="student1.*"/>
<form action="submitadmissionform" method="POST">
	<table>
	<tr>
	<td>Name</td><td><input type="text" name="studentName"/></td>
	</tr>
	<tr>
	<td>Hobby</td><td><input type="text" name="studentHobby"/></td>
	</tr>
	<tr>
	<td>Mobile</td><td><input type="text" name="studentMobile"/></td>
	</tr>
	<!-- <tr>
	<td>DOB</td><td><input type="text" name="studentDOB"/></td>
	</tr> -->
	
	<tr>
	<td>Student's skills set:</td><td>   <select name="studentSkills" multiple>
										 <option value="corejava">CoreJava</option>
										 <option value="addvjava">addvJava</option>
										 <option value="tooljava">toolJava</option>
	                                     </select></td>
	</tr>
	</table>
	<table>
		<tr><td>Student's Address</td></tr>
		<tr>
			<td>country:<input typr="text" name="studentAddress.country"/></td>
			<td>city:<input typr="text" name="studentAddress.city"/></td>
			<td>street:<input typr="text" name="studentAddress.street"/></td>
			<td>pincode:<input typr="text" name="studentAddress.pincode"/></td>
		</tr>
	</table>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>
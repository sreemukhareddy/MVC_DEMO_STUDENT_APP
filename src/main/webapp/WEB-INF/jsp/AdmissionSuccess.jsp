<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Congratulations !! ${headerMessage}</h1>
<table>
<tr>
	<td>Student Name:</td>
	<td>${student1.studentName }</td>
</tr>

<tr>

	<td>Student Hobby:</td>
	<td>${student1.studentHobby }</td>
</tr>
<tr>
	<td>Student Mobile:</td>
	<td>${student1.studentMobile }</td>
</tr>

<tr>
	<td>Student Skills:</td>
	<td>${student1.studentSkills }</td>
</tr>

<tr>
	<td>Student Address:</td>
	<td>country: ${student1.studentAddress.country}</td>
	<td>city: ${student1.studentAddress.city}</td>
	<td>street: ${student1.studentAddress.street}</td>
	<td>pincode: ${student1.studentAddress.pincode}</td>
</tr>

</table>
</body>
</html>
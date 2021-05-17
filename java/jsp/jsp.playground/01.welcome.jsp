<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HelloWorld</title>
</head>
<body>
    <div>
    	<h1>Welcome Page</h1>
    	<h3>Server time on page load</h3>
    	<hr/>
    	<br/><br/><br/>
    	<hr/>
    	<h3> <%= new java.util.Date()  %> </h3>
    	
    	<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
		<div>formatted date: <%= df.format(new java.util.Date()) %> </div>
		
		<%java.text.DateFormat dt = new java.text.SimpleDateFormat("hh:mm:ss"); %>
		<div>formatted date: <%= dt.format(new java.util.Date()) %> </div>
		
		<!-- day in week -->
		<%java.text.DateFormat diw = new java.text.SimpleDateFormat("E"); %>
		<div>formatted date: <%= diw.format(new java.util.Date()) %> </div>

		<!-- day in week full name -->
		<%java.text.DateFormat diwf = new java.text.SimpleDateFormat("EEEE"); %>
		<div>formatted date: <%= diwf.format(new java.util.Date()) %> </div>

		<!-- date format -->
		<%java.text.DateFormat dmf = new java.text.SimpleDateFormat("[dd/MM/yyyy] - [hh:mm:ss:ms] - [EEEE]   "); %>
		<div>*** Date *** <%= dmf.format(new java.util.Date()) %> </div>
    </div>
</body>
</html>
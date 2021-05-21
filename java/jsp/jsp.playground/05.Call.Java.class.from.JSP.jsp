<%@page import="com.ofekbytes.jsp.MyUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>05.Call.Java.class.from.JSP</title>
</head>
<body>
    <div>
    	<h1>05.Call.Java.class.from.JSP</h1>
    	<hr/>
    	<br/><br/><br/>
    	<hr/>

		<div> Method Long calling >> :: toLowerCase :: <%= com.ofekbytes.jsp.MyUtils.strToLower("LONG-PATH")  %>  </div>
		
   	 	<div> Method Short calling >> TEST :: toLowerCase :: <%= MyUtils.strToLower("SHORT-PATH")  %> <div>
   	 
    </div>    	
</body>
</html>
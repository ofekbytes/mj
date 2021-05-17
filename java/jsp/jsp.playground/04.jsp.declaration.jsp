<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>04.jsp.declaration</title>
</head>
<body>
    <div>
    	<h1>04.jsp.declaration</h1>
    	<hr/>
    	<br/><br/><br/>
    	<hr/>
   	

   	<%!
		String strToLower(String data) {
   		return data.toLowerCase();
   	}
   	%>
   	
   	<div> 
   		<span> calling method <"strToLower(string)">" <%= strToLower("TO-LOWERCASE") %> </span>
   	</div>
   	


   	
    </div>    	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>03.jsp.scriptlet</title>
</head>
<body>
    <div>
    	<h1>03.jsp.scriptlet</h1>
    	<hr/>
    	<br/><br/><br/>
    	<hr/>
   	
   	<span>
   	<%
   	
   		int i;
   	
   		for (i = 0; i < 5; i++) {
   			out.println("<div> counter " + i + "</div>");
   			if (i == 3) {
   				out.print("<div>*****" + i + " is here*****</div>");
   			}
   		}
   	
   	%>
   	</span>
   	
    </div>    	
</body>
</html>
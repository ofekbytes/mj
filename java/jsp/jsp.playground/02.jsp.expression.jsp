<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>02.jsp.expression</title>
</head>
<body>
     <div>
    	<h1>02.jsp.expression</h1>
    	<hr/>
    	<br/><br/><br/>
    	<hr/>
   	
   		<div>
    	<span>lowercase to uppercase <br/><%= new String ("lowercase to uppercase").toUpperCase() %> </span>
    	</div>
    	
    	<br/>
    	<br/>   	
    	<div>
    	<span>Mathematical expression <br/>( (4 X 3) = <%= 4 * 3 %> )</span>
    	</div>

    	<br/>
    	<br/>   	
    	<div>
    	<span>Boolean expression is 5 bigger then 7 === <%= 5 > 7 %> </span>
    	</div>   	
    </div>    	
</body>
</html>
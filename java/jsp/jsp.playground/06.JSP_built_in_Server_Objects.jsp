<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HelloWorld</title>
</head>
<body>
    <div>
    	<h1>JSP built-in Server Objects</h1>
    	<hr/>
    	
    	<br/>
    	<!-- User Information Browser type and OS type -->
    	<span>Request user agent: <%= request.getHeader("User-Agent") %></span>   	
    	<hr/>
    	
    	<br/>
    	<!-- user language information  -->
    	<span>Request language: <%= request.getLocale() %> </span>
    	<hr/>
    </div>
</body>
</html>
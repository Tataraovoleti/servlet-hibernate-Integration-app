<%-- 
    Document   : index
    Created on : Jul 9, 2012, 8:57:58 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet Hibernate Integration</title>
        <script type="text/javascript" src="valid.js">
            
        </script>
    </head>
    <body background="images/temp1.jpg">
    <center>
        <br></br>
        <h2>Servlet with Hibernate</h2><br>
        <form name="f" action="./Integrate" method="post" onsubmit="return validate()">
            Search : <input type="text" name="no" /><input type="submit" value="Search" />
        </form>
        <div id="errors" style="display:none;"></div>
    </center>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 18/12/2019, 11:52:51 AM
    Author     : Eddie Pincay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Training Page</title>
    </head>
    <body>
        <h1>Enter your information</h1>
        <form action="PokeServlets" method="post">
            <p>Training Name : <input type="text" name="training"/></p>
            <p>Level : <input type="text" name="level"/></p>
            <p>Team : 
            <select name="team">
                <option value="Instinct">Instinct</option>
                <option value ="Valor" selected="true">Valor</option>
                <option value ="Mystic">Mystic</option>
            </select></p>
            <input type="submit" value="Send Request"/>
        </form>
    </body>
</html>

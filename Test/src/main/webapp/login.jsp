<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u=request.getParameter("un");
String p=request.getParameter("pwd");
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    Statement statement=con.createStatement();
    ResultSet set=statement.executeQuery("select * from login where name='"+u+"' and password='"+p+"'");
    if(set.next())
    {
        response.sendRedirect("welcome.jsp");
    }
    else
    {
        out.println("Invalid login Details");
        out.println("<a href='login.html'>please login again</a>");
}
}
catch(Exception e)
{
    System.out.println(e);
}
%>
</body>
</html>
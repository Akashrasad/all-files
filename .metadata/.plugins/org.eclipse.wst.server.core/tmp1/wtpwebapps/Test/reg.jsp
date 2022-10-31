<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    
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
String a=request.getParameter("add");
String z=request.getParameter("zip");




    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?)");
    ps.setString(1,u);
    ps.setString(2,p);
    ps.setString(3,a);
    ps.setString(4,z);
    int i=ps.executeUpdate();
    if(i>0)
    {
        response.sendRedirect("success.jsp");
    }
   



%>
</body>
</html>
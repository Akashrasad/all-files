<%@page import="java.sql.*"%>
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
System.out.println(u);
String p=request.getParameter("pwd");
System.out.println(p);
String a=request.getParameter("add");
System.out.println(a);
String pc=request.getParameter("pin");
System.out.println(pc);
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
    Statement statement=connection.createStatement();
    String query="insert into login('name','password','address','pincode') VALUES ('"+u+"', '"+p+"', '"+a+"', '"+pc+"') " ;
  //  INSERT INTO `student`.`login` (`name`, `password`, `address`, `zip`) VALUES ('ap', 'ap', 'ap', '123');

    int i=0;
    i=statement.executeUpdate(query);
    if(i!=0){
        response.sendRedirect("login.html");
    }
    else{
        response.sendRedirect("register.html");
    }
    
}
catch(Exception e){
    System.out.print(e);
}




%>

</body>
</html>
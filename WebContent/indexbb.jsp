<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                    <!-- Email -->
<%-- <%String E_Email_ID = request.getParameter("e_Email_ID"); %>
<jsp:useBean id="Email" scope="page" class="bean.Email"/>  
<% Email.email(E_Email_ID); %>
<%@page import="bean.IndexaaDAO"%>  --%>
<%@page import="bean.IndexaaDAO"%>   
<jsp:useBean id="obj" class="bean.IndexaaBean"/>  
  
<jsp:setProperty property="*" name="obj"/> 
 
 <%
int status=IndexaaDAO.Subscribe(obj);
/* if(status>0)  
	
	out.print("You are successfully enquired");  
else{
	out.print("not good");
} */
%>  
</body>
</html>
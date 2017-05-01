<%

String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");

System.out.println(userid + "," + pwd);
if (!(userid.equals("dov") && pwd.equals("test")))
	response.sendRedirect("login.html");
%>

<html>
<body>
Congratulations you are logged in....
</body>

</html>

<%@page import="java.util.*,java.util.Map.*" %>


<%
	HashMap<String,String> m = (HashMap<String,String>)session.getAttribute("guestlist");
	if (m == null) {
		  m = new HashMap<String,String>();
		  session.setAttribute("guestlist", m);
	}
	out.println("testing");
  String fName = request.getParameter("firstName");
  String lName = request.getParameter("lastName");
  m.put(fName, lName);
  
  Iterator < Entry<String, String> > i = m.entrySet().iterator();
  while (i.hasNext()) {
	  Entry <String,String> e = i.next();
	  out.println(e.getKey() + "==>" + e.getValue());
  }


%>


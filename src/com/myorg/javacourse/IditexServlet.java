package com.myorg.javacourse;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class IditexServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		int num1=4;
		int num2=7;
		int num3=3;
		int result=(num1+num3)*num2;
		String resultStr=new String("<h1>Result of "+"("+num1+"+"+num3+")"+"*"+num2+"="+result+"</h1>");
		resp.getWriter().println(resultStr);
		
	}
}

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class TestServlet extends HttpServlet { 

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException
    {
        // set header field first
        res.setContentType("text/html");
	String fname=req.getParameter("fname");	

        // then get the writer and write the response data
        PrintWriter out = res.getWriter();
	
        out.println("<HEAD><TITLE> SimpleServlet 	Output</TITLE></HEAD><BODY>");
        out.println("<h1> SimpleServlet Output </h1>");
        out.println("<P>Your name is" + fname);
	out.println("</BODY>");
	out.close();
    }
}
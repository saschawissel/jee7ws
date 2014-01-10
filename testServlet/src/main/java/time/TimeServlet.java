package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Test-Servlet showing current time.
 * 
 * @author sw
 */
@WebServlet(name="TimeServlet", urlPatterns={"/TimeServlet"} )
public class TimeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException 
	{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Actual Time</title></head>");
		out.println("<body><h1>"+new Date()+"</h1></body></html>");
		out.close();
	}
}

package filters;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



/**
 * Servlet Filter implementation class VisitorsLog
 */
@WebFilter("/ValidateServlet")
public class VisitorsLog implements Filter {

    /**
     * Default constructor. 
     */
    public VisitorsLog() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println(request.getParameter("username"));
		//File visitor = new File("D:/log.txt");
		PrintWriter pw = new PrintWriter("D:/log.txt");
		pw.print(request.getParameter("username"));
		pw.print(" logged at ");
		pw.print(new Date().toString());
		pw.flush();
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

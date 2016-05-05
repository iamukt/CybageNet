package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookReview
 */
@WebServlet("/BookReview")
public class BookReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookReview() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bookname = request.getParameter("bookname");
		HttpSession sess = request.getSession();
		sess.setAttribute("bookname", bookname);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Add Book Reveiw For");
		out.println();
		out.println("<form method='post' action='AddReview'>");
		out.println("<input type='text' name='review'>");
		out.println("<br><input type='submit' value='Add Review'");
		out.println("</form>");
		
	}

}

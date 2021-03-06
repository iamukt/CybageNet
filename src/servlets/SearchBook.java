package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.openpisces.Dasher;

import util.Database;

/**
 * Servlet implementation class RemoveBook
 */
@WebServlet("/SearchBook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookName = request.getParameter("bookname");
		try
		{
			response.setContentType("text/html");
			Database db = new Database();
			PreparedStatement pst = db.getCon().prepareStatement("select * from books where bookname like ?");
			pst.setString(1, bookName);
			ResultSet rst = pst.executeQuery();
			PrintWriter out = response.getWriter();
			out.println("<form method='post' action='BookReview'>");
			while(rst.next())
			{
			out.println("<input type='radio' name='bookname' value='"+rst.getString(1)+"'>");
			out.print("ISBN No: "+rst.getString(2)+
					"Book Name: "+rst.getString(1)+"  Author: "
					+rst.getString(3)+"  Location"
				    +rst.getString(4)+"  Review"
				    +rst.getString(5)
					);
			}
			out.println("<input type='submit' value='Add review'>");
			out.println("</form>");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

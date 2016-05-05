package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.PreparedStatement;

import util.Database;

/**
 * Servlet implementation class AddReview
 */
@WebServlet("/AddReview")
public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReview() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			HttpSession sess = request.getSession();
			String bookname = (String) sess.getAttribute("bookname");
			String review = request.getParameter("review");
			Database db = new Database();
			PreparedStatement pst = db.getCon().prepareStatement("Update"
					+ " books set reveiw = ? where bookname like ?");
			pst.setString(1, review);
			pst.setString(2, bookname);
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

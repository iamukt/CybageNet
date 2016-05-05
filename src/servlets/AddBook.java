package servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Database;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookName = request.getParameter("bookname");
		String author = request.getParameter("author");
		String location = request.getParameter("location");
		try
		{
			Database db = new Database();
			PreparedStatement pst1 = db.getCon().prepareStatement("insert into books (bookname,author,location) values (?,?,?)");
			pst1.setString(1, bookName);
			pst1.setString(2, author);
			pst1.setString(3, location);
			pst1.executeUpdate();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

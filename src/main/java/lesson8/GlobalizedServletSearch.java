package lesson8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GlobalizedServletSearch
 */
@WebServlet("/GlobalizedServletSearch")
public class GlobalizedServletSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalizedServletSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Locale locale = new Locale("de", "DE");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("locale/bundle", locale);

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>" + resourceBundle.getString("SearchTitle") + "</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='"+resourceBundle.getString("Flag")+"'></img>");
		out.println("<p>" + resourceBundle.getString("PromptLbl") + "</p>");
		out.println("<form name='SearchForm' action='SearchResults'>");
		out.println("<p> <input type='search' name='txtSearch' /> ");
		out.println("<p><input type='submit' name='btnSubmit' value='" + resourceBundle.getString("BtnSubmit") 
		 +"' />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}

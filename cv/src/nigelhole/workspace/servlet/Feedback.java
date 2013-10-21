package nigelhole.workspace.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feedback
 */
@WebServlet(name = "feedback", description = "Manages feedback from client", urlPatterns = { "/feedback" })
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    /**
     * Default constructor. 
     */
    public Feedback() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost called");
		Map<String,String[]> params = request.getParameterMap();
		for(Iterator<Entry<String,String[]>> i = params.entrySet().iterator(); i.hasNext(); )
		{
		    Entry<String,String[]> entry = i.next();
		    System.out.println(entry.getKey()+":"+entry.getValue()[0]);
		}
		RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/feedback.jsp");
        dispatcher.forward(request, response);
		
	}

}

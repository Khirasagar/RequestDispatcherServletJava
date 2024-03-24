package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/second")

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object name = (String)request.getAttribute("name");
		Object city = (String)request.getAttribute("city");
		
		System.out.println(name);//null	
		System.out.println(city);//null
		
		HttpSession session = request.getSession();
		String sessionName = (String)session.getAttribute("sessionName");
		String sessionCity = (String)session.getAttribute("sessionCity");
		System.out.println(sessionName);
		System.out.println(sessionCity);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object name = (String)request.getAttribute("name");
		Object city = (String)request.getAttribute("city");
		
		System.out.println(name);
		System.out.println(city);
		
		HttpSession session = request.getSession();
		String sessionName = (String)session.getAttribute("sessionName");
		String sessionCity = (String)session.getAttribute("sessionCity");
		System.out.println(sessionName);
		System.out.println(sessionCity);
		
	}

}

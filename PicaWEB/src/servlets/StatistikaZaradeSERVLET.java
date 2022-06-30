package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.StatistikaManager;

/**
 * Servlet implementation class StatistikaZaradeSERVLET
 */
@WebServlet("/StatistikaZaradeSERVLET")
public class StatistikaZaradeSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatistikaZaradeSERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StatistikaManager sm = new StatistikaManager();
		
		List<Object[]> listaZarade = sm.statistikaZarade();
		request.getSession().setAttribute("listaZarade", listaZarade);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/StatistikaZaradeJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

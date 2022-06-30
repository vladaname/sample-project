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
 * Servlet implementation class StatistikaProdajeBezLimita
 */
@WebServlet("/StatistikaProdajeBezLimita")
public class StatistikaProdajeBezLimita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatistikaProdajeBezLimita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StatistikaManager sm = new StatistikaManager();
		
		List<Object[]> podaci = sm.statistikaProdajeBezLimita();
		request.getSession().setAttribute("podaci", podaci);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/StatistikaProdajeBezLimitaJSP.jsp");
		rd.forward(request, response);
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

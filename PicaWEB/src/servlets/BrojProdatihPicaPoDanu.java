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
 * Servlet implementation class BrojProdatihPicaPoDanu
 */
@WebServlet("/BrojProdatihPicaPoDanu")
public class BrojProdatihPicaPoDanu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrojProdatihPicaPoDanu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/BrojProdatihPicaPoDanuJSP.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myselect = request.getParameter("myselect");
		int select = Integer.parseInt(myselect);
		
		StatistikaManager sm = new StatistikaManager();
		List<Object[]> lista = sm.statistikaZaradePoDanu(select);
		request.getSession().setAttribute("data", lista);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/BrojProdatihPicaPoDanuJSP.jsp");
		rd.forward(request, response);
		
	}

}

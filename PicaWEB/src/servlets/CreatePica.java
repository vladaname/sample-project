package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.PicaManager;

/**
 * Servlet implementation class CreatePica
 */
@WebServlet("/CreatePica")
public class CreatePica extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreatePica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/CreatePicaJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nazivPice = request.getParameter("nazivPice");
		String velicina = request.getParameter("velicina");
		String cena = request.getParameter("cena");
		int velicinaP = Integer.parseInt(velicina);
		int cenaP = Integer.parseInt(cena);

		String messageP = "";

		PicaManager pm = new PicaManager();
		if (pm.findByName(nazivPice) != null) {
			messageP += " pica postoji";
		}
		if (!messageP.equals("")) {
			request.getSession().setAttribute("messageP", "Greska" + messageP);
			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/CreatePicaJSP.jsp");
			rd.forward(request, response);
		} else {
			pm.createPica(cenaP, nazivPice, velicinaP);
			response.sendRedirect("ListaPica");
			return;
			// RequestDispatcher rd =
			// request.getServletContext().getRequestDispatcher("/ListaPicaJSP.jsp");
			// rd.forward(request, response);
		}
	}

}

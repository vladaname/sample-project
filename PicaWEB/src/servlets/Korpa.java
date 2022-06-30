package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.python.antlr.PythonParser.return_stmt_return;

import manager.KorpaManager;
import manager.StavkaManager;
import model.Korisnik;
import model.Pica;

/**
 * Servlet implementation class Korpa
 */
@WebServlet("/Korpa")
public class Korpa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Korpa() {
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
		KorpaManager km = new KorpaManager();
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");

		if (k == null) {
			response.sendRedirect("Login");
			return;
		}
		List<model.Korpa> listaKorpa = km.findAllKorpaByKorisnik(k.getIdkorisnik());
		request.getSession().setAttribute("listaKorpa", listaKorpa);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/KorpaJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
		if (k == null) {
			response.sendRedirect("Login");
			return;
		}
		String adresa = request.getParameter("adresa");

//		KorpaManager km = new KorpaManager();

		StavkaManager sm = new StavkaManager();
		boolean kupi = sm.kupi(k.getIdkorisnik(), adresa);
		
		int racun = sm.korpaRacun(k.getIdkorisnik());
		request.getSession().setAttribute("racun", racun);
		
		response.sendRedirect("StavkaServlet");
		return;
//
//		List<model.Korpa> listaKorpa = km.findAllKorpaByKorisnik(k.getIdkorisnik());
//		request.getSession().setAttribute("listaKorpa", listaKorpa);
//		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/KorpaJSP.jsp");
//		rd.forward(request, response);

	}

}

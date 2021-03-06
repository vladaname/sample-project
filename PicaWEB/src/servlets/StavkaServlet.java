package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.KorpaManager;
import manager.RacunManager;
import manager.StavkaManager;
import model.Korisnik;
import model.Stavka;

/**
 * Servlet implementation class StavkaServlet
 */
@WebServlet("/StavkaServlet")
public class StavkaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StavkaServlet() {
        super();
        // TODO Auto-generated constructor stublistaStavki
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		KorpaManager km = new KorpaManager();
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");

		if (k == null) {
			response.sendRedirect("Login");
			return;
		}
		List<model.Korpa> listaKorpa = km.findAllKorpaByKorisnik(k.getIdkorisnik());
		request.getSession().setAttribute("listaKorpa", listaKorpa);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/StavkaJSP.jsp");
		rd.forward(request, response);
		StavkaManager sm = new StavkaManager();
		boolean brisiKorpu = sm.removeKorpa(k.getIdkorisnik());
		int racunBrisanje = sm.korpaRacun(0);
		request.getSession().setAttribute("racun", racunBrisanje);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
//		String kolicina = request.getParameter("kolicina");
//		String idpica = request.getParameter("idpica");
//		int kolicinaP = Integer.parseInt(kolicina);
//		int idpicaP = Integer.parseInt(idpica);
//		
//		StavkaManager sm = new StavkaManager();
//		boolean kreirajStavku = sm.createStavka(kolicinaP, idpicaP);
//		if(kreirajStavku) {
//			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/StavkaJSP.jsp");
//			rd.forward(request, response);
//		}
//		else {
//			response.sendRedirect("Korpa");
//		}
	}

}

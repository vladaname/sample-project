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
import model.Korisnik;

/**
 * Servlet implementation class KorpaBrisanjeIdkorpaServlet
 */
@WebServlet("/KorpaBrisanjeIdkorpaServlet")
public class KorpaBrisanjeIdkorpaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KorpaBrisanjeIdkorpaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
		if(k == null) {
			response.sendRedirect("Login");
			return;
		}
		
		String idkorpa = request.getParameter("idkorpa");
		int idK = Integer.parseInt(idkorpa);
		KorpaManager km = new KorpaManager();
		if(idK != 0) {
			boolean brisanjeIdK = km.deleteStavkaUKorpi(idK);
		}
		
		List<model.Korpa> listaKorpa = km.findAllKorpaByKorisnik(k.getIdkorisnik());
		request.getSession().setAttribute("listaKorpa", listaKorpa);
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/KorpaJSP.jsp");
		rd.forward(request, response);
	}

}

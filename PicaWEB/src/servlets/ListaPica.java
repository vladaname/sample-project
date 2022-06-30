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
import manager.PicaManager;
import model.Korisnik;
import model.Pica;

/**
 * Servlet implementation class ListaPica
 */
@WebServlet("/ListaPica")
public class ListaPica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaPica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PicaManager pm = new PicaManager();
		List<Pica> listaPica = pm.findAllPica();
		request.getSession().setAttribute("listaPica", listaPica);
//		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/ListaPicaJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String idkorisnik = request.getParameter("idkorisnik");
		Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
		String idpica = request.getParameter("idpica");
		String nazivPice = request.getParameter("nazivPice");
//		String velicina = request.getParameter("velicina");
//		String cena = request.getParameter("cena");
//		int idK = Integer.parseInt(idkorisnik);
		int idP = Integer.parseInt(idpica);
//		int velicinaP = Integer.parseInt(velicina);
//		int cenaP = Integer.parseInt(cena);
//		System.out.println(idK);
		String kolicina = request.getParameter("kolicina");
		int kolicinaP = Integer.parseInt(kolicina);
		
		KorpaManager km = new KorpaManager();
		
		boolean korpa = km.ubaciUKorpu(k.getIdkorisnik(), idP, kolicinaP);
		if(korpa) {
			request.getSession().setAttribute("message", "Pica je ubacena u korpu");
			response.sendRedirect("Korpa");
			return;
			
//			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/KorpaJSP.jsp");
//			rd.forward(request, response);
		}
		
		
	}

}

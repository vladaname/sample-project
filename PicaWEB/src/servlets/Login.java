package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.KorisnikManager;
import manager.PicaManager;
import model.Korisnik;
import model.Pica;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/LoginJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		KorisnikManager km = new KorisnikManager();
		Korisnik k = km.login(username, pass);
		
		if(k != null) {
			request.getSession().setAttribute("korisnik", k);
			
//			PicaManager pm = new PicaManager();
//			List<Pica> listaPica = pm.findAllPica();
//			request.getSession().setAttribute("listaPica", listaPica);
//			Korisnik k = (Korisnik) request.getSession().getAttribute("korisnik");
			
			response.sendRedirect("ListaPica");
			return;
//			
//			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/ListaPicaJSP.jsp");
//			rd.forward(request, response);
		}
		else {

			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/LoginJSP.jsp");
			rd.forward(request, response);
		}
		
		
	}

}

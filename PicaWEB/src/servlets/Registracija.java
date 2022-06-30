package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.KorisnikManager;
import model.Korisnik;

/**
 * Servlet implementation class Registracija
 */
@WebServlet("/Registracija")
public class Registracija extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registracija() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/RegistracijaJSP.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String adresa = request.getParameter("adresa");
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String passConfirm = request.getParameter("passConfirm");
		
		String message = "";
		
		if(!pass.equals(passConfirm)) {
			message+=" ponovi password!";
		}
		
		KorisnikManager km = new KorisnikManager();
		
			if(km.findbyemail(email) != null) {
				message+= " email postoji!";
			}
		
			if(km.findByTel(tel) != null) {
				message+=" telefon postoji!";
			}
		
		if(!message.equals("")) {
			request.getSession().setAttribute("message", "Dogodila se greska:" + message );
			RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/RegistracijaJSP.jsp");
			rd.forward(request, response);
		}
		else {
		km.createKorisnk(email, ime, prezime, tel, username, pass, adresa);
//		response.sendRedirect(request.getContextPath() + "/LoginJSP.jsp");
		
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/LoginJSP.jsp");
		rd.forward(request, response);
		}

	}

}


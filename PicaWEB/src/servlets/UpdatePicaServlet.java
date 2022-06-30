package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.PicaManager;
import model.Pica;

/**
 * Servlet implementation class UpdatePicaServlet
 */
@WebServlet("/UpdatePicaServlet")
public class UpdatePicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePicaServlet() {
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
		
		RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/UpdatePica.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String idpica = request.getParameter("idpica");
		int idP = Integer.parseInt(idpica);
		String cena = request.getParameter("cena");
		int cenaP = Integer.parseInt(cena);
		System.out.println(idpica);
		System.out.println(cena);

		
		PicaManager pm = new PicaManager();
		boolean updateCena = pm.updatePica(idP, cenaP);
		
		List<Pica> listaPica = pm.findAllPica();
		request.getSession().setAttribute("listaPica", listaPica);
		
	}

}

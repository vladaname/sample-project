package filters;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import model.Korisnik;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter(filterName = "/Filter", urlPatterns = {"/CreatePica/*", "/StatistikaServlet/*", "/StatistikaZaradeSERVLET/*"})
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
    public Filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("U filteru");
		if (((HttpServletRequest) request).getSession().getAttribute("korisnik") != null) {
			Korisnik k = (Korisnik) (((HttpServletRequest) request).getSession().getAttribute("korisnik"));
			if (k.getUloga().getNazivUloge().equals("kontrolor")) {

				chain.doFilter(request, response);
			} else {
				request.getRequestDispatcher("/KontrolorPristupaStraniciSERVLET").forward(request, response);
			}

		} else {
			request.getRequestDispatcher("/Login").forward(request, response);
		}
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

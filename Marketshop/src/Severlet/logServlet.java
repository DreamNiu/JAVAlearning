package Severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.EmployeeDao;
import Dao.LogginDao;
import LOG.Employee;
import LOG.Loggin;
import LOG.VIP;

/**
 * Servlet implementation class logServlet
 */
@WebServlet("/logServlet")
public class logServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LogginDao log = new LogginDao();
	EmployeeDao em = new EmployeeDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public logServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		if (deleteFromCart(request, response)) {
			if (checkQuan(request, response)) {
				request.getRequestDispatcher("/first.jsp").forward(request,
						response);
			} else {
				if (checkQuans(request, response)) {
					request.getRequestDispatcher("/sell.jsp").forward(request,
							response);
				} else {
					request.getRequestDispatcher("/second.jsp").forward(
							request, response);
				}
			}
		} else {
			request.getRequestDispatcher("/regfailure.jsp").forward(request,
					response);
		}

	}

	private boolean deleteFromCart(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("e_id");
		String ps = request.getParameter("e_passwd");
		Loggin l = log.getLoggin(id);
		Employee e = em.getEMPByID(id);
		HttpSession session = request.getSession();
		session.setAttribute("username", e.getE_NAME());
		if (l != null) {
			if (l.getE_PASSWD().equals(ps)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	private boolean checkQuan(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("e_id");
		Loggin l = log.getLoggin(id);
		if (l != null) {
			if (l.getE_QUAN().equals("manager")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	private boolean checkQuans(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("e_id");
		Loggin l = log.getLoggin(id);
		if (l != null) {
			if (l.getE_QUAN().equals("seller")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}

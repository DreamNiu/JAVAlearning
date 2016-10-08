package Severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import LOG.Employee;
import LOG.Loggin;
import Dao.EmployeeDao;
import Dao.LogginDao;
/**
 * Servlet implementation class delEMServlet
 */
@WebServlet("/delEMServlet")
public class delEMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String action;
	private EmployeeDao em = new EmployeeDao();
	private LogginDao log = new LogginDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delEMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(request.getParameter("action")!=null)
		{
			this.action = request.getParameter("action");
			if(action.equals("delete")) //如果是执行删除购物车中的商品
			{
				if(deleteFromCart(request,response))
				{
					request.getRequestDispatcher("/employ.jsp").forward(request, response);
				}
				else
				{
					request.getRequestDispatcher("/employ.jsp").forward(request, response);
				}
			}
		}
	}
	private boolean deleteFromCart(HttpServletRequest request, HttpServletResponse response)
	{
		String id = request.getParameter("id");
	    Employee e = em.DeleteEM(id);
	    Loggin l = log.Delete(id);
		return true;
	   
	}
}

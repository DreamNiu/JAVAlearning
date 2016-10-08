package Severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CartDao;
import Dao.GoodsDao;
import Dao.SellDao;
import LOG.Cart;
import LOG.Goods;
import LOG.Sell;

/**
 * Servlet implementation class SellServlet
 */
@WebServlet("/SellServlet")
public class SellServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SellDao sell = new SellDao();
	private GoodsDao good = new GoodsDao();
	private CartDao cart = new CartDao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
		
		if (addToCart(request, response)) {
			request.getRequestDispatcher("/sell.jsp")
					.forward(request, response);
		} 
		else{
			request.getRequestDispatcher("/index.jsp").forward(request,response);
		}

	}

	// 添加商品进购物车的方法
	private boolean addToCart(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("s_id");
		Double num = Double.parseDouble(request.getParameter("s_num"));
		String time = request.getParameter("time");
		String e_id = request.getParameter("e_id");
		Goods g = good.getGoodsByID(id);
		if(g!=null){
			Double total = g.getS_SELLPRICE()*num;
			Double profit = (g.getS_SELLPRICE()-g.getS_PRICE())*num;
			Sell s = sell.Save(id, g.getS_NAME() ,g.getS_SELLPRICE(), num,total );
			Cart c = cart.Save(id, g.getS_NAME(),g.getS_PRICE(),g.getS_SELLPRICE(), num, total, profit, time, e_id);
			return true;
		}
		else{
			return false;
		}
	}

}

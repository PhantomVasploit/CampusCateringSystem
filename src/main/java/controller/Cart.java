package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;

@WebServlet("/cart")
public class Cart extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Order order = (Order) req.getAttribute("order");
		req.setAttribute("order", order);
		RequestDispatcher rd = req.getRequestDispatcher("Cart.jsp");
		rd.forward(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		// set request attribute storing the confirmed orders
		res.sendRedirect("/orders");
	}
}
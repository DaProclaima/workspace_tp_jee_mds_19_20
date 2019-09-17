package fr.mds.supcommerce.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.supcommerce.dao.ProductDAO;
import fr.mds.supcommerce.model.Product;

@SuppressWarnings("serial")
public class InsertSomeProductServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Product product = new Product();
		ProductDAO productDAO = new ProductDAO();
		
		System.out.println("InsertSomeProductServlet - doPost");
		resp.getWriter().println("InsertSomeProductServlet - doPost");
	
		
		product.setName((req.getParameter("name")));	
		product.setDescription((req.getParameter("descritpion")));
		product.setPrice(( Float.parseFloat((req.getParameter("price")))));
//			
//		

//		resp.getWriter().println("Product " + product.getId() + " is to be pushed in DB");
//		resp.getWriter().println();
		productDAO.addProduct(product);
		resp.getWriter().println("Product " + product.getId() + " is pushed in DB");
		resp.getWriter().println();
	}
}

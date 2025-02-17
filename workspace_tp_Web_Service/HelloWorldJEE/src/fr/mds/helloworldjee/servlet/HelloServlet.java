package fr.mds.helloworldjee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial") //Cut in several slices bytes the object Description Resource Path Location Type The serializable class HelloServlet does not declare a static final serialVersionUID field of type long	HelloServlet.java	/HelloWorldJEE/src/fr/mds/helloworldjee/servlet	line 6	Java Problem

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("HelloServlet - doGet"); // better than writting "toto" in order to catch buggs fast.
		
		String userName = req.getParameter("name");

		resp.getWriter().println("Hello World - GET " + userName);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("HelloServlet - doPost");
		
		resp.getWriter().println("Hello World - POST");
	}


}

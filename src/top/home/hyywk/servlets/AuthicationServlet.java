package top.home.hyywk.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import top.home.hyywk.entity.User;
import top.home.hyywk.util.AuthicationUtil;

@WebServlet( name = "authication", urlPatterns = "/auth")
public class AuthicationServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4914030794907019172L;

	private String testUsername = "admin";
	private String testPasswd = "admin";
	private String testName = "����";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println( "�յ�auth����" );
		String username = req.getParameter("username");
		String passwd = req.getParameter("passwd");
		if ( testUsername.equals( username ) && testPasswd.equals( passwd )) {
			req.getSession().setAttribute(AuthicationUtil.USER_KEY , new User(username, passwd, testName ));
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else {
			req.setAttribute("error", "�˻��������");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}

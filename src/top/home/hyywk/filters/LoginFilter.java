package top.home.hyywk.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import top.home.hyywk.entity.User;
import top.home.hyywk.util.AuthicationUtil;

@WebFilter(urlPatterns="*")
public class LoginFilter implements Filter {
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest)request; 
		HttpSession session = hsr.getSession();
		User user = (User)session.getAttribute( AuthicationUtil.USER_KEY );
		if ( user != null || hsr.getRequestURI().equals("/login_module/auth") ) {
				chain.doFilter(request, response);
				return ;
		}
		request.getRequestDispatcher("./login.jsp").forward(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

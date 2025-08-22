package baitapthuchanh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
    	//lấy dữ liệu từ tham số của form
    	String user = req.getParameter("username");
    	String pass = req.getParameter("password");
    	if(user.equals("trung") && pass.equals("123"))
    	{
    		Cookie cookie = new Cookie("username", user);
    		cookie.setMaxAge(30);
    		//thêm cookie vào response
    		resp.addCookie(cookie);
    		//chuyển sang trang HelloServlet
    		resp.sendRedirect("/Baitap01/HelloServlet");
    		}else {
    		//chuyển sang trang LoginServlet
    		resp.sendRedirect("/login.html");
    		
    	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}


package com.henu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.henu.factory.DaoFactory;

/**
 * Servlet implementation class ChangeAdminPwd
 */
@WebServlet("/ChangeAdminPwd")
public class ChangeAdminPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangeAdminPwd() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("masterId");
		String old = request.getParameter("oldpwd");
		String newPwd = request.getParameter("newPwd1");
		String newPwd2 = request.getParameter("newPwd2");
		String oldpwd = DaoFactory.getManagerDaoImpl().getPassword(username);
		int i = 0;
		if (!old.equals(oldpwd)) {
			session.setAttribute("error", "<script> alert('密码错误!')</script>");
		} else {
			if (!newPwd.equals(newPwd2)) {
				session.setAttribute("error", "<script> alert('两次密码不一致!')</script>");
			} else {
				i = DaoFactory.getManagerDaoImpl().changePwd(username, newPwd);
			}
		}
	
		if (i > 0) {
			session.setAttribute("success", "<script> alert('修改成功！')</script>");
		}
		
		response.sendRedirect("admin/admin_changePwd.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

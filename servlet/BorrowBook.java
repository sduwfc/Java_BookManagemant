package com.henu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.henu.bean.Book;
import com.henu.bean.Info;
import com.henu.factory.DaoFactory;

/**
 * Servlet implementation class BorrowBook
 */
@WebServlet("/BorrowBook")
public class BorrowBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrowBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("studentId");
		String bookname = request.getParameter("bookname");
		int count = Integer.parseInt(request.getParameter("counts"));
		int day = Integer.parseInt(request.getParameter("days"));
		String date = request.getParameter("date");
		Book book = DaoFactory.getBookDaoImpl().book(bookname);
		Info info = new Info(id,bookname,book.getType(),date,day,count);
		
		if(DaoFactory.getInfoDaoImpl().isBorrow(id, bookname)){
			session.setAttribute("error", "<script> alert('你已借过此书!') </script>");
			response.sendRedirect("student/student_lend.jsp");
		}else{
			if(DaoFactory.getBookDaoImpl().isEnough(bookname, count)){
				if(DaoFactory.getInfoDaoImpl().add(info)){
					//相应书籍数量减少
					DaoFactory.getBookDaoImpl().changeCount(bookname, count, "jie");
					session.setAttribute("success", "<script> alert('借书成功!') </script>");
					request.getRequestDispatcher("ShowBookInfo").forward(request, response);
				}
			}else{
				session.setAttribute("error", "<script> alert('数量不足!') </script>");
				response.sendRedirect("student/student_lend.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

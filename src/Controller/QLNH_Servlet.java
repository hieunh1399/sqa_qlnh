package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Account;
import Model.CauHinh_Gui;
import Model.CauHinh_Vay;
import Model.Customer_Loan;
import Model.Customer_Saving;
import java.util.List;

/**
 * Servlet implementation class QLNH_Servlet
 */
@WebServlet("/")
public class QLNH_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Customer_LoanDAOImpl customer_LoanDAO;
	private CauHinh_VayDAOImpl cauHinhVayDAO;
	private Customer_SavingDAOImpl customer_SavingDAO;
	private CauHinh_GuiDAOImpl cauHinhGuiDAO;
	private AccountDAOImpl accountDAO;
	HttpSession session;
	public void init() {
		customer_LoanDAO = new Customer_LoanDAOImpl();
		cauHinhVayDAO = new CauHinh_VayDAOImpl();
		customer_SavingDAO = new Customer_SavingDAOImpl();
		cauHinhGuiDAO = new CauHinh_GuiDAOImpl();
		accountDAO = new AccountDAOImpl();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/login":
				showLoginform(request, response);
				break;
			case "/checklogin":
				checkLogin(request, response);
				break;
			case "/home":
				home(request, response);
				break;
			case "/listKHV":
				showListCus(request, response);
				break;
			case "/listKHG":
				showListCusG(request, response);
				break;
			case "/searchKHV":
				searchCus(request, response);
				break;
			case "/searchKHG":
				searchCusG(request, response);
				break;
			case "/chitietKHV":
				chiTietCus(request, response);
				break;
			case "/chitietKHG":
				chiTietCusG(request, response);
				break;
			case "/listCH":
				//checkAlreadyLoggedIn(request, response);
				showListCH(request, response);
				break;
			case "/chitietCH":
				chitietCH(request, response);
				break;
			case "/editCH":
				editCH(request, response);
				break;
			case "/listCHG":
				showListCHG(request, response);
				break;
			case "/chitietCHG":
				chitietCHG(request, response);
				break;
			case "/editCHG":
				editCHG(request, response);
				break;
			case "/logout":
				logout(request, response);
				break;
			case "/customer-loan-report":
				showListReport(request, response);
				break;
			case "/excel-report":
				Report(request, response);
				break;
			case "/customer-saving-report":
				showListReportG(request, response);
				break;
			case "/excel-report-saving":
				ReportG(request, response);
				break;
			default:
				showLoginform(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void chitietCHG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		CauHinh_Gui chg = cauHinhGuiDAO.getCHGById(id);
		request.setAttribute("chg", chg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ChiTietCauHinhGui.jsp");
		dispatcher.forward(request, response);

	}

	private void showListCHG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<CauHinh_Gui> lstchg = cauHinhGuiDAO.lstCHG();
		request.setAttribute("lstchg", lstchg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/CauHinhGui.jsp");
		dispatcher.forward(request, response);

	}

	private void showLoginform(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login-form.jsp");
		dispatcher.forward(request, response);

	}

	private void checkLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Account account = new Account(username, password);
			account.setUsername(username);
			account.setPassword(password);
			
			if (accountDAO.checkLogin(account) == true) {
				HttpSession session = request.getSession(false);
				session.setAttribute("acc", account);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.jsp");
				dispatcher.forward(request, response);
			} else if (username.length() == 0) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login-form.jsp");
				String mistake = "*Bạn phải nhập tên tài khoản ";
				request.setAttribute("mistake", mistake);
				requestDispatcher.forward(request, response);
			} else if (password.length() < 5) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login-form.jsp");
				String mistake = "*Mật khẩu phải trên 5 ký tự";
				request.setAttribute("mistakeP", mistake);
				requestDispatcher.forward(request, response);
			} else if (password.length() == 0) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login-form.jsp");
				String mistake = "*Bạn phải nhập mật khẩu ";
				request.setAttribute("mistakeP", mistake);
				requestDispatcher.forward(request, response);
			} else {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login-form.jsp");
				String mistake = "Tài khoản hoặc mật khẩu không chính xác";
				request.setAttribute("mistake", mistake);
				requestDispatcher.forward(request, response);
			}
		} finally {
			out.close();
		}

	}

	private void chiTietCusG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		Customer_Saving cusg = customer_SavingDAO.getCusSavingById(id);
		request.setAttribute("cusg", cusg);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ChiTietKHGui.jsp");
		dispatcher.forward(request, response);

	}

	private void searchCusG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String key = request.getParameter("key");
		List<Customer_Saving> listCus = customer_SavingDAO.lstCusByKey(key);
		request.setAttribute("listCus", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DanhSachKhachHangGui.jsp");
		dispatcher.forward(request, response);

	}

	private void showListCusG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Saving> listCusG = customer_SavingDAO.lstCusG();
		request.setAttribute("listCusG", listCusG);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DanhSachKhachHangGui.jsp");
		dispatcher.forward(request, response);

	}

	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.jsp");
		dispatcher.forward(request, response);

	}

	private void chiTietCus(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		Customer_Loan cus = customer_LoanDAO.getCusLoanById(id);
		request.setAttribute("cus", cus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ChiTietKHVay.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
	}

	private void showListCus(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Loan> listCus = customer_LoanDAO.lstCus();
		request.setAttribute("listCus", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DanhSachKhachHangVay.jsp");
		dispatcher.forward(request, response);
	}

	private void searchCus(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String key = request.getParameter("key");
		List<Customer_Loan> listCus = customer_LoanDAO.lstCusByKey(key);
		request.setAttribute("listCus", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DanhSachKhachHangVay.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showListReport(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Loan> listCus = customer_LoanDAO.lstCusReport();
		request.setAttribute("listCusR", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BaoCaoVayNo.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showListReportG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Saving> listCus = customer_SavingDAO.lstCusGReport();
		request.setAttribute("listCusGR", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BaoCaoGuiTK.jsp");
		dispatcher.forward(request, response);
	}
	
	private void Report(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Loan> listCus = customer_LoanDAO.lstCusReport();
		request.setAttribute("listCusR", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ExcelReport.jsp");
		dispatcher.forward(request, response);
	}
	
	private void ReportG(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Customer_Saving> listCus = customer_SavingDAO.lstCusGReport();
		request.setAttribute("listCusGR", listCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ExcelReportSaving.jsp");
		dispatcher.forward(request, response);
	}

	private void editCH(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		float soTien = Float.parseFloat(request.getParameter("soTienToiDa"));
		int thoiHan = Integer.parseInt(request.getParameter("thoiHan"));
		float laiSuat = Float.parseFloat(request.getParameter("laiSuat"));
		CauHinh_Vay chv = new CauHinh_Vay(id,soTien,thoiHan, laiSuat);
		cauHinhVayDAO.updateCHV(chv);
		response.sendRedirect("listCH");
	}
	private void editCHG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		float soTien = Float.parseFloat(request.getParameter("soTienGui"));
		int thoiHan = Integer.parseInt(request.getParameter("kyHan"));
		float laiSuat = Float.parseFloat(request.getParameter("laiSuat"));
		CauHinh_Gui chg = new CauHinh_Gui(id,soTien,thoiHan, laiSuat);
		cauHinhGuiDAO.updateCHG(chg);
		response.sendRedirect("listCHG");
	}

	private void chitietCH(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		CauHinh_Vay chv = cauHinhVayDAO.getCHVById(id);
		request.setAttribute("chv", chv);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ChiTietCauHinhVay.jsp");
		dispatcher.forward(request, response);
	}

	private void showListCH(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<CauHinh_Vay> lstchv = cauHinhVayDAO.lstCHV();
		request.setAttribute("lstchv", lstchv);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/CauHinhVay.jsp");
		dispatcher.forward(request, response);
	}
	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();
			session.invalidate();
			RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/login-form.jsp");
			dispatcher.forward(request, response);
		}finally {
			out.close();
		}	
	}
	
//	private void checkAlreadyLoggedIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(false);
//        Account sessionTaiKhoan = (Account) session.getAttribute("CEO");
//
//        if (sessionTaiKhoan == null) {
//            RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
//            dispatcher.forward(request, response);
//        }
//    }
	
}

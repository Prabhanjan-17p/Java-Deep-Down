//package Class_Code_Note.basic;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//
///**
// * Servlet implementation class SecondServlet
// */
//@WebServlet("/second")
//public class SecondServlet extends GenericServlet {
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * @see GenericServlet#GenericServlet()
//     */
//    public SecondServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see Servlet#service(ServletRequest request, ServletResponse response)
//	 */
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter pw = response.getWriter();
//		pw.print("<html>\r\n"
//				+ "<body>\r\n"
//				+ "\r\n"
//				+ "<h1 style=\"background-color:Tomato;\">Tomato</h1>\r\n"
//				+ "<h1 style=\"background-color:Orange;\">Orange</h1>\r\n"
//				+ "<h1 style=\"background-color:DodgerBlue;\">DodgerBlue</h1>\r\n"
//				+ "<h1 style=\"background-color:MediumSeaGreen;\">MediumSeaGreen</h1>\r\n"
//				+ "<h1 style=\"background-color:Gray;\">Gray</h1>\r\n"
//				+ "<h1 style=\"background-color:SlateBlue;\">SlateBlue</h1>\r\n"
//				+ "<h1 style=\"background-color:Violet;\">Violet</h1>\r\n"
//				+ "<h1 style=\"background-color:LightGray;\">LightGray</h1>\r\n"
//				+ "\r\n"
//				+ "</body>\r\n"
//				+ "</html>");
//	}
//
//}

//package Class_Code_Note.basic;
////Program to display current time.
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalTime;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//
///**
// * Servlet implementation class TimeServlet
// */
//@WebServlet("/time")
//public class TimeServlet extends GenericServlet {
//
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		LocalTime lt = LocalTime.now();
//		PrintWriter pw = response.getWriter();
//
//		   pw.println("<!DOCTYPE html>");
//		    pw.println("<html lang='en'>");
//		    pw.println("<head>");
//		    pw.println("<meta charset='UTF-8'>");
//		    pw.println("<title>Visit Counter with Time</title>");
//		    pw.println("<style>");
//		    pw.println("  body { font-family: Arial, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; align-items: center; height: 100vh; }");
//		    pw.println("  .container { background: #fff; padding: 30px 50px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); text-align: center; }");
//		    pw.println("  h1 { color: #2c3e50; }");
//		    pw.println("  p { color: #555; font-size: 18px; }");
//		    pw.println("</style>");
//		    pw.println("</head>");
//		    pw.println("<body>");
//		    pw.println("  <div class='container'>");
//		    pw.println("    <p>Current time: " + lt + "</p>");
//		    pw.println("  </div>");
//		    pw.println("</body>");
//		    pw.println("</html>");
//	}
//
//}

//package Class_Code_Note.basic;
//// Servlet program to count the number of visit time in web-browser
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//
//@WebServlet("/count")
//public class CounterServlet extends GenericServlet {
//	int count =0;
//
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		PrintWriter pw = response.getWriter();
//		count++;
//
//		pw.println("<!DOCTYPE html>");
//		pw.println("<html lang='en'>");
//		pw.println("<head>");
//		pw.println("<meta charset='UTF-8'>");
//		pw.println("<title>Visit Counter</title>");
//		pw.println("<style>");
//		pw.println("  body { font-family: Arial, sans-serif; background-color: #f0f0f0; display: flex; justify-content: center; align-items: center; height: 100vh; }");
//		pw.println("  .container { background: #fff; padding: 40px; border-radius: 12px; box-shadow: 0 0 10px rgba(0,0,0,0.1); text-align: center; }");
//		pw.println("  h1 { color: #333; }");
//		pw.println("</style>");
//		pw.println("</head>");
//		pw.println("<body>");
//		pw.println("  <div class='container'>");
//		pw.println("    <h1>You visited : " + count + " time" + (count > 1 ? "s" : "") + ".</h1>");
//		pw.println("  </div>");
//		pw.println("</body>");
//		pw.println("</html>");
//
//	}
//
//}

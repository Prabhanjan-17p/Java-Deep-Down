//package Class_Code_Note.basic;
////WAP program to print 5 table multiplication
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//
//@WebServlet("/table")
//public class TableServlet extends GenericServlet {
//
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		PrintWriter pw = response.getWriter();
//
//		 pw.print("<!DOCTYPE html>");
//		    pw.print("<html lang='en'>");
//		    pw.print("<head>");
//		    pw.print("<meta charset='UTF-8'>");
//		    pw.print("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
//		    pw.print("<title>Multiplication Table of 5</title>");
//		    pw.print("<style>");
//		    pw.print("body { font-family: Arial, sans-serif; background-color: #f4f4f4; display: flex; justify-content: center; padding-top: 50px; }");
//		    pw.print("table { border-collapse: collapse; background-color: white; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
//		    pw.print("td { border: 1px solid #333; padding: 10px 20px; text-align: center; font-size: 18px; }");
//		    pw.print("th { background-color: #007BFF; color: white; padding: 10px; font-size: 20px; }");
//		    pw.print("</style>");
//		    pw.print("</head>");
//		    pw.print("<body>");
//
//		    pw.print("<table>");
//		    pw.print("<tr><th colspan='5'>Multiplication Table of 5</th></tr>");
//
//		    for (int i = 1; i <= 10; i++) {
//		        pw.print("<tr>");
//		        pw.print("<td>5</td>");
//		        pw.print("<td>X</td>");
//		        pw.print("<td>" + i + "</td>");
//		        pw.print("<td>=</td>");
//		        pw.print("<td>" + (i * 5) + "</td>");
//		        pw.print("</tr>");
//		    }
//
//		    pw.print("</table>");
//		    pw.print("</body>");
//		    pw.print("</html>");
//	}
//
//}

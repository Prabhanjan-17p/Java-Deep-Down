//package Class_Code_Note.basic;
////Program to display image in browser.
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.Servlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletOutputStream;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//
//@WebServlet("/image")
//public class ImageServlet extends GenericServlet {
//
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		ServletOutputStream sos = response.getOutputStream();
//
//		FileInputStream fis = new FileInputStream("D:/Test/testimg.jpg"); // It is write for file read case
//		int n = fis.available(); // It will find the memory size of the given image
//		byte [] b = new byte[n]; // Memory allocated in RAM
//		fis.read(b); //Data came to RAM
//		sos.write(b); // Send to the browser
//	}
//
//}

package Class_Code_Note;
/*
Servlet Redirecting
------------------------
    - In Servlet Redirecting server instruct the browser to execute next url.
    - Passing control from one servlet to another servlet is called servlet redirecting.

    javax.servlet.http.HttpServletResponse
    Method:
        public abstract void sendRedirect(String) throws IOException;
            => It is used to redirect the control from one servlet to another servlet.
            => Parameter String is "<url-pattern> of next servlet".
    EX:
        LoginServlet.java
        --------------------
        if (rs.next()) {
				  response.sendRedirect("welcome"); // welcome is servlet program
		}
 */
public class Servlet_Redirecting {

}

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
				  response.sendRedirect("welcome"); // welcome is a servlet program
		}

Servlet Forwarding VS Servlet Redirecting
-----------------------------------------
Servlet Forwarding
    - Forwarding request & response of one servlet to another servlet is called servlet Forwarding.
    - Here server implicitly forwards request & response of one servlet to another servlet.
    - Here only one pair of request and response is created by web-container.
    - Here both data and control passed to next servlet.
    - Here <url-pattern> is not changed.
    - It supports servlet to servlet HTML & JSP.
    - Forwarding works within the server only.

Servlet Redirecting
    - Passing control one servlet to another servlet is called servlet Redirecting.
    - Here server instruct the browser to execute next Servlet.
    - Here separate pair of request & response is created by web-container for every servlet.
    - Here only control passed to next servlet.
    - Here <url-pattern> is changed.
    - It supports servlet to servlet HTML, JSP, ASP, ASP.NET, PHP, --etc.
    - Redirecting works within the server and 2 different servers also.

 */
public class Servlet_Redirecting {

}

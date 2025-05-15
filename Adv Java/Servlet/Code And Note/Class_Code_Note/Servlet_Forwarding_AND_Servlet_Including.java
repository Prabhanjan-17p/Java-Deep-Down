package Class_Code_Note;
/*
Servlet Forwarding
-------------------
    - Forwarding request & response one servlet to another servlet is called as Servlet Forwarding.
    - The main advantage of servlet forwarding is modularity.
    javax.servlet.RequestDispatcher
    Methods:
        public abstract void forward(ServletRequest, ServletResponse) throws ServletException, IOException;

Servlet Including
--------------------
    - Including request and response of one servlet into another servlet is called as Servlet Including.
    - The main advantage of servlet Including is reusability.
    javax.servlet.RequestDispatcher
    Methods:
        public abstract void include(ServletRequest, ServletResponse) throws ServletException, IOException;

    javax.servlet.ServletRequest
    Methods:
        public abstract RequestDispatcher getRequestDispatcher(String) throws ServletException, IOException;
                                                            -- this String is <url-pattern> of next servlet

Servlet Forwarding VS  Servlet Including
--------------------------------------------
Servlet Forwarding
    - Forwarding request & response of one servlet to another servlet is called as servlet forwarding.
    - The main advantage of servlet forwarding is modularity.
    - In Servlet Forwarding only one pair of request & response created by web-container.
    - In Servlet Forwarding url-pattern is not changed.
    - Forward statement must be a last statement in a task code.
    - In forwarding Println statement are discarded.
    - Forwarding support to forward servlet to servlet,servlet to jsp & servlet to HTML.
    - Forwarding work within the server only.

Servlet Including
    - Including request & response of one servlet into another servlet is called as servlet Including.
    - The main advantage of servlet Including is reusability.
    - In Servlet Including only one pair of request & response created by web-container.
    - In Servlet Forwarding url-pattern is not changed.
    - Include statement can be any where in a task code.
    - In Including Println statement are accepted.
    - Including also supports to include servlet in a servlet, JSP in a servlet & HTML in a servlet.
    - Including also works within the server only.

 */

public class Servlet_Forwarding_AND_Servlet_Including {
}

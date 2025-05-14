package Class_Code_Note;

/*
Initialization Parameters:
    - Initialization parameters are used to initialized the servlet.
    - Initialization parameters are specific to servlet.
    - To configure initialization parameter, we used <init-param>,<param-name>& <param-values> tags in web.xml.
    - To retrieve Initialization parameters, we used the following method of javax.servlet.ServletConfig interface in servlet.
        public abstract String getInitParameter(String);
        EX-
            LoginServlet.java
            --------------------
            @Override
    public void init(ServletConfig config) throws ServletException {
        try {
        // this will be fetch from web.xml file(user will be set before fetch it(this parameter will be specific to servlet))
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String uname = config.getInitParameter("username");
        String pwd = config.getInitParameter("password");

        	Class.forName(driver);
            con = DriverManager.getConnection(url,uname,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}

Initialization Parameters VS Context Parameter
---------------------------------------------
Initialization Parameters
    - Initialization Parameters are used to initialized to servlet.
    - Initialization Parameters are specific to servlet.
    - To configure Initialization Parameters, we used <init-param>,<param-name>&<param-value> tags in web.xml
    - To retrieve Initialization Parameters from web.xml we used getInitParameter() method of ServletConfig interface.

Context Parameter
    - Context Parameters are used to initialized to servlet.
    - Context Parameters are common to all servlet in web application.
    - To configure Context Parameters, we used <context-param>,<param-name>&<param-value> tags in web.xml
    - To retrieve Context Parameters from web.xml we used getInitParameter() method of ServletContext interface.

 */

public class Initialization_Parameters {
}

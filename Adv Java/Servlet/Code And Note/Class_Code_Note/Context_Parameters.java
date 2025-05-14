package Class_Code_Note;
/*
Context Parameter
----------------------
    - Context parameter are used initialize servlet.
    - Context parameter are common to all servlets in a web application(.war file).
    - To configure context parameters, we use <context-param>,<param-name> & <param-value> tags in web.xml
    EX-
        <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee" id="WebApp_ID" version="4.0">
        <context-param>
            <param-name>driver</param-name>
            <param-value>oracle.jdbc.driver.OracleDriver</param-value>
        </context-param>
        <context-param>
            <param-name>url</param-name>
            <param-value>jdbc:oracle:thin:@localhost:1521:orcl</param-value>
        </context-param>
        <context-param>
            <param-name>username</param-name>
            <param-value>MYDB</param-value>
        </context-param>
        <context-param>
            <param-name>password</param-name>
            <param-value>MYDB</param-value>
        </context-param>
          <servlet>
            -----------
            -----------
          </servlet>
        </web-app>

    - To retrieve Context parameters, we used the following method of javax.servlet.ServletContext interface in servlet.
        public abstract String getInitParameter(String);
    - To get ServletContext, use the following method of javax.servlet.ServletContext interface.
        public abstract ServletContext getServletContext();
    EX-
    LoginServlet.java
    ------------------
      @Override
    public void init(ServletConfig config) throws ServletException {
        try {
        // it can used every where
        	 ServletContext sc = config.getServletContext();
        	 String driver = sc.getInitParameter("driver");
             String url = sc.getInitParameter("url");
             String uname = sc.getInitParameter("username");
             String pwd = sc.getInitParameter("password");

             Class.forName(driver);
             con = DriverManager.getConnection(url,uname,pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
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


ServletConfig VS ServletContext
--------------------------------
ServletConfig
    - ServletConfig is created by web container whenever init() method is call.
    - Web container creates ServletConfig one per servlet.
    - ServletConfig is used to retrieve initialization parameter from web.xml.
    -

ServletContext
    - ServletContext is created by web container whenever web application is deployed in server.
    - Web container creates ServletContext one per web-application.
    - ServletContext is used to retrieve context parameter from web.xml.

Ways to Create a web-Application
-----------------------------------
    1. ServletContext
        - When deploy the application then it will be call.
    2. User defined Servlet
        - To call life cycle methods.
    3. ServletConfig
        - For init parameter.
    4. ServletRequest & ServletResponse
        Response - is used to create a Stream.
        Request - is used to fetch the requested value.

 */
public class Context_Parameters {
}

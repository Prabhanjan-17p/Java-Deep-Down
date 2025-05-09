package Class_Code_Note;

/*
Steps to develop web application:
    1) Create a web application folder structure.
    2) Create & compile web application source code(servlet program).
    3) Write deployment descriptor(web.xml).
    4) Create a WAR(Web Archive) file.

* Web Application Folder Structure:
    RootFolder/
    ├── src/
    │   └── *.java         (Java source files)
    ├── WEB-INF/
    │   ├── classes/
    │   │   └── *.class     (Compiled Java class files)
    │   ├── lib/
    │   │   └── *.jar       (Library JAR files)
    │   └── web.xml         (Deployment descriptor)
    ├── *.html             (HTML files)
    ├── *.css              (CSS files)
    ├── *.js               (JavaScript files)
    ├── Media/
    │   ├── *.png / *.jpg   (Image files)
    │   ├── *.mp3           (Audio files)
    │   └── *.mp4           (Video files)
    └── *.war              (Web Application Archive file)

*** Servlet API?
    => 'javax.servlet' package is known as Servlet API and which provide classes and interfaces used in Servlet application development.
    => 'javax.servlet.Servlet' interface is the root of Servlet API.

Diff b/w Classes vs Interfaces?
Classes
    => GenericServlet
    => servletException
    => UnavailableException
    => Servlet InputStream
    => ServletOutputStream

Interfaces
    =>Servlet
    => ServletRequest
    => ServletResponse
    => servletConfig
    => ServletContext
    => RequestDispatcher
    => SingleThreadModel

    javax.servlet.http package (or) jakarta.servlet.http package:

  Classes         Interfaces
 ------------   ------------------
 HttpServlet    HttpServletRequest
 Cookie         HttpServletResponse
                HttpSession

    => The above packages are the part of servlet-api.jar file in tomcat server.

jakarta.servlet.Servlet(above 9v) OR javax.servlet.Servlet(up-to 9v)
    Methods :
        1) public abstract void init(ServIetConfig) throws ServletException;
        2) public abstract ServletConfig getServIetConfig();
        3) public abstract void service(ServletRequest, ServletResponse)throws ServletException, IOException;
        4) public abstract String getServIetInfo();
        5) public abstract void destroy() ;

    NOTE :(Write Servlet Program Those 2 way)
        1 - => Servlet have 5 Abstract method(If we Call Servlet then we should be inherit those 5 method)
            Then if you don't want used those 5 Abstract Method then we should go for
        2 - => "GenericServlet", It is a Abstract class which is have only one abstract method.

jakarta.servlet.ServletResponse(above 9v) OR javax.servlet.ServletResponse(up-to 9v)
    Methods :
        1) public abstract ServletOutputStream getOutputStream() throws IOException; (Byte Stream means support all type of data)
        2) pubIic abstract PrintWriter getWriter() throws IOException; (Character Stream means support only text type of data)

        => The above methods are used to create stream from server to browser.

 */

public class Servlet_API_02 {
    public static void main(String[] args) {

    }
}

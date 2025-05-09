package Class_Code_Note;
/*
TO configure tomcat server in Eclipse:
    1) Open Java EE Perspective
    2) Click on Servers view
    3) Right click in a Servers view
    4) Click on New
    5) Click on Server
    6) Expand Apache
    7) Select Tomcat vlO.O Server
    8) Click on Next button
    9) Select Tomcat Installation directory by clicking on Browse
    button.
    Example:
    Files\Apache Soft
    ware Foundation\Tomcat 9.0
    IO) Click on Next button
    11) Click on Finish button

To Start Tomcat WebServer
    1- Right Click on Tomcat v9.0 Server at localhost.
    2- Click on start.

To Stop Tomcat WebServer
    1- Right Click on Tomcat v9.0 Server at localhost.
    2- Click on stop.

To Change the port numbers:
    1- Double click on Tomcat v9.0 server at localhost
    2- Move the horizontal scroll bar.
    3- Tomcat admin port: 8089
    4- HTTP/1.1 port: 8081
    5- Click the file menu.
    6- Click on save.

To create a web application folder structure:
    1- Click on file menu
    2- Click New
    3- Next click Dynamic Web Project
    4- Type project name (ex- basic)
    5- Click on Next button.
    6- Again click on Next Button
    7- Select generate web.xml deployment descriptor check box.
    8- Click on finish.

To write Servlet Program
    1- Right Click on basic in project explorer.
    2- Click on new
    3- Click on Servlet
    4- Type Java Package (ex- Basic)
    5- Type class name (ex- FirstServlet)
    6- Type super class (ex- javax.servlet.GenericServlet for Tomcat 9 v)
    7- Click on next button.
    8- To change the url pattern Select /FirstServlet in URL mapping box & click on Edit Button
    9- Type /test
    10- Click on ok button
    11- Click on Next Button.
    12- If javax.servlet.Servlet are shown in interface then remove this
    13- Click on finish button.
    14- Write the servlet code.
        ex- PrintWriter pw = response.getWriter();
		pw.print("Welcome to servlet...");

To run the above application .
    1- Right click on basic in project explorer.
    2- Click on Run as.
    3- Click on Run in server.
    4- Click on save button.
    5- Expand localhost.
    6- Select Tomcat 9.0 server at localhost
    7- Click on Next Button
    8- Click on finish button.
    9- Click on Ok button.
    10- Type url pattern in test in address bar
        ex - http://localhost:8081/Basic/test

To Change the Web-Browser
    1- Click on Window menu.
    2- Click on Web-Browser.
    3- Select your Browser.

To add servlet-api.jar file to web application
    1- Write click on basic in project explorer
    2- Click on build path.
    3- Click on Configure build path.
    4- Click on Libraries.
    5- Click on class path.
    6- Click on add External JARs button.
    7- Select servlet-api.jar file from the following location.
        ex - C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar
    8- Click on Open button
    9- Click on Apply button.
    10- Click on Apply&Close Button.
 */
public class Config_04 {
    public static void main(String[] args) {

    }
}

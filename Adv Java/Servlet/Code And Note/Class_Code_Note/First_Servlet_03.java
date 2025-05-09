package Class_Code_Note;

/*
jar
    => It is a jdk tool and it is used to create JAR(Java ARchive) files. WAR(Web ARchive) files, EAR(Enterprise ARchive) files & RAR(Resource ARchive) files.
    c => Create
    v => Verbose(Details of WAR file displayed)
    f => File to be created
    .(dot) All files & folders of current directory

3 Diff Stream are :
    1- System(Console) input,output Stream
    2- File input,output Stream
    3- Network Stream

Steps to develop web application:
         1) Create and compile web application source code(Servlet Program)
         2) Write deployment descriptor(web.xml)
         3) Create a WAR (Web Archive) file.
         4) Deploy a WAR file on server.

File Structure :
        firstApp/
        ├── WEB-INF/  (Mandatory To Write Same Name)
        │   ├── classes/    (Mandatory To Write Same Name)
        │   │   ├── FirstServlet.java
        │   │   └── FirstServlet.class
        │   └── web.xml    (Mandatory To Write Same Name)
        └── first.war

Creating Servlet FirstApp
    C:\>md firstapp
    C:\>cd firstapp
    C:\firstapp>md WEB-INF
    C:\firstapp>CD WEB-INF
    C:\firstapp\WEB-INF>md classes
    C:\firstapp\WEB-INF>cd classes
    C:\firstapp\WEB-INF\classes>start notepad FirstServlet.java
    under the FirstServlet.java file we should write this program
            import java.io.*;
            import javax.servlet.*;

            public class FirstServlet extends GenericServlet {
                 public void service(ServletRequest req, ServletResponse res){
                        try {
                    PrintWriter pw = res.getWriter();
                    pw.print("Wellcome to Servlet.");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
            }
    C:\firstapp\WEB-INF\classes>javac FirstServlet.java
    C:\firstapp\WEB-INF\classes>cd..
    C:\firstapp\WEB-INF>start notepad web.xml
    under the web.xml file we should write this
        <web-app>
            <servlet>
                <servlet-name>Demo</servlet-name>
                <servlet-class>FirstServlet</servlet-class>
            </servlet>
            <servlet-mapping>
                <servlet-name>demo</servlet-name>
                <url-pattern>/test</url-pattern>
            </servlet-mapping>
        <web-app>
    C:\firstapp\WEB-INF>cd..
    C:\firstapp>jar cvf first.war .
            added manifest
            adding: WEB-INF/(in = 0) (out= 0)(stored 0%)
            adding: WEB-INF/classes/(in = 0) (out= 0)(stored 0%)
            adding: WEB-INF/classes/FirstServlet.class(in = 633) (out= 399)(deflated 36%)
            adding: WEB-INF/classes/FirstServlet.java(in = 360) (out= 207)(deflated 42%)
            adding: WEB-INF/web.xml(in = 243) (out= 106)(deflated 56%)

    To start tomcat web server:
1 ) Open the following folder
C:iProgram FilesApache Software Foundation\Tomcat 10.0X bin
2) Double click on Tomcat10 icon

    d
1 ) Open the browser
2) Type the following in address bar http://localhost:8081
3) Click on Manager App button
4) Type Username admin
5) Type Password admin
6) Click on Sign-in button
7) Scroll down
8) Click on Choose file button
9) Select the first_war file from the following location Citirstapp
10) CllCk on Deploy button

    TO run the above application •
1 ) Open the browser
2) Type the following in address bar http://localhost.8081/first/test

http:
    - HTTP stands for Hyper Text Transfer Protocol.
    - It transfers hyper text.
    - Hyper text means HTML text.
    - HTML stands for Hyper Text Markup Language.
    - HTTP protocol used by browser & server to communicate on the web.

localhost:
    - It is a domain name.
    - It the server is installed on same computer then use localhost as a domain name otherwise use computer name as a domain name.

8081:
    - It is a port number & it is used to identify the service.
    - Tomcat server default port number is 8080.
    - WildFly server default port number is 8080.
    - Web-logic server default port number is 7001.
    - Oracle server default port number is 8080.

    - Reserved Port Number Range is 0 to 1023
    - Free Port Numbers Range is 1024 to 65535.

To change the tomcat server port number :
    1- Open the server.xml file from the following location.
        ex- C:\Program Files\Apache Software Foundation\Tomcat 9.0\conf\server.xml
    2- Change the port number 8080 to 8081/8082 as follow:
        ex- <Connector port="8080" to 8081/8082
    3- Save the file.

WAR file deployment location in Tomcat Server:
    - C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps


 */

public class First_Servlet_03 {
    public static void main(String[] args) {
//        public void service(ServletRequest req ServletResponse res){
//            try {
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
    }
}

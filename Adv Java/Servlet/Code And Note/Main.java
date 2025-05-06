/*
Servlet Programming:(Unit-2)
-------------------------------
Define Servlet Programming?
    => PlatForm independent JavaProgram which is executed in Server environment is known as Servlet Program or Server Program.
    => Servlet program will accept HTTP request from user through web-Browser and provide response.

Type of application:
    => Applications are categorized in the following:
    (a)StandAlone Applications
    (b)Web Application
    (c)Enterprise Application
    (d)Mobile Application

    (a)StandAlone Applications
        => The applications which are installed in one computer and performs actions in the same computer are known as StandAlone Applications.
        => Which are also known as Desktop application or Windows application

     NOTE :
        =>According to developer StandA10ne applications means,
            No HTML input
            No Server Environment
            No DataBase Storage

        => Based on user interaction these Standalone application are categorized into two type:
            i- CUI Application
                => The application in which the user interact through console or known as CUI Application(Console User Interface).
            ii- GUI Application
                => The application in which the user interact through GUI components or known as GUI Application(Graphical User Interface).
        NOTE :
            => We used AWT (Abstract Window Toolkit) and Swings to design GUI components.

    (b)Web Application
        => The application which are executed in Web Environment or Internet  Environment are known as Web Application.
        => To construct web application we used JDBC,Servlet and JSP.

        NOTE :
            => These web application are execute in "WebContainer" .
            => This WebContainer is available from "webServer" and "application Server"

    (c)Enterprise Application
        => The applications which are executing distributed environment and depending on the features like Security, Load Balancing and Clustering process are known as Enterprise Application or Enterprise Distributed Application.

    (d)Mobile Application
        => The application which are executed in mobile environment are known as mobile application.

*** Define Server?
    => Server means service provider, Which means accepting the request and providing the response.

*** Define Client?
    => The user who generate request to the server is known as Client.

*** Types of servers?
    => Two type server :
    i - Web Server
        => Web Server contains only Web container.
        => web server is good in case of static contents like static html pages.
        => Web server consumes less resources like CPU, Memory etc. as compared to application server.
        => Web Server provides the runtime environment for web applications.
        => Web Server supports HTTP Protocol.
        =>Apache Web Server. (Tomcat)
    ii - Application Server
        => Application Server contains both Container • (EJB - Enterprise Java Bean)
        => Application server is relevant in case of dynamic contents like bank websites.
        => Application server utilizes more resources.
        => Application server provides the runtime environment for enterprise applications.
        => Application Server supports HTTP as well as RPC/RMI protocols.
            (RPC - Remote Procedure call)
            (RMI - Remote Method Invocation)
        => WebLogic, JBoss.


 Server Put Down - 8089
 HTTP /1.1 Connector port - 8081
 User Name : kanha
 Password : kanha

 http://localhost:8081
 */
public class Main {
}

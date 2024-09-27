# Servlet-and-JSP
Servlet and JSP Tutorial

# Servlet-Tutorial

# Introduction to Servlet:
    * It is a Server-Side Technology.
    * A servlet is a Java program for web applications.
    * It handles HTTP requests and responses.
    * Servlets run on a server.
    * It has a defined lifecycle (init, service, destroy).
    * Used for generating dynamic web content.
# Responsibilities to Servlet:
    * Handles the client request.
    * Process the Request.
    * Generate Dynamic Response.

# Client → Request → Server (Process Request) →Generate→Dynamic Response→Client

# Server:
    * A server provides resources and services to clients.
    * It handles client requests and sends responses.
    * Servers support web, database, and application functionalities.
    * Web Server : 
        * Web servers manage HTTP requests for websites.
        * Examples:
            - Apache Tomcat
            - GlassFish
            - Jetty
    * Application Server :
        * Application servers handle business logic and backend processing.
        * Examples:
            - JBoss
            - Web Logic
            - IBM Webspace

# Steps to Add/Configure Tomcat Server:
     * Download Eclipse & Tomcat zip file. 
     * Set the runtime environment of Tomcat in Eclipse.
     * Add the server in Eclipse.

# Hierarchy of Servlet :

    * Servlet Interface : 
        - The root interface defining servlet methods.(Parent Interface)
    * GenericServlet Class :
        - Implements the Servlet interface, providing protocol independent methods.
    * HttpServlet Class : 
        - Extends GenericServlet, specialized for handling HTTP requests.
    * Custom Servlet Class :
        - User-defined class that extends HttpServlet to create a specific servlet.

# Syntax :
   * class MyServlet implements Servlet
      {
      	Backend Code
      }
    
   * class MyServlet extends GenericServlet 
      {
      	Backend Code
      }
    
   * class MyServlet extends HttpServlet 
      {
      	Backend Code
      }

    * Note : We have to create a Deployment Descriptor File. i.e web.xml

# Life-Cycle of Servlet:
    * The lifecycle of a servlet consists of the following stages:
        * Loading and Instantiation: 
            - The servlet is loaded into memory and an instance is created.
        * Initialization (init()):
             - The servlet is initialized and configured once after instantiation.
        * Request Handling (service()): 
            - For each client request, the service() method is called to process the request and generate a response.
        * Destruction (destroy()):
            - Before the servlet is removed from memory, the destroy() method is called to clean up resources.
        * Note :When multiple request occurs, each request has its new own thread i.e(MultiThreading)

# Deployment Descriptor (web.xml) :

      * The Deployment Descriptor (web.xml) is an XML file used to configure servlets in a web application.
      * It is located in the WEB-INF directory of the web app and defines settings like servlet mappings, initialization parameters, and other configurations.
      * Key elements:
            <servlet>: Defines a servlet by name and class.
            <servlet-mapping>: Maps a servlet to a URL pattern.
            <welcome-file-list>: Specifies default files (e.g., index.html) to be loaded when    accessing the root of the application.
      * Example : 
           * <display-name>ServletApplication2</display-name>
            	<servlet-mapping>
            		<servlet-name>servletname</servlet-name>
            		<url-pattern>/abcurl</url-pattern>
            	</servlet-mapping>
            	<servlet>
            		<servlet-name>servletname</servlet-name>
            		<servlet-class>in.backend.MyServlet</servlet-class>
            	</servlet>
      
      * Different tasks of web.xml file :-
            1. Servlet Configuration
            2. JSP File Configuration
            3. Filters Configurations
            4. Listeners Configurations
            5. Error Page Configuration
            6. Welcome File Configuration
      
      * Note : In latest version, it is not necessary to create web.xml file. 
      * Hint - @WebServlet Annotation


# @WebServlet Annotation :
      * Defines servlet: The @WebServlet annotation simplifies servlet definition without needing web.xml.
      * URL mapping: It allows URL patterns to be mapped directly in the code.
      * Syntax: @WebServlet(“/url”)
      
      * Note: Annotations i.e. @WebServlet, @WebFilter, @WebListener, @MultipartConfig etc are part of the Java Servlet API and can be used in any version from servlet 3.0 onwards, including newer versions like 3.1, 4.0, and 5.0




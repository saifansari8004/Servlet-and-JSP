# Servlet-and-JSP
Servlet and JSP Tutorial

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


# Introduction to JSP:
      * It is a Server-Side Technology.
      * JSP stands for Java Server Pages.
      * JSP is a server side technology which is used to create dynamic web pages.
      * JSP is an advanced version of Servlet Technology.
      * To embed java code in JSP:
            1. Scriptlet Tag: <% some Java code %>
            2. Expression Tag: <%= an expression %>
            3. Declaration Tag: <%! variable declaration & method definition %>
            4. Directive Tag: <%@ directives %>
            5. Comment Tag: <%-any Text -%>
            6. Action Tags: <jsp:actionName />
# Use of JSP:
      * Generate dynamic web content by embedding Java code in HTML.
      * Process client requests and interact with server-side components like databases.
      * Manage user data through session tracking and cookies.
      * Separate presentation from logic, keeping the UI and business logic distinct.

# Difference between JSP and Servlet:-
      1. Servlet
            →  Servlet is a java code.
            →  It is hard to write code in servlet. 
            →  Servlets run faster than JSP.
            →  In MVC architecture, servlet works as a controller.
            →  Servlet can accept all protocol requests, including HTTP.
            →  Modification in Servlet file is time consuming due to reloading, recompiling, and restarting the server. 
      2. JSP
            →  JSP is a HTML-based code.
            →  It's easier to code in JSP compared to  servlets.
            →  JSP runs slower than servlet as it takes time to compile the program and convert into servlets.
            →  In MVC architecture, JSP works as a view for displaying output. 
            →  JSP can only accept HTTP requests.
            →  JSP modification is fast, as you just need to click one refresh button.
   
   
      * Note:  1. Servlet Code is handled by Servlet Container.
               2. JSP Code is handled by JSP Container.

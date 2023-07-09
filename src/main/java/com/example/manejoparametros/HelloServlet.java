package com.example.manejoparametros;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/Servlet")
public class HelloServlet extends HttpServlet {

private String userName;
private String passWord;
    private PrintWriter printWriter;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Read parameters from html form
        response.setContentType("text/html");
        userName = request.getParameter("Usuario");
        passWord = request.getParameter("password");
        printWriter = response.getWriter();
        printWriter.println("<html>" +
                "<body>" +
                "The user parameter is: " + userName
                + "<br/>"
                + "The user password is: " + passWord
                + "<body>"
                + "</html>"
        );

    }

    public void destroy() {
    }
}

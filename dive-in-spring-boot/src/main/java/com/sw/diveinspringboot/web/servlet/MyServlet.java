package com.sw.diveinspringboot.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/my/servlet",asyncSupported = true)
public class MyServlet  extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(()->{

            try {
                //触发完成
                asyncContext.complete();
                resp.getWriter().println("hello World");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });



    }
}

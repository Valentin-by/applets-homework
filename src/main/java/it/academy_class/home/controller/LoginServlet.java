package it.academy_class.home.controller;

import it.academy_class.home.model.entity.User;
import it.academy_class.home.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = req.getReader().lines().collect(Collectors.joining());
        String username = "not defined";
        String password = "not defined";
        if(body.length() != 0) {
            String[] parameters = body.split("&");
            if(parameters[0].substring(0, parameters[0].indexOf('=')).equals("username")){
                username = parameters[0].substring(parameters[0].indexOf('=') + 1);
            }
            if(parameters[1].substring(0,parameters[1].indexOf('=')).equals("password")){
                password = parameters[1].substring(parameters[0].indexOf('=') + 1);
            }
            LoginService loginService = LoginService.getLoginService();

            if (loginService.checkCredentials(username, password)) {
                HttpSession httpSession = req.getSession();

                User user = new User(username, password);
                httpSession.setAttribute("user", user);
                req.getRequestDispatcher("/WEB-INF/jsp/login_pos_result.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("/WEB-INF/jsp/login_negative_result.jsp").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("/WEB-INF/jsp/login_incorrect.jsp").forward(req, resp);;
        }
    }
}

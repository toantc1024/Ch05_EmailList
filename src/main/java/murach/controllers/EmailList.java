package murach.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.models.User;

import java.io.IOException;
import java.io.PrintWriter;

public class EmailList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String dob = req.getParameter("dob");
        String hearUsOption = req.getParameter("hear_us_option");
        String isLike =  req.getParameter("isLike");
        String isSendEmail = req.getParameter("isSendEmail");
        String contactMeBy = req.getParameter("contactMeBy");


        User user = new User(firstName, lastName, email, dob, isLike, isSendEmail, hearUsOption, contactMeBy);
//
        req.setAttribute("user", user);
        String url = "/thank.jsp";
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}

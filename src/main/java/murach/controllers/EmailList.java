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
        resp.sendRedirect(req.getContextPath() + "/");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = "/thank.jsp";
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String dob = req.getParameter("dob");
        String hearUsOption = req.getParameter("hear_us_option");

        String contactMeBy = req.getParameter("contactMeBy");
        String[] selectedOptions = req.getParameterValues("options");

        if(firstName == null || lastName == null || email == null || dob == null || hearUsOption == null || contactMeBy == null) {
            String message = "Please fill all the field!";
            req.setAttribute("error", message);
            url = "/form.jsp";
        } else {
            User user = new User(firstName, lastName, email, dob, selectedOptions, hearUsOption, contactMeBy);
            req.setAttribute("user", user);
        }
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}

package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.impl.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collection;

@Path("/register")
public class RegisterController implements PageController {

    @GET
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "login-form.jsp";
    }

    @POST
    @Path("/user")
    public String register(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setPassword(password);

        UserService userService = new UserServiceImpl();
        userService.register(user);
        return "index.jsp";
    }
}

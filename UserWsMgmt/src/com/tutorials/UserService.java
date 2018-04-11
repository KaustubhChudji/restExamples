package com.tutorials;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userService")
@Produces(MediaType.APPLICATION_XML)
public class UserService {
    UserDao userDao = new UserDao();

    @GET
    @Path("/users")
    public List<User> getUsers() {
        return this.userDao.getAllUsers();
    }
}

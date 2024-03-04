package controller;

import service.UserService;
import serviceImpl.UserServiceImpl;

public class UserController {
    UserService us;

    public UserController() {
        this.us = new UserServiceImpl();
    }

    public String addUsers() {
        String msg = us.addUsers();
        return msg;
    }

    public String count() {
        return us.count()+ "";
    }
}

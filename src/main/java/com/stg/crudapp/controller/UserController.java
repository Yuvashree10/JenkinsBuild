package com.stg.crudapp.controller;

import com.stg.crudapp.entity.user;
import com.stg.crudapp.model.userrequest;
import com.stg.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/getAllUsers",method = RequestMethod.GET)
    public List<user> getAllUsers(){

        return userService.getUserList();
    }
    @RequestMapping(path = "/saveUser",method = RequestMethod.POST)
    public user saveUser(@RequestBody userrequest userrequest1){


        return userService.saveUser(userrequest1);
    }

}

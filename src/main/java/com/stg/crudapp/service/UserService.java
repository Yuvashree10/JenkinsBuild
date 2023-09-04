package com.stg.crudapp.service;

import com.stg.crudapp.entity.user;
import com.stg.crudapp.model.userrequest;
import com.stg.crudapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<user> getUserList() {
        return userRepository.findAll();


    }


    public user saveUser(userrequest userrequest) {
        user user=new user();
        user.setEmailId(userrequest.getEmailId());
        user.setFirstName(userrequest.getFirstName());
        user.setLastName(userrequest.getLastName());
        user = userRepository.save(user);
        return user;

    }
}

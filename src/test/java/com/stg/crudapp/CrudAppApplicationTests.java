package com.stg.crudapp;

import com.stg.crudapp.entity.user;
import com.stg.crudapp.model.userrequest;
import com.stg.crudapp.repo.UserRepository;
import com.stg.crudapp.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
class CrudAppApplicationTests {


	@InjectMocks
	UserService userservice;

	@Mock
	UserRepository userrepo;


	@Test
	void contextLoads() {
	}



	@Test
	public void getAllUsersTest(){
		List<user> u2=new ArrayList<>();
		user u1=new user(5,"yuva","yu","va");
		u2.add(u1);
		when(userrepo.findAll()).thenReturn(u2);
		Assertions.assertNotNull(userservice.getUserList().get(0).getId());
	}


	@Test
	public void saveUserTest(){

		userrequest u1=new userrequest(1,"yuva","yu","va");
		System.out.println("*******"+u1.getEmailId());
		user u2=new user(u1.getId(),u1.getEmailId(),u1.getFirstName(),u1.getLastName());
		when(userrepo.save(u2)).thenReturn(new user());
		user savedUser = userservice.saveUser(u1);

		Assertions.assertEquals("yu",savedUser.getFirstName());

	}


}

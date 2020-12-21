package com.SpringBootJPAProject1.SpringBootJPAProject1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBootJPAProject1.SpringBootJPAProject1.DAO.UserRepository;
import com.SpringBootJPAProject1.SpringBootJPAProject1.Model.User;

@SpringBootApplication
public class SpringBootJpaProject1Application {

	public static void main(String[] args) {
		ApplicationContext context=(ApplicationContext) SpringApplication.run(SpringBootJpaProject1Application.class, args);
		UserRepository ur=((BeanFactory) context).getBean(UserRepository.class);
		User u=new User();
		u.setCity("lucknow");
		u.setName("rahul");
		ur.save(u);
	}

}

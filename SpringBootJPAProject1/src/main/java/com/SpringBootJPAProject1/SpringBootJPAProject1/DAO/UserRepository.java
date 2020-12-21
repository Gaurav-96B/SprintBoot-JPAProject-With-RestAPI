package com.SpringBootJPAProject1.SpringBootJPAProject1.DAO;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootJPAProject1.SpringBootJPAProject1.Model.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}

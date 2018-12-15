package com.rest.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

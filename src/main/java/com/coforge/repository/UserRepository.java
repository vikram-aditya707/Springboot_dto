package com.coforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
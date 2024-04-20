package com.inn.cafe.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.inn.cafe.management.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmailId(@Param("email") String email);
}
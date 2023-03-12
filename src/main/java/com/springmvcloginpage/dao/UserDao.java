package com.springmvcloginpage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvcloginpage.entity.User;

public interface UserDao extends JpaRepository<User, Integer>
{
	

}

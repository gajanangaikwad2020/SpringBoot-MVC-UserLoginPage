package com.springmvcloginpage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String dob;
	private String gender;
	private String contact;
	private String password;
	
	
	
	
	

}

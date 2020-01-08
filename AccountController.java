package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	private AccountDAO dao;
	
	@RequestMapping("account")		//localhost:8080/account
	public List<Account> getAll(){
		
		return dao.findAll(); 
	}
}

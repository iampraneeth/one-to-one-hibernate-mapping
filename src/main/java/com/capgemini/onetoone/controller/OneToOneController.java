package com.capgemini.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetoone.dao.PersonDao;
import com.capgemini.onetoone.person.Person;
import com.capgemini.onetoone.person.Profile;



@RestController
public class OneToOneController {
	@Autowired
	private PersonDao dao;
	
	@RequestMapping("/")
	public void toSend() {
		Person person=new Person(101,"ram",new Profile(301,"java"));
		dao.save(person);
		
		
	}
	@RequestMapping("/new")
	public Person toDisplay() {
		Person person=dao.findById(101).get();
		return person;
	}
	

}

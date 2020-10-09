package com.springMVC.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springMVC.entities.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		 Integer i=(Integer)this.hibernateTemplate.save(user);
		return i;
	}

}

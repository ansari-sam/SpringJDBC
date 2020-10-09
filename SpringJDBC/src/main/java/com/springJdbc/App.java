package com.springJdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJdbc.Configuration.JdbcConfiguration;
import com.springJdbc.dao.UserDao;
import com.springJdbc.entities.UserInfo;

public class App {
	public static void main(String[] args) {
		
		//configuration with config.xml file
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		//configuration with Annotated config class
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		UserDao userDao = context.getBean("userDao", UserDao.class);

//        UserInfo userInfo=new UserInfo();
//        userInfo.setId(17);
//        userInfo.setName("Bora2");
//        userInfo.setCity("Noida-3");
//        userInfo.setStreet("Street-8");
//        int i = userDao.Insert(userInfo);
//        System.out.println("User Inserted and no of row affected....."+i);

		// update user
//        UserInfo userInfo=new UserInfo();
//        userInfo.setId(11);
//        userInfo.setName("Aman Kumar Jha");
//        userInfo.setCity("FaridaBaad-Noida");
//        int i = userDao.change(userInfo);
//        System.out.println("User changed and no of row affected....."+i);

		// delete user from db
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(".......................................");
//        System.out.println("Please enter userId which you want to delete");
//        int id=0;
//        try {
//			id=Integer.parseInt(br.readLine());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        int i = userDao.delete(id);
//        System.out.println("user deleted...."+i+".....you have enter userid-"+id);

		// get single user
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(".......................................");
		System.out.println("Please enter userId which you want to see");
		int id = 0;
		try {
		id = Integer.parseInt(br.readLine());
		UserInfo user = userDao.getUser(id);
		System.out.println("userid-"+id);
		System.out.println("User details below");
		System.out.println(user);
		} catch (Exception e) {
			System.out.println("Invalid Input..Try with another");
			System.out.println(e.getMessage());
		}

		// get all user details

//		List<UserInfo> allUser = userDao.getAllUser();
//		for (UserInfo user : allUser) {
//			System.out.println(user);
//		}
	}
}

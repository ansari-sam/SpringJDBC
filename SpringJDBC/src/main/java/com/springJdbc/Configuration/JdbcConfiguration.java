package com.springJdbc.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.dao.UserDao;
import com.springJdbc.dao.UserDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.springJdbc")
public class JdbcConfiguration {

	@Bean(name= {"ds"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/myh");
		ds.setUsername("root");
		ds.setPassword("saddam");
		return ds;
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean(name= {"userDao"})
	public UserDao getUserDao() {
		UserDaoImpl userDao=new UserDaoImpl();
		userDao.setJdbcTemplate(getTemplate());
		return userDao;
	}
}

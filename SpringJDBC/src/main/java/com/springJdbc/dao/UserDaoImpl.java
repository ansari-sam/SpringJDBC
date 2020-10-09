package com.springJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springJdbc.entities.UserInfo;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public int Insert(UserInfo user) {

		String query = "insert into jdbcspring(id,name,city,street) values(?,?,?,?)";
		int r = this.jdbcTemplate.update(query, user.getId(), user.getName(), user.getCity(), user.getStreet());

		return r;
	}

	// updating data

	public int change(UserInfo user) {

		String query = "update jdbcspring set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query, user.getName(), user.getCity(), user.getId());

		return r;
	}

	// delete user

	public int delete(int id) {
		String sql = "delete from jdbcspring where id=?";
		int r = this.jdbcTemplate.update(sql, id);
		return r;
	}

	// get single user

	public UserInfo getUser(int id) {

		String sql = "select * from jdbcspring where id=?";

		RowMapper<UserInfo> rowMapper = new RowMapperImpl();
		UserInfo userInfo = this.jdbcTemplate.queryForObject(sql, rowMapper, id);
		return userInfo;
	}

	// get all list of user
	public List<UserInfo> getAllUser() {
		String sql = "select * from jdbcspring";
		RowMapper<UserInfo> rowMapper = new RowMapperImpl();
		List<UserInfo> list = this.jdbcTemplate.query(sql, rowMapper);

		return list;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

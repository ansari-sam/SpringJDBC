package com.springJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entities.UserInfo;

public class RowMapperImpl implements RowMapper<UserInfo> {

	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

		UserInfo user=new UserInfo();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setCity(rs.getString(3));
		user.setStreet(rs.getString(4));
		return user;
	}

}

package com.wxjfkg.swagger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.wxjfkg.swagger.entity.User;

@Repository
public class UserDao {

//	@Autowired
	private JdbcTemplate template;

	public User get(String id) {
		String sql = "select user_id,user_code,user_name from sys_user where user_id = ?";
		return template.queryForObject(sql, new Object[] { id },
				new UserMapper());
	}

	private class UserMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int row) throws SQLException {
			User user = new User();
			user.setUserId(rs.getString("user_id"));
			user.setUserCode(rs.getString("user_code"));
			user.setUserName(rs.getString("user_name"));
			return user;
		}
	}
}
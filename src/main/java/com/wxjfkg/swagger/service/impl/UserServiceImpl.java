package com.wxjfkg.swagger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wxjfkg.swagger.dao.UserDao;
import com.wxjfkg.swagger.entity.User;
import com.wxjfkg.swagger.service.UserService;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findUserById(String userId) {
		return userDao.get(userId);
	}

}

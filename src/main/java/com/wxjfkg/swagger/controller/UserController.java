package com.wxjfkg.swagger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wxjfkg.swagger.entity.User;

@Api(value = "/user", description = "用户接口")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@ApiOperation(value = "添加一个新的用户", notes = "新增用户", httpMethod = "PUT")
	@RequestMapping(value = "user", method = RequestMethod.PUT)
	@ResponseBody
	public User addUser(
			@ApiParam(required = true, value = "用户数据") @RequestBody User user) {
		logger.info("add user |- {}", user);
		return user;
	}

	@ApiOperation(value = "查询用户接口", notes = "根据用户ID查询用户", httpMethod = "GET")
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(
			@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable("id") String userId) {
		logger.info("get user |- userId:{}", userId);
		User user = new User();
		user.setUserId(userId);
		user.setUserCode("Swagger");
		user.setUserName("Swagger");
		return user;
	}

	@ApiOperation(value = "更新用户接口", notes = "更新用户", httpMethod = "POST")
	@RequestMapping(value = "user", method = RequestMethod.POST)
	@ResponseBody
	public User updateUser(
			@ApiParam(required = true, value = "用户数据") @RequestBody User user) {
		logger.info("update user |- {}", user);
		return user;
	}

	@ApiOperation(value = "删除用户接口", notes = "删除用户", httpMethod = "DELETE")
	@RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUser(
			@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable("id") String userId) {
		logger.info("delete user |- userId:{}", userId);
	}

}

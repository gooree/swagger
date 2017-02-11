package com.wxjfkg.swagger.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户")
public class User {

	@ApiModelProperty("用户ID")
	private String userId;

	@ApiModelProperty("登录名")
	private String userCode;

	@ApiModelProperty("用户名")
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return new ToStringBuilder(this).append(userId).append(userCode)
				.append(userName).toString();
	}

}

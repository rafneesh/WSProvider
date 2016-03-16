package com.dreamsyssoft.demo.rest.services.impl;

import java.util.Arrays;

import com.dreamsyssoft.demo.rest.dao.UserManagerDao;
import com.dreamsyssoft.demo.rest.model.UserRequest;
import com.dreamsyssoft.demo.rest.model.UserResponse;
import com.dreamsyssoft.demo.rest.services.UserManager;

public class UserManagerService implements UserManager
{
	private UserManagerDao userDao;

	public UserManagerDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(UserManagerDao userDao)
	{
		this.userDao = userDao;
	}

	public UserResponse fetchAllUsers(String customerId) {
		
		System.out.println("Get Query for the Customer:"+customerId);
		UserResponse response = new UserResponse();

		try
		{
			response.setUsers(getUserDao().fetchAllUsers());
		}
		catch (Exception e)
		{
			response.setSuccess(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}
}

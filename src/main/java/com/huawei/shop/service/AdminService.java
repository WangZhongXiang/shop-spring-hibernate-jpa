package com.huawei.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.shop.model.AdminModel;
import com.huawei.shop.repository.AdminDao;

@Service
public class AdminService
{
	@Autowired
	private AdminDao adminDao;
	
	public AdminModel getUserPassword(String name) {
	    return adminDao.getUserPassword(name);
	  }
}

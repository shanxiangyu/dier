package com.atguigu.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.dao.AdminMapper;
import com.atguigu.springboot.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;
	
	@Override
	public TAdmin getAdminById(Integer id) {
		
		return adminMapper.getAdminById(id);
	}

}

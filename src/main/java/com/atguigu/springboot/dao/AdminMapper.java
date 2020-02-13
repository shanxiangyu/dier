package com.atguigu.springboot.dao;

import org.apache.ibatis.annotations.Select;

import com.atguigu.springboot.bean.TAdmin;

public interface AdminMapper {

	@Select("SELECT * FROM `t_admin` WHERE id=#{id}")
	public TAdmin getAdminById(Integer id);
}

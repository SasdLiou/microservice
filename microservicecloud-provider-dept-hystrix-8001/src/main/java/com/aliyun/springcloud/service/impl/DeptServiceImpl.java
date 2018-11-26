package com.aliyun.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyun.springcloud.dao.DeptDao;
import com.aliyun.springcloud.entities.Dept;
import com.aliyun.springcloud.service.DeptService;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/25
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}

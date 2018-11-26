package com.aliyun.springcloud.service;

import com.aliyun.springcloud.entities.Dept;

import java.util.List;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/25
 */
public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}

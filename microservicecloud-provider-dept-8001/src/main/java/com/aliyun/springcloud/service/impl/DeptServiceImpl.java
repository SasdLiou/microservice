package com.aliyun.springcloud.service.impl;

import com.aliyun.springcloud.dao.DeptDao;
import com.aliyun.springcloud.entities.Dept;
import com.aliyun.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/23
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

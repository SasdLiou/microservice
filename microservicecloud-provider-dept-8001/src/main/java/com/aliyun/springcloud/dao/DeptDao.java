package com.aliyun.springcloud.dao;

import com.aliyun.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * ...
 *
 * @author Bob
 * @date 2018/11/23
 */

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

package com.aliyun.springcloud.service;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/23
 */
import com.aliyun.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}

package com.nb.service.impl;

import com.nb.mapper.DeptMapper;
import com.nb.pojo.Dept;
import com.nb.service.DeptService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/4/5 22:45
 * @Version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;


    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept queryById(Long deptNo) {
        Dept dept=deptMapper.queryById(deptNo);
        return dept;
    }

    public List<Dept> queryAll() {
        List<Dept> depts = deptMapper.queryAll();

        return depts;
    }
}

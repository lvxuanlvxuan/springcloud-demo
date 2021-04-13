package com.nb.service;

import com.nb.pojo.Dept;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/4/5 22:44
 * @Version 1.0
 */
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();

}

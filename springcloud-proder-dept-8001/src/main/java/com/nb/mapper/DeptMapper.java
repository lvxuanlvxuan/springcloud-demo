package com.nb.mapper;

import com.nb.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/4/5 22:02
 * @Version 1.0
 */
@Repository
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept queryById(Long deptNo);

    List<Dept> queryAll();
}

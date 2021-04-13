package com.nb.controller;

import com.nb.pojo.Dept;
import com.nb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/4/5 23:04
 * @Version 1.0
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("/add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{deptNo}")
    public Dept queryById(@PathVariable("deptNo") Long deptNo){
        return deptService.queryById(deptNo);
    }

    @GetMapping("/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }
}

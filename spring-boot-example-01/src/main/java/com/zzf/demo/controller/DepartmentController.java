package com.zzf.demo.controller;

import com.zzf.demo.mapper.DepartmentMapper;
import com.zzf.demo.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DepartmentController {

    @Resource
    public DepartmentMapper departmentMapper;

    @ResponseBody
    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return departmentMapper.getDepartmentById(id);
    }

    @ResponseBody
    @GetMapping("/dept")
    public Department addDept(Department department){
        departmentMapper.insertDepartment(department);
        return department;
    }
}

package com.zzf.demo.controller;

import com.zzf.demo.dao.DepartmentDao;
import com.zzf.demo.dao.EmployeeDao;
import com.zzf.demo.entities.Department;
import com.zzf.demo.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    //获取员工列表
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps", all);
        return "emp/list";
    }

    //显示员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "/emp/add";
    }

    //员工添加
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("参数："+employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    //员工修改页面
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model)
    {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        logger.debug("to edit page."+employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "/emp/add";
    }

    @PutMapping("/emp")
    public String empModify(Employee employee){
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}

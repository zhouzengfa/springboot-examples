package com.zzf.demo.mapper;

import com.zzf.demo.entities.Employee;

public interface EmployeeMapper {

    Employee getEmpById(Integer id);
    void addEmp(Employee employee);
}

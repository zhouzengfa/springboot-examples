package com.zzf.demo;

import com.zzf.demo.entities.Department;
import org.apache.ibatis.annotations.*;

// 指定一个操作数据库的Mapper
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDepartmentById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert department(departmentName) value(#{departmentName})")
    int insertDepartment(Department department);


    @Delete("delete from department where id=#{id}")
    int deleteDepartmentById(Integer id);
}

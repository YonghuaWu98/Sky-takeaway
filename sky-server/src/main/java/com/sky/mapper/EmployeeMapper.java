package com.sky.mapper;

import com.sky.dto.EmployeeDTO;
import com.sky.entity.Employee;
import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 添加员工
     * @param employee
     * @return void
     **/
//    @Insert("insert into employee()")
    int addEmployee(Employee employee);

    /**
     * 分页查询员工信息
     * @param: name
     * @param: page
     * @param: pageSize
     * @return: List<Employee>
     **/
    List<Employee> queryEmployeeByPage(String name, int page, int pageSize);

    /**
     * 查询所有员工信息
     * @return: long
     **/
    long queryAllEmployee();
    
    /* 根据员工id更改员工状态
     * @param: status
     * @param: id
     * @return: void
     **/
    void setStatusById(Integer status, Long id);
}

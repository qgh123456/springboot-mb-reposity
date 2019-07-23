package com.atqgh.springboot.service;

import com.atqgh.springboot.bean.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:15 2019/7/23
 * @Modified By:
 **/
public interface EmployeeService {

    public Employee getEmployeeByid(Integer id);

    public void  insertEmployee(Employee employee);

    int findByName(@Param("email") String email, @Param("lastName") String lastName);
}

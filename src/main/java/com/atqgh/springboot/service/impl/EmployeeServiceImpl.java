package com.atqgh.springboot.service.impl;

import com.atqgh.springboot.bean.Employee;
import com.atqgh.springboot.mapper.EmployeeMapper;
import com.atqgh.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:15 2019/7/23
 * @Modified By:
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public Employee getEmployeeByid(Integer id) {
        return employeeMapper.getEmployeeByid(id);
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }

    @Override
    public int findByName(String email, String lastName) {
        return employeeMapper.findByName(email,lastName);
    }
}

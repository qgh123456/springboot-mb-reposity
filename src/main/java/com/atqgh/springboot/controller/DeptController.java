package com.atqgh.springboot.controller;

import com.atqgh.springboot.bean.Department;
import com.atqgh.springboot.bean.Employee;
import com.atqgh.springboot.service.DepartmentService;
import com.atqgh.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 23:47 2019/4/24
 * @Modified By:
 **/
@Controller
public class DeptController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/dept/{id}")
    @ResponseBody
    public Department getDepartMent(@PathVariable("id") Integer id){
        return departmentService.getDeptById(id);
    }

    @GetMapping("/dept")
    @ResponseBody
    public Department insertDept(Department department){
        departmentService.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmpById(@PathVariable("id") Integer id){
        Employee employee = employeeService.getEmployeeByid(id);
        return employee;
    }

    @GetMapping("/er")
    @ResponseBody
    public int getEmpById2(){
        return employeeService.findByName("","ming");
    }

}

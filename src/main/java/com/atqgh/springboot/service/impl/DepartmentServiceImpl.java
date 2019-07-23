package com.atqgh.springboot.service.impl;

import com.atqgh.springboot.bean.Department;
import com.atqgh.springboot.mapper.DepartmentMapper;
import com.atqgh.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:13 2019/7/23
 * @Modified By:
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public Department getDeptById(Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @Override
    public Integer deleteDeptByid(Integer id) {
        return departmentMapper.deleteDeptByid(id);
    }

    @Override
    public Integer insertDept(Department department) {
        return departmentMapper.insertDept(department);
    }

    @Override
    public Integer updateDept(Department department) {
        return departmentMapper.updateDept(department);
    }
}

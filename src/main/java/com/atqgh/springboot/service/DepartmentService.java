package com.atqgh.springboot.service;

import com.atqgh.springboot.bean.Department;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 11:12 2019/7/23
 * @Modified By:
 **/
public interface DepartmentService {

    public Department getDeptById(Integer id);

    public Integer deleteDeptByid(Integer id);

    public Integer insertDept(Department department);

    public Integer updateDept(Department department);

    public void testDepartment(int num);
}

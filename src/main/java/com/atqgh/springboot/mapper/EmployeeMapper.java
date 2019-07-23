package com.atqgh.springboot.mapper;

import com.atqgh.springboot.bean.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 22:36 2019/4/25
 * @Modified By:
 **/
public interface EmployeeMapper {

    public Employee getEmployeeByid(Integer id);

    public void  insertEmployee(Employee employee);

    int findByName(@Param("email") String email, @Param("lastName") String lastName);
}

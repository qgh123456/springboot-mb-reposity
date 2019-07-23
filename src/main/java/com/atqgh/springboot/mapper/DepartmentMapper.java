package com.atqgh.springboot.mapper;

import com.atqgh.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 23:39 2019/4/24
 * @Modified By:
 **/
//指定这是一个mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public Integer deleteDeptByid(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name_) values(#{departmentName})")
    public Integer insertDept(Department department);

    @Update("update department set department_name_ = #{departmentName} where id=#{id}")
    public Integer updateDept(Department department);
}

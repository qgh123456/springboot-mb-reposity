package com.atqgh.springboot.bean;

import java.io.Serializable;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 23:36 2019/4/24
 * @Modified By:
 **/
public class Department implements Serializable {

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

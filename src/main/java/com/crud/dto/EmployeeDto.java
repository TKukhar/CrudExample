package com.crud.dto;

import com.crud.entity.Department;

public class EmployeeDto {
    private Integer id;
    private String name;
    private String active;
    private Department department;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer id, String name, String activel, Department department) {
        this.id = id;
        this.name = name;
        this.active = activel;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

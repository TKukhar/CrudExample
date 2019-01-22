package com.crud.entity;

public class Employee {

    private Integer id;
    private String name;
    private Integer active;
    private Integer department;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer active, Integer department) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

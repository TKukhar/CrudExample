package com.crud.dao;

import com.crud.entity.Employee;
import com.crud.dto.EmployeeDto;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    EmployeeDto getById(int id);

    List<EmployeeDto> findAll();

    void update(Employee employee);

    void delete(int id);



}

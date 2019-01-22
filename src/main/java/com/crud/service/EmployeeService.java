package com.crud.service;

import com.crud.entity.Employee;
import com.crud.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findAll();

    void save(Employee employee) throws Exception;

    EmployeeDto getById(int id);

    void update(Employee employee);

    void delete(int id);
}

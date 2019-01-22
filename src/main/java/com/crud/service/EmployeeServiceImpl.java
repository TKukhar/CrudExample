package com.crud.service;

import com.crud.dao.EmployeeDao;
import com.crud.entity.Employee;
import com.crud.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeDao employeeDao;

    public List<EmployeeDto> findAll() {
        return employeeDao.findAll();
    }

    public void save(Employee employee) throws Exception {
        employeeDao.save(employee);
    }

    public EmployeeDto getById(int id) {
        return employeeDao.getById(id);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    public void delete(int id) {
        employeeDao.delete(id);
    }
}

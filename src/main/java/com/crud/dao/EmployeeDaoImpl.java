package com.crud.dao;

import com.crud.entity.Employee;
import com.crud.dto.EmployeeDto;
import com.crud.mapper.EmployeeDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(Employee employee) {
        String sql = "INSERT INTO employees (empName, empActive, emp_dpId) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, employee.getName(), employee.getActive(), employee.getDepartment());
    }

    public EmployeeDto getById(int id) {
        String sql = "SELECT * FROM employees WHERE empId=?";
        return jdbcTemplate.queryForObject(sql, new EmployeeDtoMapper(), id);
    }

    public List<EmployeeDto> findAll() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new EmployeeDtoMapper());
    }

    public void update(Employee employee) {
        String sql = "UPDATE employees SET empName=?, empActive=?, emp_dpId=? WHERE empId=?";
        jdbcTemplate.update(sql, employee.getName(), employee.getActive(), employee.getDepartment(), employee.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM employees WHERE empId=?";
        jdbcTemplate.update(sql, id);

    }
}

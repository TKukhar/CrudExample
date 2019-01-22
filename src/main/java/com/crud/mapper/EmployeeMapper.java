package com.crud.mapper;

import com.crud.entity.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();

        employee.setId(resultSet.getInt("empId"));
        employee.setName(resultSet.getString("empName"));
        employee.setActive(resultSet.getInt("empActive"));
        employee.setDepartment(resultSet.getInt("emp_dpId"));

        return employee;
    }
}

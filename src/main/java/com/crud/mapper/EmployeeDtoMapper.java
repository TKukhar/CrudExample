package com.crud.mapper;

import com.crud.dao.DepartmentDao;
import com.crud.dao.DepartmentDaoImpl;
import com.crud.dto.EmployeeDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDtoMapper implements RowMapper<EmployeeDto> {

    public EmployeeDto mapRow(ResultSet resultSet, int i) throws SQLException {
        EmployeeDto employeeDto = new EmployeeDto();
        DepartmentDao departmentDao = new DepartmentDaoImpl();

        employeeDto.setId(resultSet.getInt("empId"));
        employeeDto.setName(resultSet.getString("empName"));
        Boolean active = resultSet.getBoolean("empActive");
        if (active) {
            employeeDto.setActive("yes");
        } else {
            employeeDto.setActive("no");
        }
        employeeDto.setDepartment(departmentDao.getById(resultSet.getInt("emp_dpId")));

        return employeeDto;
    }
}



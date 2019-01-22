package com.crud.dao;

import com.crud.config.SpringConfig;
import com.crud.entity.Department;
import com.crud.mapper.DepartmentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    private SpringConfig springConfig;
    private JdbcTemplate jdbcTemplate;

    public DepartmentDaoImpl() {
        springConfig = new SpringConfig();
        jdbcTemplate = new JdbcTemplate(springConfig.getDataSource(), false);
    }

    public Department getById(int id) {
        String sql = "SELECT * FROM departments WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new DepartmentMapper(), id);
    }
}


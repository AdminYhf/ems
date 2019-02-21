package com.yhf.service;

import com.yhf.entity.Employee;

public interface EmployeeService {
    Employee selectByPrimaryKey(Integer id);
}

package com.dao;

import com.entity.Employee;

public interface EmployeeDAO extends DAO<Employee> {
	Employee get(int id);
}

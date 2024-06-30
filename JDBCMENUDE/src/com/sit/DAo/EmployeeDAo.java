package com.sit.DAo;

import com.sit.entity.Employee;

public interface EmployeeDAo extends DAO<Employee> {
	Employee get(int id);
}

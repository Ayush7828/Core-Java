package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.entity.Employee;

import utils.JDBCutils;

public class EmployeeDAoIMP implements EmployeeDAO {

	@Override
	public void save(Employee object) {
		Connection conn = null;
		PreparedStatement stm = null;
		try {

			String Query = "INSERT INTO employee(id,name,age,salaray) VALUES( ?, ? , ?, ?)";

			conn = JDBCutils.createConnection();
			stm = conn.prepareStatement(Query);

			stm.setInt(1, 1);
			stm.setString(2, "KARAN");
			stm.setInt(3, 25);
			stm.setDouble(4, 25000);

			int row = stm.executeUpdate();
			if (row > 0) {
				System.out.println("Data Insert");
			} else {
				System.out.println("Data Not Insert");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			JDBCutils.closeConnections();
		}
	}

	@Override
	public void update(Employee object) {
		Connection conn = null;
		PreparedStatement stm = null;
		try {

			String Query = "UPDATE  employee set salaray = ? WHERE id = ?";

			conn = JDBCutils.createConnection();
			stm = conn.prepareStatement(Query);

			stm.setInt(1, 1);
			stm.setDouble(2, 60000);

			int row = stm.executeUpdate();
			if (row > 0) {
				System.out.println("Data Updated");
			} else {
				System.out.println("Data Not Updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			JDBCutils.closeConnections();
		}

	}

	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

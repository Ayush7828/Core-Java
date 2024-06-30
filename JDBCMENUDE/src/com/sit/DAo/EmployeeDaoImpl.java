package com.sit.DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sit.entity.Employee;

import utils.JDBCutils;

public class EmployeeDaoImpl implements EmployeeDAo {

	@Override
	public void save(Employee object) {
		Connection con = null;
		PreparedStatement stm = null;

		try {
			String Query = "insert into employee(name , age , salary) values (? , ? , ?)";

			con = JDBCutils.createConnection();

			// stm = con.createStatement();

			stm = con.prepareStatement(Query);
			stm.setString(1, object.getName());
			stm.setInt(2, object.getAge());
			stm.setDouble(3, object.getSalary());

			int row = stm.executeUpdate();

			if (row > 0) {
				System.out.println("data insert");
			} else {
				System.out.println("data not inserted");
			}
			// ResultSet executeQuery() - select , int executeUpdate() - create , drop ,
			// insert , update, delete , alter

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutils.closeConnections();
		}
	}

	@Override
	public void update(Employee object) {
		Connection con = null;
		PreparedStatement stm = null;

		try {
			String Query = "update employee set salary = ? where id=?";
			con = JDBCutils.createConnection();

			// stm = con.createStatement();

			stm = con.prepareStatement(Query);
			stm.setDouble(1, object.getSalary());
			stm.setInt(2, object.getId());

			int row = stm.executeUpdate();

			if (row > 0) {
				System.out.println("data updated");
			} else {
				System.out.println("data not updated");
			}
			// ResultSet executeQuery() - select , int executeUpdate() - create , drop ,
			// insert , update delete , alter

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutils.closeConnections();
		}

	}

	@Override
	public void delete(int id) {
		Connection con = null;
		PreparedStatement stm = null;

		try {
			String Query = "delete from employee where id=?";
			con = JDBCutils.createConnection();

			// stm = con.createStatement();

			stm = con.prepareStatement(Query);
			stm.setInt(1, id);

			int row = stm.executeUpdate();

			if (row > 0) {
				System.out.println("data deleted");
			} else {
				System.out.println("data not deleted");
			}
			// ResultSet executeQuery() - select , int executeUpdate() - create , drop ,
			// insert , update delete , alter

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutils.closeConnections();
		}

	}

	@Override
	public List<Employee> fecth() {
		Connection con = null;
		PreparedStatement stm = null;
		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			String Query = "select * from employee";
			con = JDBCutils.createConnection();

			// stm = con.createStatement();

			stm = con.prepareStatement(Query);

			ResultSet result = stm.executeQuery();

			while (result.next()) {
				Employee ee = new Employee();
				ee.setId(result.getInt("id"));
				ee.setName(result.getString("name"));
				ee.setAge(result.getInt("age"));
				ee.setSalary(result.getDouble("salary"));
				employeeList.add(ee);
				// System.out.println(result.getString("name"));
				// System.out.println(result.getInt("age"));
				// System.out.println(result.getDouble("salary"));
				// System.out.println("--------------------------------");
			}

			// ResultSet executeQuery() - select , int executeUpdate() - create , drop ,
			// insert , update delete , alter

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCutils.closeConnections();
		}

		return employeeList;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

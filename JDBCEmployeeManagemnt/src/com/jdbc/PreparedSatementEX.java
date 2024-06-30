package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedSatementEX {

	void insertdata() {
		try {
			String url = "jdbc:mysql://localhost:3306/employeedatabase";
			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO employee(eid, ename, age) VALUES (?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 101);
			pstmt.setString(2, "Shivam");
			pstmt.setInt(3, 25);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted successfully.");
			} else {
				System.out.println("Failed to insert data.");
			}

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void readdata() {
		try {
			String url = "jdbc:mysql://localhost:3306/employeedatabase";
			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM employee";
			Statement tsm = conn.createStatement();

			ResultSet rs = tsm.executeQuery(query);
			while (rs.next()) {
				System.out.println("ID " + rs.getInt(1));
				System.out.println("name " + rs.getString(2));
				System.out.println("marks" + rs.getInt(3));
			}
			System.out.println("Read succesfully= ");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void updatedata() {
		try {
			String url = "jdbc:mysql://localhost:3306/employeedatabase";
			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "update employee set ename=? where eid=?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, "Ayush");
			pstmt.setInt(2, 101);

			int rowsAffected = pstmt.executeUpdate();

			System.out.println(rowsAffected + " records affected");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

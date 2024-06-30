package com.jdbclearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	public void createdatabase() {
		try {
			String url = "jdbc:mysql://localhost:3306";

			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();

			String query = "CREATE DATABASE myJavadb";

			System.out.println("Databases Created Suceesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createtable() {
		try {
			String url = "jdbc:mysql://localhost:3306/myJavadb";

			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();

			String query1 = "CREATE TABLE studentrecords  (sid INT ,sname VARCHAR(255) ,smarks INT)";
			stm.execute(query1);
			System.out.println("Create table succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void showdata() {

		try {
			String url = "jdbc:mysql://localhost:3306/myJavadb";

			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stm = conn.createStatement();

			String query1 = "DESC studentrecords";
			stm.execute(query1);
			System.out.println("show table table succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createdata() {
		try {
			String url = "jdbc:mysql://localhost:3306/myJavadb";

			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query1 = "INSERT INTO studentrecords(sid,sname,smarks) VALUES(?,?,?)";
			PreparedStatement ptsm = conn.prepareStatement(query1);
			ptsm.setInt(1, 103);
			ptsm.setString(2, "Shivam");
			ptsm.setInt(3, 79);

			ptsm.executeUpdate();
//			ptsm.execute();
			System.out.println("Data Insert  succesfully");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void readdata() {
		try {
			String url = "jdbc:mysql://localhost:3306/myJavadb";

			String username = "root";
			String password = "root123";

			Connection conn = DriverManager.getConnection(url, username, password);
			String query1 = "SELECT * FROM studentrecords";
			Statement tsm = conn.createStatement();

			ResultSet rs = tsm.executeQuery(query1);
			while (rs.next()) {
				System.out.println("ID " + rs.getInt(1));
				System.out.println("name " + rs.getString(2));
				System.out.println("marks" + rs.getInt(3));
			}
			System.out.println("Read succesfully= ");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

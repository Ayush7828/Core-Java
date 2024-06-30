package com.entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Employee {

	void createconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);
			if (connection.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection is Created");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void createtable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

			String q = "CREATE TABLE employee(eid INT PRIMARY KEY AUTO_INCREMENT ,ename VARCHAR(255),ecity VARCHAR(255) )";

			Statement statement = connection.createStatement();

			statement.executeUpdate(q);
			System.out.println("Created Table suceessfully ");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	void inserdatatable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

			String q = "INSERT INTO employee(eid,ename,ecity) VALUES(?,?,? )"; // parameterzied Query

//			get the perpared statement object 
			PreparedStatement pstatement = connection.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a employe name  ");
			String ename = br.readLine();

			System.out.println("Enter a employe city ");
			String ecity = br.readLine();
			pstatement.setInt(1, 2);
			pstatement.setString(2, ename);
			pstatement.setString(3, ecity);

			pstatement.executeUpdate();
			System.out.println("Data insert  suceessfully ");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}

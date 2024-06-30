package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/schooldb";
			String username = "root";
			String password = "root123";

			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "create table schools(id INT PRIMARY KEY AUTO_INCREMENT,name varchar(255))";

			PreparedStatement statement = connection.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("Created Table suceessfully ");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("Driver class Load sucessfully");
	}
}

package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/schooldb";
		String username = "root";
		String password = "root123";

		Connection connection = DriverManager.getConnection(url, username, password);

		String query = " select * from schools";

		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet executeQuery = statement.executeQuery();
		while (executeQuery.next()) {
			int id = executeQuery.getInt(1);
			String name = executeQuery.getString(2);
			System.out.println(id + " " + name);
		}

	}
}

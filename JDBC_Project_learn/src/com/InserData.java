package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/schooldb";
		String username = "root";
		String password = "root123";

		Connection connection = DriverManager.getConnection(url, username, password);

		String query = " INSERT INTO schools(id,name) VALUES(?,?)";

		PreparedStatement statement = connection.prepareStatement(query);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter school name");
		String snmae = br.readLine();

		statement.setInt(1, 101);
		statement.setString(2, snmae);
		statement.executeUpdate();
		System.out.println("Data insert  suceessfully ");

	}
}

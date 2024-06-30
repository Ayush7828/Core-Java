package com.entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection();
	}

}

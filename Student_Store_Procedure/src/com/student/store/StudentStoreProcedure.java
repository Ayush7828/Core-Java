package com.student.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class StudentStoreProcedure {
	void insertdata() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/store_procedure";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

//			CallableStatement cs = connection.prepareCall("{call insert_data(?,?,?,?)      }");

			CallableStatement cs = (CallableStatement) connection.prepareCall("{call new_procedure(?,?,?,?)  }");

			cs.setInt(1, 102);
			cs.setString(2, "Tushar");
			cs.setString(3, "gun@gmail.com");
			cs.setString(4, "Bhopal");
			cs.execute();

			System.out.println("Data Insert Sceesfully Created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void UpdateData() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/store_procedure";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

//			CallableStatement cs = connection.prepareCall("{call insert_data(?,?,?,?)      }");

			CallableStatement cs = (CallableStatement) connection.prepareCall("{call update_procedure(?,?)  }");

			cs.setInt(1, 101);
			cs.setString(2, "bham");
//			cs.setString(3, "singh@gmail.com");
//			cs.setString(4, "indore");
			cs.execute();

			System.out.println("Data Update Sceesfully Created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void deletdata() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/store_procedure";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

			CallableStatement cs = (CallableStatement) connection.prepareCall("{call delet_procedure(?)  }");
			cs.setInt(1, 102);
			cs.execute();

			System.out.println("Data Deleted Sceesfully Created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void readdata() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/store_procedure";
			String username = "root";
			String password = "root123";
			Connection connection = DriverManager.getConnection(url, username, password);

			CallableStatement cs = (CallableStatement) connection.prepareCall("{call select_procedure(?,?,?,?)  }");
			cs.execute();
			ResultSet rs = cs.getResultSet();
			while (rs.next()) {
				int col = rs.getInt(101);
				String col2 = rs.getString(2);
				String col3 = rs.getString(3);
				String col4 = rs.getString(4);
			}

			System.out.println(" Sceesfully Read");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package insertimagedb;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageJDBC {

	void insertimage() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/imagedb";

			String username = "root";
			String password = "root123";

			Connection connection = DriverManager.getConnection(url, username, password);
			String quer = "INSERT INTO images(pic) VALUES(?)";
			PreparedStatement ptst = connection.prepareStatement(quer);

			FileInputStream frs = new FileInputStream("D:\\Eclipse\\ProjectJDBC\\src\\insertimagedb\\passport_pic.jpg");

			ptst.setBinaryStream(1, frs, frs.available());
			ptst.executeUpdate();
			System.out.println("Image Insert In database");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

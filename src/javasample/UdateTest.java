package javasample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UdateTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/sample?serverTimezone=UTC&useSSL=false";
			String user = "student";
			String pass = "himitu";

			Connection con = DriverManager.getConnection(url,user,pass);

			String sql = "UPDATE emp SET age=27 WHERE code=1";

			PreparedStatement st = con.prepareStatement(sql);

			int rows = st.executeUpdate();
			System.out.println(rows + "件、レコードを変更しました。");

			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

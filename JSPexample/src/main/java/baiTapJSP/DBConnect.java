package baiTapJSP;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private final String serverName = "NHUQUYNH";
	private final String dbName = "LTweb56";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "QuynhLTwin";
	private final String password = "06102005";

	// Kết nối SQL Server với Windows Authentication
//	public Connection getConnection() throws Exception {
//		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber
//				+ ";encrypt=true;trustServerCertificate=true;databaseName=" + dbName;
//		if (instance == null || instance.trim().isEmpty())
//			url = "jdbc:sqlserver://" + serverName + ":" + portNumber
//					+ ";encrypt=true;trustServerCertificate=true;databaseName=" + dbName;
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		return DriverManager.getConnection(url);
//	}

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber
				+ ";encrypt=true;trustServerCertificate=true;databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber
					+ ";encrypt=true;trustServerCertificate=true;databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

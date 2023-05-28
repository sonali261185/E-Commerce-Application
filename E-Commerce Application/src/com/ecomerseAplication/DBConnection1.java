package com.ecomerseAplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1{
	public static Connection getcon() {
		Connection con=null;
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/Onlineshopping?characterEncoding=utf8"; 

				String username="root";
				String password="sampada@123";
				con=DriverManager.getConnection(url, username, password);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
	}
	}




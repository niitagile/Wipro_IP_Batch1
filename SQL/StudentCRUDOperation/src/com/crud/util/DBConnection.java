package com.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con=null;

	public static Connection	getConnection() {
		
		//Step 1 : load Driver in memory
		try {
			//to call Class loader to load class in memory at dymanic time
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			//Step 2: Database information 
			if(con==null)
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cred", "root","Comnet@123");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}

}

package com.qa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qa.base.TestBase;

public class DatabaseConnectionManager extends TestBase {

    Connection con;
    Statement st;
    ResultSet rs;
	
	public ResultSet retrieveResult(String query) throws ClassNotFoundException, SQLException {
		
		Class.forName(prop.getProperty("driver"));
		Connection con = DriverManager.getConnection(prop.getProperty("dbConnectionUrl"), prop.getProperty("dbUsername"), prop.getProperty("dbPassword"));
		st = con.createStatement();
	    rs = st.executeQuery(query);
	    return rs;
	}
	
	public void closeConnection() throws SQLException {
		st.close();
		if(con!=null)
		con.close();
	}
}

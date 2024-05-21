package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.model.Demo;
import com.chainsys.util.JdbcConnection;

public class DemoImplementation implements DemoInterface
{
	Demo demo = new Demo();

	@Override
	public void saveDetails(Demo demo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection getConnection = JdbcConnection.getConnection();
		String insert = "insert into demo (name, emailID, phoneNumber ) values (?,?,?)";
		PreparedStatement preparedStatement = getConnection.prepareStatement(insert);
		preparedStatement.setString(1, demo.getName());
		preparedStatement.setString(2, demo.getEmailID());
		preparedStatement.setString(3, demo.getPhoneNumber());
		preparedStatement.executeUpdate();
		
	}
	

}

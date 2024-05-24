package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.model.Demo;
import com.chainsys.util.JdbcConnection;

public class DemoImplementation implements DemoInterface
{
	static String name;
	static Scanner scan = new Scanner(System.in);
	Demo demo = new Demo();
	@SuppressWarnings("unused")
	private List<Demo> list = new ArrayList<Demo>();
	ArrayList<String> nameCheck = new ArrayList<String>();


	@Override
	public void saveDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		Connection getConnection = JdbcConnection.getConnection();
		String insert = "insert into demo (name, emailID, phoneNumber ) values (?,?,?)";
		PreparedStatement preparedStatement = getConnection.prepareStatement(insert);
		preparedStatement.setString(1, demo.getName());
		preparedStatement.setString(2, demo.getEmailID());
		preparedStatement.setString(3, demo.getPhoneNumber());
		preparedStatement.executeUpdate();
		
	}

	@Override
	public List<Demo> retriveDetails(Demo demo) throws ClassNotFoundException, SQLException 
	{
		ArrayList<Demo> al = new ArrayList<Demo>();
		try
		{
			Connection getConnection = JdbcConnection.getConnection();
			String retrive = "select name, emailID, phoneNumber from demo";
			PreparedStatement preparedStatement = getConnection.prepareStatement(retrive);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Demo demo1 = new Demo();
				demo1.setName(resultSet.getString(1));
				demo1.setEmailID(resultSet.getString(2));
				demo1.setPhoneNumber(resultSet.getString(3));
				al.add(demo1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return al;
	}

	
	@Override
	public void deleteDetails(Demo demo) throws ClassNotFoundException, SQLException
	{
			Connection getConnection = JdbcConnection.getConnection();
			String delete = "delete from demo where name=?";
			PreparedStatement prepareStatement2 = getConnection.prepareStatement(delete);
			prepareStatement2.setString(1, demo.getName());
			prepareStatement2.executeUpdate();
	}

	
	
	@Override
	public void updateDetails(Demo demo) throws SQLException, ClassNotFoundException 
	{
				Connection getConnection = JdbcConnection.getConnection();

				String update = "update demo set phoneNumber = ?, emailID= ? where name =?";
				PreparedStatement prepareStatement1 = getConnection.prepareStatement(update);
				
				prepareStatement1.setString(1, demo.getPhoneNumber());
				prepareStatement1.setString(2, demo.getEmailID());
				prepareStatement1.setString(3, demo.getName());
				
				int executeUpdate = prepareStatement1.executeUpdate();
				System.out.println(executeUpdate);
	}

	

	

	

	

	

}

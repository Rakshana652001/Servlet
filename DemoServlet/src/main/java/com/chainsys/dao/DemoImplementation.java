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
	private List<Demo> list = new ArrayList<Demo>();
	static DemoImplementation demoImplementation = new DemoImplementation();

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
				list.add(demo1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
		
	}

	
	@Override
	public List<Demo> deleteDetails(Demo demo) throws ClassNotFoundException, SQLException
	{
			Connection getConnection = JdbcConnection.getConnection();
			System.out.println("Enter the Name to delete: ");
			name = scan.next();
			String selectName = "select name from demo";
			PreparedStatement prepareStatement = getConnection.prepareStatement(selectName);
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next())
			{
				String delete = "delete from demo where name=?";
				PreparedStatement prepareStatement2 = getConnection.prepareStatement(delete);
				prepareStatement2.setString(1, name);
				prepareStatement2.executeUpdate();
			
			}
			System.out.println("\nDeleted successfully.");
			return list;
	}

	
	@Override
	public List<Demo> updateDetails(Demo demo) throws SQLException, ClassNotFoundException 
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter your Name for update: ");
		name = scan.next();
		String selectName = "select name from demo";
		PreparedStatement prepareStatement = getConnection.prepareStatement(selectName);
		ResultSet resultSet = prepareStatement.executeQuery();
		System.out.println("Enter Changing phoneNumber: ");
		String numberChange = scan.next();
		while(resultSet.next())
		{
			
			String update = "update demo set phoneNumber = ? where name =?";
			PreparedStatement prepareStatement1 = getConnection.prepareStatement(update);
			prepareStatement1.setString(1, numberChange);
			prepareStatement1.setString(2, name);
			prepareStatement1.executeUpdate();
		
		}
		System.out.println("\nUpdated successfully.");
		
		return list;
	}

	@Override
	public void nameCheck() throws ClassNotFoundException, SQLException
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter your Name: ");
		name = scan.next();
			
			String selectName = "select name from demo";
			PreparedStatement prepareStatement = getConnection.prepareStatement(selectName);
			ResultSet resultSet = prepareStatement.executeQuery();
			while(resultSet.next())
			{
				demo.setName(name);
				demo.getName();
				list.add(demo);
			}
		
	}

}

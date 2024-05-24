package com.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import com.chainsys.model.Demo;

public interface DemoInterface 
{
	void saveDetails(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> retriveDetails(Demo demo)throws ClassNotFoundException, SQLException;
	void deleteDetails(Demo demo) throws ClassNotFoundException, SQLException;
	void updateDetails(Demo demo) throws SQLException, ClassNotFoundException;
}

package com.chainsys.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.Demo;

public interface DemoInterface 
{
	void saveDetails(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> retriveDetails(Demo demo)throws ClassNotFoundException, SQLException;
	List<Demo> deleteDetails(Demo demo) throws ClassNotFoundException, SQLException;
	List<Demo> updateDetails(Demo demo) throws SQLException, ClassNotFoundException;
	void nameCheck() throws ClassNotFoundException, SQLException;
}

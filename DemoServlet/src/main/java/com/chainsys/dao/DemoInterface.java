package com.chainsys.dao;

import java.sql.SQLException;

import com.chainsys.model.Demo;

public interface DemoInterface 
{
	void saveDetails(Demo demo) throws ClassNotFoundException, SQLException;

}

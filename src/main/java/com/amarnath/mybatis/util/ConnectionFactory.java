package com.amarnath.mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *	ConnectionFactory will create SQLSessionFactory for us using the database-config.xml. 
 *
 */
public class ConnectionFactory {
	private static SqlSessionFactory factory;
	
	static {
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader("database-config.xml");
		} catch (IOException ioe) {
			throw new RuntimeException(ioe.getMessage());
		}
		
		factory = new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return factory;
	}
}

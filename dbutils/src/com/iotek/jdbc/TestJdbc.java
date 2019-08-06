package com.iotek.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import oracle.jdbc.driver.OracleDriver;

import org.junit.Before;
import org.junit.Test;





public class TestJdbc {
	Properties prop=null;
	@Before
	public void testLoadFile(){
		 prop=new Properties();
		 try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
     @Test 
	public void testJoin() throws SQLException{
		
		Driver driver=new com.mysql.jdbc.Driver();  //mysql�������ľ���ʵ��
		Connection conn=driver.connect("jdbc:mysql://localhost:3306/iotek98", prop);
		System.out.println("conn="+conn);
	}
	/**
	 * ����Oracle
	 * @throws SQLException
	 */
     
      
// 	public void testJoin2() throws SQLException{
// 		
//		Driver driver=new OracleDriver();  //oracle �������ľ���ʵ�壬��û��Oracle��jar
// 		Connection conn=driver.connect("jdbc:oracle:thin:@localhost:1521:orcl", prop);
// 		System.out.println("conn="+conn);
// 	}
 	
}

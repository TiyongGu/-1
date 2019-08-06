package com.iotek.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCTools {
     public static String url;
     public static String user;
     public static String password;
     public static Properties prop;
     static{
    	 prop=new Properties();
    	 try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
			url=prop.getProperty("url");
			user=prop.getProperty("user");
			password=prop.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
     public static Connection getConnection(){
    	 
    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");//相当于就是new一个Driver（）；只是这里是用
//    		 反射class.forname(类的全称)来获取这个类，这种方式可以避免不同数据库的Driver重名
//    		 new Driver();
        	 Connection conn=DriverManager.getConnection(url,user,password);
        	 System.out.println("conn="+conn);
        	 return conn;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
    	 
    	
    	 
     }
     
}

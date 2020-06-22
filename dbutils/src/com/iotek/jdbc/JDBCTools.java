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
    	 //这里有很多乱码
    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");//�൱�ھ���newһ��Driver������ֻ����������
//    		 ����class.forname(���ȫ��)����ȡ����࣬���ַ�ʽ���Ա��ⲻͬ���ݿ��Driver����
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

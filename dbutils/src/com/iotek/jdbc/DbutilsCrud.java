package com.iotek.jdbc;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.iotek.entity.Animals;


/**
 * QueryRunner 是Dbutils核心对象:封装对数据库进行CRUD操作
 * @author Administrator
 *
 */
public class DbutilsCrud {
    private QueryRunner qr=new QueryRunner();
    private Connection conn;
  
    public void addAnimals(String name,float weight){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="insert into tb_animals (name,weight) values(?,?)";
        	
        	int count=qr.update(conn, sql, name,weight);
        	System.out.println("count="+count);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
    public void deleteAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="delete from tb_animals where id=?";
        	
        	int count=qr.update(conn, sql, 101);
        	System.out.println("count="+count);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    public void updateAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="update tb_animals set name=?,weight=? where id=?";
        	
        	int count=qr.update(conn, sql, "小白",5,100);
        	System.out.println("count="+count);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    /**
     * 返回一个对象--对应就是一条记录
     * BeanHandler对象
     */
    public void getAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="select id,name,weight from tb_animals where id=?";
        	
        	Animals animals=qr.query(conn, sql, new BeanHandler<Animals>(Animals.class), 100);
        	System.out.println("animals=="+animals);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    /**
     * 返回一个对象--对应就是一条记录
     * BeanListHandler对象--resultSets转换成List<bean>
     */
    public void getQueryAllAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="select id,name,weight from tb_animals";
        	
        	List<Animals> animalsList=(List<Animals>)qr.query(conn, sql, new BeanListHandler<Animals>(Animals.class));
        	System.out.println("animalsList=="+animalsList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    /**
     * 把一条记录转换成Map集合
     * MapHandler -
     */
    public void getQueryMapAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="select id,name,weight from tb_animals where id=?";
        	
        	 Map map=(Map)qr.query(conn, sql, new MapHandler(),100);
        	System.out.println("map=="+map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    
    
    /**
     * 把多条记录转换成List<Map>集合
     * MapListHandler -
     */
    public void getQueryListMapAnimals(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="select id,name,weight from tb_animals";
        	
        	 List<Map<String,Object>> listMap=(List<Map<String,Object>>)qr.query(conn, sql, new MapListHandler());
        	System.out.println("map=="+listMap);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
    /**
     * 查询出总记录数，并返回
     */
    public void getAnimalsCount(){
    	try {
    		conn=JDBCTools.getConnection();
        	String sql="select count(1) from tb_animals";
        	
        	 Number num=(Number)qr.query(conn, sql, new ScalarHandler<Number>());
        	System.out.println("num=="+num);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    }
}

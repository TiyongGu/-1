package com.iotek.jdbc;

import org.junit.Test;

public class TestDbutils {
	@Test
    public void testAddAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	for(int i=0;i<100;i++){
    	   curd.addAnimals("Ð¡»¨"+i,i+1);
    	}
    }
	
	@Test
    public void testDeleteAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.deleteAnimals();
    }
	
	@Test
    public void testUpdateAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.updateAnimals();
    }
	
	@Test
    public void testGetAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.getAnimals();
    }
	
	@Test
    public void testqueryAllAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.getQueryAllAnimals();
    }
	
	@Test
    public void testqueryMapAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.getQueryMapAnimals();
    }
	
	@Test
    public void testqueryListMapAnimals(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.getQueryListMapAnimals();
    }
	
	@Test
    public void getAnimalsCount(){
    	DbutilsCrud curd=new DbutilsCrud();
    	curd.getAnimalsCount();
    }
	
}

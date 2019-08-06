package com.iotek.entity;
//你是谁，你是阿拉蕾吗？
我想把你删除了哦！！
public class Animals {
     private Integer id;
     private String name;
     private float weight;
     public Animals() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animas [id=" + id + ", name=" + name + ", weight=" + weight
				+ "]";
	}
     
}

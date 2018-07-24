package com.test.list.entity;

import java.sql.Date;

public class Test {

	private int id;
	private String name;
	private Date birthday;
	private int age;
	private int sex;
	private String hoppy;
	private String desciptdion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHoppy() {
		return hoppy;
	}
	public void setHoppy(String hoppy) {
		this.hoppy = hoppy;
	}
	public String getDesciptdion() {
		return desciptdion;
	}
	public void setDesciptdion(String desciptdion) {
		this.desciptdion = desciptdion;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", birthday=" + birthday
				+ ", age=" + age + ", sex=" + sex + ", hoppy=" + hoppy
				+ ", desciptdion=" + desciptdion + "]";
	}
	public Test(int id, String name, Date birthday, int age, int sex,
			String hoppy, String desciptdion) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.sex = sex;
		this.hoppy = hoppy;
		this.desciptdion = desciptdion;
	}
	
}

package edu.poly.manager.entity;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
	}

	public void init() {
		System.out.println("ham khoi tao");
	}

	public void destroy() {
		System.out.println("ham ket thuc");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

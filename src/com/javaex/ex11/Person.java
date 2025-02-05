package com.javaex.ex11;

public class Person {

	// 필드
	private String name;
	private int age;

	// 기본 생성자
	public Person() {

	}

	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드 gs
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.println("-----------------------");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("-----------------------");

	}
}

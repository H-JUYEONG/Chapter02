package com.javaex.ex03;

//클래스명
public class Goods {

	// 필드 - 보호한다(캡슐화)
	private String name;
	private int price;

	// 생성자

	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	// 정보출력
	public void showInfo() {
		System.out.println("상품이름 : " + this.name);
		System.out.println("가격 : " + this.price);
		System.out.println("--------------------");
	}

}

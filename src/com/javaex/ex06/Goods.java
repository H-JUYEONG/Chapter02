package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;

	/* 생성자
	 - 기본생성자는 코딩만 해도 생긴다. 
	 (다른생성자가 없을때)
	 - 다른 생성자를 코딩하면 기본생성자는 자동으로 만들어지지 않는다.
	 - 다른생성자가 있을때 기본생성자를 같이 쓰고 싶으면 기본생성자를 코딩해줘야한다. */
	public Goods() {
		// 메모리에 올리기
	}

	public Goods(String name, int price) {
		// 메모리에 올리기
		this.name = name;
		this.price = price;
	}

	// 메소드(setter, getter)
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

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}

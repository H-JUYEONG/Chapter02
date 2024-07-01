package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;

		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;

		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;

		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		System.out.println(camera.name);
		System.out.println(camera.price);

	}

}

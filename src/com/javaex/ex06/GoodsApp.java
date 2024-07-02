package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {


		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		Goods cup = new Goods("머그컵",2000);
//		computer.setName("LG그램");
//		computer.setPrice(1000000);
		
		System.out.println(cup.toString());

	}

}

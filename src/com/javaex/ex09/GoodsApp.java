package com.javaex.ex09;

public class GoodsApp {
	//static 조사 Goods counter

	public static void main(String[] args) {

		Goods computer = new Goods("LG그램", 1000000);
		System.out.println(computer.toString());
		System.out.println(computer.getCount());

		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		System.out.println(cup.getCount());
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		System.out.println(camera.getCount());

		System.out.println(Goods.count);
		
		showEnd();
	}

	public static void showEnd() {
		System.out.println("---------------------------");
		System.out.println("--      프로그램 종료       --");
		System.out.println("---------------------------");
	}
	
}

package com.javaex.ex13;

public class TVApp {

	public static void main(String[] args) {

		TV tv = new TV(7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(120); // 볼륨 범위 0~100
		tv.status();

		tv.volume(false);
		tv.status();

		tv.channel(0); // 채널 범위 1~255 --> 0이면 1로 설정
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();

	}

}

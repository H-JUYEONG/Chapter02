package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song iU = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		Song bigbang = new Song();
		Song busker = new Song();

//		iU.setTitle("좋은날");
//		iU.setArtist("아이유");
//		iU.setAlbum("Real");
//		iU.setComposer("이민수");
//		iU.setYear(2010);
//		iU.setTrack(3);

		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setComposer("G-DRAGON");
		bigbang.setYear(2007);
		bigbang.setTrack(2);

		busker.setTitle("벚꽃엔딩");
		busker.setArtist("버스커버스커");
		busker.setAlbum("버스커버스커1집");
		busker.setComposer("장범준");
		busker.setYear(2012);
		busker.setTrack(4);

		iU.showInfo();
		bigbang.showInfo();
		busker.showInfo();

		// System.out.println(iu.toString());

	}

}

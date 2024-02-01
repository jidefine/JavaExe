package ch08.class09.answer04;

public class Song {
	 private String title;     // 노래 제목
	 private String artist;    // 가수
	 private String album;     // 앨범 제목
	 private String composer;  // 작곡가
	 private int year;         // 발표 연도
	 private int track;        // 앨범에서의 트랙 번호
	 
	 //public으로 해줘야 다른 패키지에서 접근 가능
	 public void setSongInfo(String _title, String artist, String album, String composer, int year, int track) {
	     this.title = title;       // 노래 제목 설정
	     this.artist = artist;     // 가수 설정
	     this.album = album;       // 앨범 제목 설정
	     this.composer = composer; // 작곡가 설정
	     this.year = year;         // 발표 연도 설정
	     this.track = track;       // 앨범에서의 트랙 번호 설정
	 }
	 
	 void show() {
		 String strInfo =  "노래제목 : " + title + "\n" +
					"가수 : " + artist + "\n" +
					"앨범제목 : " + album + "\n" +
					"작곡가 : " + composer + "\n" +
					"발표 연도 : " + year + "\n" +
					"앨범 트랙 번호 : " + track + "\n";
			System.out.println(strInfo);	 
		 
	 }
}

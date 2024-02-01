package ch08.class09;

//Song 클래스: 노래 정보를 나타내는 클래스
public class Song {
 private String title;     // 노래 제목
 private String artist;    // 가수
 private String album;     // 앨범 제목
 private String composer;  // 작곡가
 private int year;         // 발표 연도
 private int track;        // 앨범에서의 트랙 번호

 // 메서드: 노래 정보를 설정하는 메서드
 public void setSongInfo(String _title, String _artist, String _album, String _composer, int _year, int _track) {
     title = _title;       // 노래 제목 설정
     artist = _artist;     // 가수 설정
     album = _album;       // 앨범 제목 설정
     composer = _composer; // 작곡가 설정
     year = _year;         // 발표 연도 설정
     track = _track;       // 앨범에서의 트랙 번호 설정
 }

 // 메서드: 노래 정보를 출력하는 메서드
 public void show() {
     System.out.println(artist + "의 \"" + title + "\" 노래");      // 가수와 노래 제목 출력
     System.out.println("앨범: " + album);                        // 앨범 제목 출력
     System.out.println("작곡가: " + composer);                   // 작곡가 출력
     System.out.println("발표 연도: " + year);                    // 발표 연도 출력
     System.out.println("앨범에서의 트랙 번호: " + track);        // 앨범에서의 트랙 번호 출력
 }

 // main 메서드: Song 클래스를 사용하는 예시를 보여주는 메서드
 public static void main(String[] args) {
     // Song 객체 생성
     Song dancingQueen = new Song();
     
     // 노래 정보 설정
     dancingQueen.setSongInfo("Dancing Queen", "ABBA", "Arrival", "Benny Andersson, Björn Ulvaeus", 1976, 3);
     
     // 노래 정보 출력
     dancingQueen.show();
 }
}

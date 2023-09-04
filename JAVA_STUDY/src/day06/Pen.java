package day06;

public class Pen {
		//클래스 안에 코드 작성
		// attrivute(속성-멤버변수) ,constuctors(생성자) methods(메서드)
	
	//멤버 변수
	public  String color; //패키지 상관없이 불러올 수있음 -public 
	int price; 			//같은 패키지 내에서 불러올 수있음 -default
	
	public void write() {
		System.out.println("Hello World!!");
	}
}

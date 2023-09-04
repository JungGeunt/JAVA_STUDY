package day07;

import java.nio.channels.Pipe;

public class Pen {
//	//멤버 변수 
	public String color;
	public int length	;
	int price;
	
	
	//필드 
	public Pen(String color, int length, int price) {
		super();
		this.color = color;
		this.length = length;
		this.price = price;
	}



	//게터 세터 
	
	public String getColor() { //반환값 전달
		return color;
	}

	public void setColor(String color) {//멤버변수에 칼라를 집어넣음
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	/*  ** 생성자는 반드시 클래스 안에 하나 이상 선언해야 합니다.
	 * 		만약 선언하지 않으면 JVM(JAVA Virtual Machine)이 대신해서 기본생성자를 자동으로 만들어줌. 
	 *  ** 기본 생성자느 매개변수를 가지지 않은 형태로 , 자동으로 만들어지는 경우 내용은 없음.
	 *  
	 * ***생성자를 만드는 규칙
	 * 		1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야 합니다.  
	 * 		  클래스 이름과 다른 이름으로 만들면 그것은 메서드 취급!!!!!		
	 * 		2. 생성자는 매서드와 달리 반환 유형을 적지 않습니다. 
	 * 		3. 생성자는 다른 유형으로 여러개 생성 가능합니다. (생성자 오버로딩)  
	 */
	
	
	
	
//	//생성자 ->접근 사용자는 사용가능 ->
//	
//	public Pen() {//기본 생성자!!
//			color ="black";
//		
//	}
//	//맴버 초기화 생성자!
//	public Pen(String init_color) {
//		color =init_color; 
//		System.out.println("생성자를 이용하여 color 값 초기화");
//	}
//	//멤버 초기화 생성자!
//	public Pen (String init_color, init_price) {
//		color =init_color; 
//		price = init_price;
//		System.out.println("생성자를 이용하여 color 값 초기화,price 값 초기화");
//	}
//	
//	
//	public void write() {
//		System.out.println("Hello World!!!");
//	}
//	
	
	
	
	
	
}

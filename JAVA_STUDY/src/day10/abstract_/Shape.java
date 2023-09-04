package day10.abstract_;

public abstract class Shape { // 추상클래스  ->객체를 생성 할 수 없음.
	
	private int x;
	private int y;
	
	public Shape( ){} // 오브젝트를 상속받음  //기본 생성자
	public Shape(int x , int y) {
		this.x = x;
		this.y = y;
	}
	public abstract double getArea(); //추상메서드 -구현되어 있지 않음. ->상속 받는 순간 구현해야 한다고 뜸
	
	public String position() {          
		return "[x=" +x+ ", y=" + y + "]" ;
	}

}
